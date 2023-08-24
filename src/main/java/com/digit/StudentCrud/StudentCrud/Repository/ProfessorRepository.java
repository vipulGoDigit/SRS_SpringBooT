package com.digit.StudentCrud.StudentCrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.digit.StudentCrud.StudentCrud.Entity.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}
