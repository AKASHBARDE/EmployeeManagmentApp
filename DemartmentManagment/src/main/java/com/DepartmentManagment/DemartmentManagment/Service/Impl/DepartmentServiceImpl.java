package com.DepartmentManagment.DemartmentManagment.Service.Impl;


import com.DepartmentManagment.DemartmentManagment.Entity.Department;
import com.DepartmentManagment.DemartmentManagment.Repository.DepartmentRepository;
import com.DepartmentManagment.DemartmentManagment.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;


    @Override
    public Department getDepartmentById(Long id) {
        Optional<Department> department = departmentRepository.findById(id);
        return department.orElse(null);
    }

    @Override
    public List<Department> getAllDepartments() {
       return departmentRepository.findAll();
    }

    @Override
    public Department createDepartment(Department department) {
        return departmentRepository.save(department);
    }
}
