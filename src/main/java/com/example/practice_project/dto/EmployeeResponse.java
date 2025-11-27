package com.example.practice_project.dto;

public class EmployeeResponse
{
	private int id;
	private String userName;
	private String address;
	
	public EmployeeResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeResponse(int id, String userName, String address) {
		super();
		this.id = id;
		this.userName = userName;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}	
}
