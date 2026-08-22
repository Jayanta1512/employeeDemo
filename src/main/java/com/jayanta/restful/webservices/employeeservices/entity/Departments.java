package com.jayanta.restful.webservices.employeeservices.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor(force = true)
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "DEPARTMENTS")
public class Departments {
    @Id
    @Column(name = "DEPARTMENT_ID")
    private Long id;

    @Column(name = "DEPARTMENT_NAME")
    private String deptName;

    @Column(name = "MANAGER_ID")
    private int managerId;

    @OneToOne( cascade = CascadeType.ALL)
    @JoinColumn(name = "LOCATION_ID")
    private Location location;

    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
    private List<Employee> employees;
}
