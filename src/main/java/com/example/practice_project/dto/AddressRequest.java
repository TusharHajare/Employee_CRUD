package com.example.practice_project.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class AddressRequest
{
	@Min(value = 3, message = "address type must be grteter than or equals to value")
	@NotEmpty(message = "addressType must not be Empty")
	private String addressType;
	
	@NotBlank(message = "city must not be blank")
	private String city;
	
	@NotNull(message ="district must not be null")
	@Min(value = 5, message = "District must be grteter than or equals to value")
	private String district;
	
	@Max(value = 1000000, message = "ENter valid post code")
	private long postalCode;
	
	public AddressRequest() {
		super();
	}

	public AddressRequest(String addressType, String city, String district, long postalCode) {
		super();
		this.addressType = addressType;
		this.city = city;
		this.district = district;
		this.postalCode = postalCode;
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
	
	@Override
	public String toString() {
		return "AddressRequest [addressType=" + addressType + ", city=" + city + ", district=" + district
				+ ", postalCode=" + postalCode+ "]";
	}
	
	
}