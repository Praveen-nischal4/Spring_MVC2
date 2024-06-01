package com.mypro.controller;

import java.util.List;

import com.mypro.model.Student;
import com.mypro.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@Autowired
	StudentService studentService;
	
	@RequestMapping("/home")
	public String getHome(Model model)
	{
		model.addAttribute("name", "Praveen");
		return "home";
	}
	

	@RequestMapping("/myForm")
	public ModelAndView getForm()
	{
		return new ModelAndView("myform2","command",new Student());
		
	}
	
	@RequestMapping(value="/saveStudent",method = RequestMethod.POST)
	public ModelAndView getData(@ModelAttribute Student stu)
	{
		studentService.saveStudent(stu);
		return new ModelAndView("redirect:/listStudent");
	}
	
	@RequestMapping("/listStudent")
	public ModelAndView getList()
	{
		List<Student> list =studentService.fetchall();
		return new ModelAndView("stuRecord","slist",list);
	}
	
	@RequestMapping("delstu/{rollno}")
	public String deleteStuent(@PathVariable("rollno") int rollno)
	{
		studentService.delete(rollno);
		return "redirect:/listStudent";
		
	}
	
	@RequestMapping("searchstu/{rollno}")
	public ModelAndView getStudent(@PathVariable("rollno") int rollno)
	{
		Student stu = studentService.getStudent(rollno);
		return new ModelAndView("update","command",stu);
	}
	

	@RequestMapping("/updateStudent")
	public String update(@ModelAttribute Student student)
	{
		studentService.update(student);
		return "redirect:/listStudent";
	}
}