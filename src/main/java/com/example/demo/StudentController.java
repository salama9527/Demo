package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dao.StudentDaoImpl;
import com.domain.Student;
import com.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService ss;
	
	@RequestMapping(value="/display",method=RequestMethod.POST)
	public void savedata(@ModelAttribute("s") Student s,Map<String,String> m){
		System.out.println("sdhnwieuojrd");
	String msg=ss.save(s);
	m.put("msg", msg);
		//return "display";
		
	}
	@RequestMapping(value="/EntryForm",method=RequestMethod.GET)
	public ModelAndView show(){
		
		return new ModelAndView("EntryForm");
		
	}
}
