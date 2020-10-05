package com.grsi.department.its.entities;


public class Team {
	

	private long id;
	private String name;
	private String speciality;
	
	public Team() {
		// TODO Auto-generated constructor stub
	}
	
	public Team(long id, String name, String speciality) {
		super();
		this.id = id;
		this.name = name;
		this.speciality = speciality;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

}
