package com.example.practice_project.dto;

public class EmployeeRequest
{
	private String userName;
	private String password;
	private String address;
	private Long sallary;
	
	public EmployeeRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeRequest(String userName, String password, String address, Long sallary) {
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getSallary() {
		return sallary;
	}
	public void setSallary(Long sallary) {
		this.sallary = sallary;
	}	
}
