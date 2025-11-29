package com.example.practice_project.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Entity
@Table(name = "address")
public class Address 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String addressType;
	private String city;
	private String district;
	private long postalCode;

	@ManyToOne
	@JoinColumn(name = "employee_id")
	@JsonBackReference
	private Employee employee;

	public Address() {
		super();
	}

	public Address(int id, String addressType, String city, String district, long postalCode, Employee employee) {
		super();
		this.id = id;
		this.addressType = addressType;
		this.city = city;
		this.district = district;
		this.postalCode = postalCode;
		this.employee = employee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public long getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(long postalCode) {
		this.postalCode = postalCode;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}