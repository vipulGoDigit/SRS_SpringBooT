package com.digit.StudentCrud.StudentCrud.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	String Studentname;
	String course;
	int fees;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStudentname() {
		return Studentname;
	}
	public void setStudentname(String studentname) {
		Studentname = studentname;
	}
	public Student(long id, String sname, String course, int fees) {
		super();
		this.id = id;
		this.Studentname = sname;
		this.course = course;
		this.fees = fees;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSname() {
		return Studentname;
	}
	public void setSname(String sname) {
		this.Studentname = sname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentname=" + Studentname + ", course=" + course + ", fees=" + fees + "]";
	}
}
