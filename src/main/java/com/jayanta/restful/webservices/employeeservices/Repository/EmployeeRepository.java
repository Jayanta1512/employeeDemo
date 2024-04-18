package com.jayanta.restful.webservices.employeeservices.Repository;

import com.jayanta.restful.webservices.employeeservices.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
