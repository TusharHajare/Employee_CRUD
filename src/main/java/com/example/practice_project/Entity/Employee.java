package com.example.practice_project.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String userName;
	private String password;
	private String address;
	private Long sallary;
	
	public Employee(String userName, String password, String address, Long sallary) {
		super();
		this.userName = userName;
		this.password = password;
		this.address = address;
		this.sallary = sallary;
	}
	
	public Employee() {
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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", userName=" + userName + ", password=" + password + ", address=" + address
				+ ", sallary=" + sallary + "]";
	}
	
	
	
	
}
