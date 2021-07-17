package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//コメントkfaf
@Controller
public class MainController {
	@Autowired
	TestService service;
	@RequestMapping("/")
	private ModelAndView index(ModelAndView mav) {
		mav.setViewName("index");
		var list = service.getAllItems();
		mav.addObject("list", list);
		return mav;
	}
}