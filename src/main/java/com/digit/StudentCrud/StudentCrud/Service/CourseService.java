package com.digit.StudentCrud.StudentCrud.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.digit.StudentCrud.StudentCrud.Entity.Course;

import com.digit.StudentCrud.StudentCrud.Repository.CourseRepository;

@Service

public class CourseService {

	@Autowired

	private CourseRepository repo;

	public List<Course> ListAll() {
		return repo.findAll();

	}

	public void Csave(Course cou) {
		System.out.println(repo.save(cou));

	}

	public Course get(long cid) {
		return repo.findById(cid).get();

	}

	public void delete(long cid) {
		repo.deleteById(cid);
	}

}