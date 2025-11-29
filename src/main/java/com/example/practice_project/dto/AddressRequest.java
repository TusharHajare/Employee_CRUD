package com.example.practice_project.dto;

public class AddressRequest
{
	private String addressType;
	private String city;
	private String district;
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