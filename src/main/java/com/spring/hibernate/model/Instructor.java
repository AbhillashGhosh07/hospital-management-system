package com.spring.hibernate.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Instructor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="firsrt-name")
	private String fname;
	
	@Column(name="last-name")
	private String lname;
	
	@OneToOne
	@JoinColumn(name = "instructordetails-id")
	private InstructorDetails instructorDetails;

	public Instructor() {}
	
	public Instructor(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public InstructorDetails getInstructorDetails() {
		return instructorDetails;
	}

	public void setInstructorDetails(InstructorDetails instructorDetails) {
		this.instructorDetails = instructorDetails;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", fname=" + fname + ", lname=" + lname + ", instructorDetails="
				+ instructorDetails + "]";
	}
	
	
}
