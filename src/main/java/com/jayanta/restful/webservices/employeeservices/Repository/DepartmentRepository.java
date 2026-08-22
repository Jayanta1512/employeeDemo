package com.jayanta.restful.webservices.employeeservices.Repository;

import com.jayanta.restful.webservices.employeeservices.entity.Departments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Departments, Long> {
}