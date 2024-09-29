package com.slm.librarysystem.model;

public class Info {

	public int id;
	
	public String information;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public Info() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Info(int id, String information) {
		super();
		this.id = id;
		this.information = information;
	}
	
	
}
