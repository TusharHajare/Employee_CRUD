package com.example.practice_project.dto;

import java.util.List;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class EmployeeRequest
{
	@NotEmpty(message = "username must not be null or empty")
	@Size(min = 3, max = 15)
	private String userName;
	
	@Pattern(regexp = "[A-Za-z0-9@]+")
	@NotNull(message ="password must not be null")
	private String password;
	
	@Max(value = 100000,  message = "Salary must be more than 100000") //<=
	@NotNull(message ="sallary must not be null")
	private Long sallary;
	
	@NotEmpty(message = "Address must not be null or empty")
	private List<AddressRequest> address;
	
	public EmployeeRequest() {
		super();
	}

	public EmployeeRequest(String userName, String password, List<AddressRequest> address, Long sallary) {
		super();
		this.userName = userName;
		this.password = password;
		this.address = address;
		this.sallary = sallary;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<AddressRequest> getAddress() {
		return address;
	}

	public void setAddress(List<AddressRequest> address) {
		this.address = address;
	}

	public Long getSallary() {
		return sallary;
	}

	public void setSallary(Long sallary) {
		this.sallary = sallary;
	}

	@Override
	public String toString() {
		return "EmployeeRequest [userName=" + userName + ", password=" + password + ", address=" + address
				+ ", sallary=" + sallary + "]";
	}
	
	
}
