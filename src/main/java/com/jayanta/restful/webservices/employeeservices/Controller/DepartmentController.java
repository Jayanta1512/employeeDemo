package com.jayanta.restful.webservices.employeeservices.Controller;


import com.jayanta.restful.webservices.employeeservices.Repository.DepartmentRepository;
import com.jayanta.restful.webservices.employeeservices.Repository.EmployeeRepository;
import com.jayanta.restful.webservices.employeeservices.entity.Departments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping
    public List<Departments> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @PostMapping
    public Departments createDepartment(@RequestBody Departments department) {
        return departmentRepository.save(department);
    }

    @PutMapping("/{id}")
    public Departments updateDepartment(@PathVariable Long id, @RequestBody Departments department) {
        department.setId(id);
        return departmentRepository.save(department);
    }

    @PostMapping("/{id}")
    public void deleteDepartment(@PathVariable Long id) {
            Departments department = departmentRepository.findById(id).get();
            departmentRepository.delete(department);
    }
}
