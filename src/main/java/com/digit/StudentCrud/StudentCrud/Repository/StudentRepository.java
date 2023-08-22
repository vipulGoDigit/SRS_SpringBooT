package com.digit.StudentCrud.StudentCrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digit.StudentCrud.StudentCrud.Entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
