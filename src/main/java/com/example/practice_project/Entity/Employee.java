package com.example.practice_project.Entity;

import java.util.List;

import com.example.practice_project.dto.AddressRequest;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String userName;
	private String password;
	private Long sallary;
	
	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Address> address;
	
	public Employee(String userName, String password, List<Address> address, Long sallary) {
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

	public List<Address> getAddress() {
		return address;
	}
	
	public void setAddress(List<Address> address) {
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
