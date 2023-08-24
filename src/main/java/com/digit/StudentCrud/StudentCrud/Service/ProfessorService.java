package com.digit.StudentCrud.StudentCrud.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digit.StudentCrud.StudentCrud.Entity.Professor;
import com.digit.StudentCrud.StudentCrud.Repository.ProfessorRepository;

@Service
public class ProfessorService {
		@Autowired
		private ProfessorRepository repo;
		
		public List<Professor>ListAll(){
			return repo.findAll();
		}
		
		public void Psave(Professor p1) {
			System.out.println(repo.save(p1));
		}
		public Professor get(long pid) {
			return repo.findById(pid).get();
		}
		public void delete(long pid) {
			repo.deleteById(pid);
		}
		
}
