package com.example.demo.entity;

public class Comments {
	public Integer id;
	public String firstName, lastName, comment;
	public Integer museumId;
	public double estimationMuseum;
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getid() {
		return this.id;
	}
	
	public void setIdMuseum(Integer idMuseum) {
		this.museumId = idMuseum;
	}
	
	public Integer getMuseumId() {
		return this.museumId;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public String getComment() {
		return this.comment;
	}
	
	public void setEstimationMuseum(double estimationMuseum) {
		this.estimationMuseum = estimationMuseum;
	}
	
	public double getEstimationMuseum() {
		return this.estimationMuseum;
	}



}
