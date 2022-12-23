package com.masai.app.entity;

import java.sql.Date;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

import com.masai.app.entity.Gender;
import com.masai.app.entity.Address;
@Entity
public class Student  {
	private String firstName,lastName;
	private java.sql.Date birthDate;
	private boolean wantsNewsletter;
	
	@OneToOne(mappedBy = "gender")
	private Gender gender;
	
	@OneToOne(mappedBy= "Address")
	private Address address;
	
	public Student(){
		
	}

	public Student(String firstName, String lastName, Date birthDate, boolean wantsNewsletter, Gender gender,
			Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.wantsNewsletter = wantsNewsletter;
		this.gender = gender;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public java.sql.Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(java.sql.Date birthDate) {
		this.birthDate = birthDate;
	}

	public boolean isWantsNewsletter() {
		return wantsNewsletter;
	}

	public void setWantsNewsletter(boolean wantsNewsletter) {
		this.wantsNewsletter = wantsNewsletter;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate
				+ ", wantsNewsletter=" + wantsNewsletter + ", gender=" + gender + ", address=" + address + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, birthDate, firstName, gender, lastName, wantsNewsletter);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && Objects.equals(birthDate, other.birthDate)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(gender, other.gender)
				&& Objects.equals(lastName, other.lastName) && wantsNewsletter == other.wantsNewsletter;
	}
}
