package com.example.practice_project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice_project.Entity.Employee;
import com.example.practice_project.dto.EmployeeRequest;
import com.example.practice_project.dto.EmployeeResponse;
import com.example.practice_project.mapper.EmployeeRequestMapper;
import com.example.practice_project.repository.EmployeeRepository;

@Service
public class EmployeeService 
{
  	@Autowired
    private EmployeeRepository empRepository;
  	
  	public EmployeeResponse createEmployee(EmployeeRequest emp)
  	{
  		Employee employee = EmployeeRequestMapper.toEmployeeReqMapper(emp);
  		
  		EmployeeResponse empRes =  EmployeeRequestMapper.toEmployeeRespMapper(empRepository.save(employee));
  		return empRes;
  	}

	public EmployeeResponse getEmpById(int id)
	{
	   EmployeeResponse employeeRes = EmployeeRequestMapper.toEmployeeRespMapper(empRepository.findById(id).get());
	   return employeeRes;
	}

	public List<EmployeeResponse> getAllEmployee() {
		List<Employee> emps = empRepository.findAll();
		List<EmployeeResponse> empRes = emps.stream().map(emp->EmployeeRequestMapper.toEmployeeRespMapper(emp)).toList();
		return empRes;
	}

	public String removeById(int id)
	{
		empRepository.deleteById(id);
		return "Successfully deleted...!";
	   	
	}

	public String removeAllRecords() 
	{
		empRepository.deleteAll();
		return "Deleted All Records.";
	}

	public EmployeeResponse updateRecordsById(Employee emp, int id) 
	{
	  EmployeeResponse empResponse = EmployeeRequestMapper.toEmployeeRespMapper(empRepository.findById(id).get());	
	  empResponse.setUserName(emp.getUserName());
	  empResponse.setAddress(emp.getAddress());
   	  
	  return empResponse;
	}
  
  
}
