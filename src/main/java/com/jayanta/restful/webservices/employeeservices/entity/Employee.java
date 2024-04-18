package com.jayanta.restful.webservices.employeeservices.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor(force = true)
@AllArgsConstructor
@ToString
@Entity
@Table(name = "EMPLOYEESDATA")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMPLOYEE_ID")
    private Long id;

    @Column(name = "FIRST_NAME")
    private String empFirstName;

    @Column(name = "LAST_NAME")
    private String empLastName;

    @Column(name = "EMAIL")
    private String empMail;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "HIRE_DATE")
    private LocalDate hireDate;

    @Column(name = "JOB_ID")
    private String jobId;

    @Column(name = "SALARY")
    private BigDecimal empSalary;

    @Column(name = "COMMISSION_PCT")
    private Double commPercent;

    @Column(name = "MANAGER_ID")
    private Long managerId;

    @Column(name = "DEPARTMENT_ID")
    private Long deptId;

}
