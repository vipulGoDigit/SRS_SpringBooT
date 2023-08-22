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

import com.digit.StudentCrud.StudentCrud.Entity.Student;
import com.digit.StudentCrud.StudentCrud.Service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService service;
	
    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Student> liststudent = service.ListAll();
        model.addAttribute("liststudent", liststudent);
        System.out.print("Get / ");    
        return "index";
    }
    @GetMapping("/new")
    public String add(Model model) {
        model.addAttribute("student", new Student());
        return "new";
    }
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String saveStudent(@ModelAttribute("student")Student std) {
		System.out.println(std.toString());
		service.save(std);
		return "redirect:/";
	}
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditStudentPage(@PathVariable (name="id")int id) {
		ModelAndView mav=new ModelAndView("new");
		Student std=service.get(id);
		mav.addObject("student", std);
		return mav;
	}
	@RequestMapping("/delete/{id}")
	public String deleteStudent(@PathVariable(name="id")int id) {
		service.delete(id);
		return "redirect:/";
	}
	

	
	
	
}
