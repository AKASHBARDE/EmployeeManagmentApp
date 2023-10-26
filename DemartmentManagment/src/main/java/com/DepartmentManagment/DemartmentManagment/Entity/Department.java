package com.DepartmentManagment.DemartmentManagment.Entity;


import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Departments")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long DeptId;
    private String DepartmentName;
    private String DepartmentDetails;
}

