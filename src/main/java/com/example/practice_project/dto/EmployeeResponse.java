package com.example.practice_project.dto;

import java.util.List;

import com.example.practice_project.Entity.Address;

public class EmployeeResponse
{
	private int id;
	private String userName;
	private List<Address> address;
	
	public EmployeeResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeResponse(int id, String userName, List<Address> address) {
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

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}
}
