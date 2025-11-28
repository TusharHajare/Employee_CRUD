package com.example.practice_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice_project.Entity.Employee;
import com.example.practice_project.Service.EmployeeService;
import com.example.practice_project.dto.EmployeeRequest;
import com.example.practice_project.dto.EmployeeResponse;

@RestController
public class EmployeeController 
{
	@Autowired
	private EmployeeService employeeServive;

	@PostMapping()
	public ResponseEntity<EmployeeResponse> SaveEmployee(@RequestBody EmployeeRequest emp) 
	{
		return ResponseEntity.ok(employeeServive.createEmployee(emp));
	}
	
	@GetMapping("/{id}")
	public EmployeeResponse getEmployeeById(@PathVariable int id)
	{
		return employeeServive.getEmpById(id);
	}
	
	@GetMapping()
	public List<EmployeeResponse> getAllEmployee() {
		return employeeServive.getAllEmployee();
	}
	
	@DeleteMapping("/{id}")
	public String removeById(@PathVariable int id)
	{
		return employeeServive.removeById(id);
	}
	
	@DeleteMapping
	public String removeAllRecords()
	{
		return employeeServive.removeAllRecords();
	}
	
	@PutMapping("/{id}")
	public EmployeeResponse updateEmployeeById(@RequestBody Employee emp,@PathVariable int id)
	{
		return employeeServive.updateRecordsById(emp, id);
	}
}
