package com.example.practice_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
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

import jakarta.validation.Valid;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeServive;

	@PostMapping()
	public ResponseEntity<EmployeeResponse> SaveEmployee(@Valid @RequestBody EmployeeRequest emp) 
	{
		return ResponseEntity.status(HttpStatusCode.valueOf(201)).body(employeeServive.createEmployee(emp));
	}

	@GetMapping("/{id}")
	public ResponseEntity<EmployeeResponse> getEmployeeById(@PathVariable int id) 
	{
		 EmployeeResponse response =  employeeServive.getEmpById(id);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	@GetMapping()
	public ResponseEntity<List<EmployeeResponse>> getAllEmployee() {
		return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(employeeServive.getAllEmployee());
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> removeById(@PathVariable int id)
	{
		employeeServive.removeById(id);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body("ResponseEntity-Deleted Succefully...!") ;
	}

	@DeleteMapping
	public ResponseEntity<String> removeAllRecords() 
	{
		employeeServive.removeAllRecords();
		return ResponseEntity.status(HttpStatus.OK).body("Deleted All Data...!");
	}

	@PutMapping("/{id}")
	public ResponseEntity<EmployeeResponse> updateEmployeeById(@RequestBody Employee emp, @PathVariable int id) {
		return ResponseEntity.status(HttpStatus.OK).body(employeeServive.updateRecordsById(emp, id));
	}
}
