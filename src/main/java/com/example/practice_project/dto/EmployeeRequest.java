package com.example.practice_project.dto;

import java.util.List;

public class EmployeeRequest
{
	private String userName;
	private String password;
	private Long sallary;
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
