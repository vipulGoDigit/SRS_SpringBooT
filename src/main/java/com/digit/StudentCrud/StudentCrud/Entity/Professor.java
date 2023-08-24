package com.digit.StudentCrud.StudentCrud.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Professor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long pid;
	String Professorname;
	String course;
	int exp;
	@Override
	public String toString() {
		return "Professor [pid=" + pid + ", Professorname=" + Professorname + ", course=" + course + ", exp=" + exp
				+ "]";
	}
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	public String getProfessorname() {
		return Professorname;
	}
	public void setProfessorname(String professorname) {
		Professorname = professorname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Professor(long pid, String professorname, String course, int exp) {
		super();
		this.pid = pid;
		Professorname = professorname;
		this.course = course;
		this.exp = exp;
	}

}
