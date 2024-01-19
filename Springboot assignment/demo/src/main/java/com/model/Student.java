package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {

	@Id@GeneratedValue
	private int stdId;
	
	@Column(name="stdname")
	private String stdName;
	private String course;
	private double fees;
	
	public Student() {
		
	}

	public Student(int stdId, String stdName, String course, double fees) {
		this.stdId = stdId;
		this.stdName = stdName;
		this.course = course;
		this.fees = fees;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", course=" + course + ", fees=" + fees + "]";
	}
	
}
