package com.digit.StudentCrud.StudentCrud.Repository;

 

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

 

import com.digit.StudentCrud.StudentCrud.Entity.Course;

 

@Repository

public interface CourseRepository extends JpaRepository<Course, Long>{

 

}

 