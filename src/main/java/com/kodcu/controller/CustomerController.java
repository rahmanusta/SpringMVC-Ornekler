package com.kodcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
	
	@RequestMapping("/customer")
	public ModelAndView customerDetails(){
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("customer");
		
		Customer customer=new Customer();
		customer.setAge(13);
		customer.setName("John");
		customer.setSurname("Lenon");
		
		modelAndView.addObject(customer);
		
		return modelAndView;
	}

}
