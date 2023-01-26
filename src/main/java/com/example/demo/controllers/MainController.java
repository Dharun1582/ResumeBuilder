package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.models.Education;
import com.example.demo.models.MainData;
import com.example.demo.models.Projects;
import com.example.demo.repository.EducationRepository;
import com.example.demo.repository.MainDataRepository;
import com.example.demo.repository.ProjectsRepository;

@SessionAttributes("username")
@Controller
public class MainController {
	
	MainDataRepository mdrepo;
	EducationRepository edurepo;
	ProjectsRepository prrepo;
	
	public MainController(MainDataRepository mdrepo,EducationRepository edurepo,ProjectsRepository prrepo) {
		this.mdrepo = mdrepo;
		this.edurepo = edurepo;
		this.prrepo=prrepo;
	}
	
	@RequestMapping(value="/resumeform",method=RequestMethod.GET)
	public String resumeForm(ModelMap modelmap) {
		modelmap.put("username", "dharun");
		return "resumeform";
	}
	
	@RequestMapping(value="/resumeform",method=RequestMethod.POST)
	public ModelAndView resumeForm(@ModelAttribute MainData rd,@ModelAttribute Education ed,@ModelAttribute("username") String username) {
		mdrepo.save(rd);
		ed.setUsername(username);
		edurepo.save(ed);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("resumedisp");
		mv.addObject("rd",rd);
		mv.addObject("ed",ed);
		return mv;

	}
	
	
	@RequestMapping(value="/addeducation",method=RequestMethod.GET)
	public String showAddEducationPage() {
		return "addeducation";
	}
	
	@RequestMapping(value="/addeducation",method=RequestMethod.POST)
	public String addEducation(@ModelAttribute Education ed,@ModelAttribute("username") String username) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("resumedisp");
		mv.addObject("ed",ed);
		ed.setUsername(username);
		edurepo.save(ed);
		return "resumedisp";
	}
	
	
	@RequestMapping(value="/addprojects",method=RequestMethod.GET)
	public String showAddProjectsPage() {
		return "addprojects";
	}
	
	@RequestMapping(value="/addprojects",method=RequestMethod.POST)
	public String addEducation(@ModelAttribute Projects pr,@ModelAttribute("username") String username) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("resumedisp");
		mv.addObject("pr",pr);
		pr.setUsername(username);
		prrepo.save(pr);
		return "resumedisp";
	}
	
	
}
