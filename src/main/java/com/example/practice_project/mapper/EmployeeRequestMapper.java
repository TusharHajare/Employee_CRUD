package com.example.practice_project.mapper;

import com.example.practice_project.Entity.Employee;
import com.example.practice_project.dto.EmployeeRequest;
import com.example.practice_project.dto.EmployeeResponse;

public class EmployeeRequestMapper {

	public static Employee toEmployeeReqMapper(EmployeeRequest emp) {
		
		Employee e = new Employee();
		e.setAddress(emp.getAddress());
		e.setPassword(emp.getPassword());
		e.setSallary(emp.getSallary());
		e.setUserName(emp.getUserName());
		
		return e;
	}

	public static EmployeeResponse toEmployeeRespMapper(Employee emp) {
		EmployeeResponse response = new EmployeeResponse();
		response.setId(emp.getId());
		response.setUserName(emp.getUserName());
		response.setAddress(emp.getAddress());
		return response;
	}	

}
