package com.digit.StudentCrud.StudentCrud.Entity;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;

@Entity

public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long cid;

	String Coursename;
	int fees;
	int duration;

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(long cid, String coursename, int fees, int duration) {
		super();
		this.cid = cid;
		Coursename = coursename;
		this.fees = fees;
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", Coursename=" + Coursename + ", fees=" + fees + ", duration=" + duration + "]";
	}

	public long getCid() {
		return cid;
	}

	public void setCid(long cid) {
		this.cid = cid;
	}

	public String getCoursename() {
		return Coursename;
	}

	public void setCoursename(String coursename) {
		Coursename = coursename;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

}