package com.example.practice_project.mapper;

import java.util.List;

import com.example.practice_project.Entity.Address;
import com.example.practice_project.Entity.Employee;
import com.example.practice_project.dto.EmployeeRequest;
import com.example.practice_project.dto.EmployeeResponse;

public class EmployeeRequestMapper {

	public static Employee toEmployeeReqMapper(EmployeeRequest emp) {
		
		Employee e = new Employee();
		e.setPassword(emp.getPassword());
		e.setSallary(emp.getSallary());
		e.setUserName(emp.getUserName());
		

		List<Address> address = emp.getAddress().stream().map(req -> 
		{
			Address ad = new Address();
			
			ad.setAddressType(req.getAddressType());
			ad.setCity(req.getCity());
			ad.setDistrict(req.getDistrict());
			ad.setPostalCode(req.getPostalCode());
			
			ad.setEmployee(e);   //// IMPORTANT for One-to-Many
			
			return ad;
		}).toList();
		
		e.setAddress(address);
		
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
