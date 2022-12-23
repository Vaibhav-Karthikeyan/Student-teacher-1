package com.masai.app.entity;
import java.util.Objects;

import jakarta.persistence.Entity;

@Entity
public class Gender{
	private String Gender;
	
	public Gender(){
		
	}

	public Gender(String gender) {
		super();
		Gender = gender;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	@Override
	public String toString() {
		return "Gender [Gender=" + Gender + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Gender);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gender other = (Gender) obj;
		return Objects.equals(Gender, other.Gender);
	}
}
