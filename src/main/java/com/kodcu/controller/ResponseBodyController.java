package com.kodcu.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class ResponseBodyController {

	
	@RequestMapping(value="/jsonCustomer",
			produces="application/json")
	public @ResponseBody Customer getAsJSON(){
		Customer customer=new Customer();
		customer.setName("Ali");
		customer.setAge(30);
		customer.setSurname("Selami");
		return customer;
	}
	
	@RequestMapping(value="/xmlCustomer",
			produces="application/xml")
	@ResponseStatus(value=HttpStatus.OK)
	public @ResponseBody Customer getAsXml(){
		Customer customer=new Customer();
		customer.setName("Ali");
		customer.setAge(30);
		customer.setSurname("Selami");
		return customer;
	}
}
