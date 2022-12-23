package com.masai.app.entity;

import java.util.Objects;

import jakarta.persistence.Entity;

@Entity
public class Address {
	private String street,number,city;
	public Address() {
		
	}
	public Address(String street, String number, String city) {
		super();
		this.street = street;
		this.number = number;
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", number=" + number + ", city=" + city + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(city, number, street);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(city, other.city) && Objects.equals(number, other.number)
				&& Objects.equals(street, other.street);
	}
	
}
