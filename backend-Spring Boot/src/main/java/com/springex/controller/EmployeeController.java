package com.springex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springex.entity.Employee;
import com.springex.service.EmployeeService;

@RestController
@CrossOrigin("http://localhost:4200")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	/* to save a new employee record*/
	
	@PostMapping("/save/employee")
	public Employee saveEmployee(@RequestBody Employee employee ) {
		return employeeService.saveEmployee(employee);
	}
	
	/* To retrieve a list of all employees*/
	
	@GetMapping("/get/employee")
	public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }
	
	/* to retrieve details of a specific employee identified by  {employeeId}*/
	@GetMapping("/get/employee/{employeeId}")
	public Employee getEmployee(@PathVariable Integer employeeId) {
		
		return employeeService.getEmployees(employeeId);
	}
	/* To delete records with specific  {employeeId}*/
	@DeleteMapping("/delete/employee/{employeeId}")
	public void deleteEmployee( @PathVariable Integer employeeId) {
		employeeService.deleteEmployee(employeeId);
		
	}
	
	/* To  Update an existing employee record received in the request body.*/
	
	@PutMapping("/update/employee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		
		return employeeService.updateEmployee(employee);
	}
	
	

}
