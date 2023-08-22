package com.digit.StudentCrud.StudentCrud.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digit.StudentCrud.StudentCrud.Entity.Student;
import com.digit.StudentCrud.StudentCrud.Repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository repo;
	
	public List<Student>ListAll(){
		return repo.findAll();
	}
	public void  save (Student std) {
		System.out.println(repo.save(std)); 
	}
	public Student get(long id) {
		return repo.findById(id).get();	
	}
	public void delete(long id) {
		repo.deleteById(id);
	}
	
	
	

}
