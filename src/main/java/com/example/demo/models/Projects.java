package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Projects {

	@Id
	@GeneratedValue
	private int id;
	private String username;
	private String title;
	private String year;
	private String desc;
	
	public Projects() {
		
	}
	
	public Projects(String username, String title, String year, String desc) {
		super();
		this.username = username;
		this.title = title;
		this.year = year;
		this.desc = desc;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Projects [username=" + username + ", title=" + title + ", year=" + year + ", desc=" + desc + "]";
	}
	
}
