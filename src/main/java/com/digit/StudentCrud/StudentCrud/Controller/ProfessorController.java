package com.digit.StudentCrud.StudentCrud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.digit.StudentCrud.StudentCrud.Entity.Course;
import com.digit.StudentCrud.StudentCrud.Entity.Professor;
import com.digit.StudentCrud.StudentCrud.Entity.Student;
import com.digit.StudentCrud.StudentCrud.Service.ProfessorService;

@Controller
public class ProfessorController {
	
	@Autowired
	private ProfessorService service;
	
	@GetMapping("/Professor")
	public String viewHomePage(Model model) {
		List<Professor>listProfessors=service.ListAll();
		model.addAttribute("listProfessor", listProfessors);
		return "Professor";
	}
    @GetMapping("/newProfessor")
    public String add(Model model) {
        model.addAttribute("professor", new Professor());
        return "newProfessor";
    }
	@RequestMapping(value = "/Psave", method = RequestMethod.POST)
	public String saveProfessor(@ModelAttribute("professor") Professor p1) {
		System.out.println(p1.toString());
		service.Psave(p1);
		return "redirect:/Professor";

	}
	@RequestMapping("/Professor/edit/{pid}")
	public ModelAndView showEditCoursePage(@PathVariable(name="pid")int pid) {
		ModelAndView mav=new ModelAndView("newProfessor");
		Professor p1=service.get(pid);
		mav.addObject("professor", p1);
		return mav;
	}
	@RequestMapping("/Professor/delete/{pid}")
	public String deleteProfessor(@PathVariable(name="pid") int pid) {
		service.delete(pid);
		return "redirect:/Professor";
	}
	
	

}
