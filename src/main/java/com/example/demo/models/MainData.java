package com.example.demo.models;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class MainData {
	
	@Id
	private String username;
	private String name;
	private String email;
	private String phno;
	private String careerobjective;
//	private Education edu;
//	private ArrayList<Education> edulist;
	
	public MainData() {
		this.username="batman";
	}
	
	public MainData(String name, String email, String phno, String careerobjective) {
		super();
		this.username="batman";
		this.name = name;
		this.email = email;
		this.phno = phno;
		this.careerobjective = careerobjective;
//		this.edulist = new ArrayList<Education>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public String getCareerobjective() {
		return careerobjective;
	}
	public void setCareerobjective(String careerobjective) {
		this.careerobjective = careerobjective;
	}

//	public void addEducation(Education ed) {
//		this.edulist.add(ed);
//	}
//	
	public String disp() {
		return "11ResumeData [name=" + name + ", email=" + email + ", phno=" + phno + ", careerobjective="
				+ careerobjective + "]";
	}

	
	

}
