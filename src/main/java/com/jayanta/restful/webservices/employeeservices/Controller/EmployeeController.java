package com.jayanta.restful.webservices.employeeservices.Controller;

import com.jayanta.restful.webservices.employeeservices.Repository.EmployeeRepository;
import com.jayanta.restful.webservices.employeeservices.entity.Employee;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping("/employee/{id}")
    public Optional<Employee> findAllEmployeebyId(@PathVariable Long id) {
        return employeeRepository.findById(id);
    }

    @PostMapping("/employees")
    public ResponseEntity<Employee> createEmployee(@Valid @RequestBody Employee employee) {
        final Employee savedEmployee = employeeRepository.save(employee);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedEmployee.getId())
                .toUri();

        return ResponseEntity.created(location).body(savedEmployee);
    }

}