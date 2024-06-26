package com.jayanta.restful.webservices.employeeservices;

import com.jayanta.restful.webservices.employeeservices.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication
public class EmployeeServicesApplication{

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServicesApplication.class, args);
	}
}
