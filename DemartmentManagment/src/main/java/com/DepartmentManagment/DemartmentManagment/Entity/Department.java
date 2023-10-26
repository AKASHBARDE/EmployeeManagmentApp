package com.DepartmentManagment.DemartmentManagment.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long deptId;
    private String departmentName;
    private String departmentDetails;
}

