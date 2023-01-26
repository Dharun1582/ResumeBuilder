package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Education {
	
	@Id
	@GeneratedValue
	private int id;
	private String username;
	private String institute;
	private String course;
	private String year;
	
	public Education() {
		
	}
	public Education(String username,String institute, String course, String year) {
		super();
		this.username=username;
		this.institute = institute;
		this.course = course;
		this.year = year;
	}
	public String getInstitute() {
		return institute;
	}
	public void setInstitute(String institute) {
		this.institute = institute;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public String toString() {
		return "Education [institute=" + institute + ", course=" + course + ", year=" + year + "]";
	}

	
}
