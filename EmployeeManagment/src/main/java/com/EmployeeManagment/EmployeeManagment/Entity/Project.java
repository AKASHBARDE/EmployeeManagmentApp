package com.EmployeeManagment.EmployeeManagment.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    private Long projectId;
    private String projectName;
    private String empId;
    private String projectDetails;
}
