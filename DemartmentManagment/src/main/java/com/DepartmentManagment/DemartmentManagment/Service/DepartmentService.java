package com.DepartmentManagment.DemartmentManagment.Service;

import com.DepartmentManagment.DemartmentManagment.Entity.Department;

import java.util.List;

public interface DepartmentService {
    Department getDepartmentById(Long id);

    List<Department> getAllDepartments();

    Department createDepartment(Department department);
}
