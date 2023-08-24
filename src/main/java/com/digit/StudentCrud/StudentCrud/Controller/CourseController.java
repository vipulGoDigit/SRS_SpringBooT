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

import com.digit.StudentCrud.StudentCrud.Service.CourseService;

@Controller

public class CourseController {

	@Autowired

	private CourseService service;

	@GetMapping("/Course")

	public String viewHomePage(Model model) {

		List<Course> listcourse = service.ListAll();

		model.addAttribute("listcourse", listcourse);

		System.out.print("Get / ");

		return "Course";

	}

	@GetMapping("/newCourse")

	public String add(Model model) {

		model.addAttribute("course", new Course());

		return "newCourse";

	}

	@RequestMapping(value = "/Csave", method = RequestMethod.POST)

	public String saveCourse(@ModelAttribute("course") Course cou) {

		System.out.println(cou.toString());

		service.Csave(cou);

		return "redirect:/Course";

	}

	@RequestMapping("/Course/edit/{cid}")

	public ModelAndView showEditCoursePage(@PathVariable(name = "cid") int cid) {

		ModelAndView mav = new ModelAndView("newCourse");

		Course cou = service.get(cid);

		mav.addObject("course", cou);

		return mav;

	}

	@RequestMapping("/Course/delete/{cid}")

	public String deleteCourse(@PathVariable(name = "cid") int cid) {

		service.delete(cid);

		return "redirect:/Course";

	}

}