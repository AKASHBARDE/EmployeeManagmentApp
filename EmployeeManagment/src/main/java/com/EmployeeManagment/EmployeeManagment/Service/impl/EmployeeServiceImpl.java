package com.EmployeeManagment.EmployeeManagment.Service.impl;

import com.EmployeeManagment.EmployeeManagment.Entity.Employee;
import com.EmployeeManagment.EmployeeManagment.Repository.EmployeeRepository;
import com.EmployeeManagment.EmployeeManagment.Service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private RestTemplate restTemplate;

    private Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);


    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Employee not found for this ID"));
        ArrayList forObject = restTemplate.getForObject("http://localhost:8081/project/2", ArrayList.class);
    logger.info("{}",forObject);
        return employee;
    }


    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {

       if (!employeeRepository.existsById(id)) {
            throw new EntityNotFoundException("Employee not found");
        }

       // employee.setId(id);
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        if (!employeeRepository.existsById(id)) {
            throw new EntityNotFoundException("Employee not found");
        }
        employeeRepository.deleteById(id);
    }
}