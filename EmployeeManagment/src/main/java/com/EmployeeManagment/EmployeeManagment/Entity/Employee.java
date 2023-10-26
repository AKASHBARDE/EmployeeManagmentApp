package com.EmployeeManagment.EmployeeManagment.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name="employee_managment")
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String departmentName;
    private String projectname;
    private String emailId;

    @Transient
    private List<Project> projectList =new ArrayList<>();
}
