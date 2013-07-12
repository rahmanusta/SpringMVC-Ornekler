package com.kodcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AcceptContoller {

	@RequestMapping(value="/accepts")
	public String accept(){
		
		return "accept";
	}
	
	@RequestMapping(value="/accept")
	public String acceptJson(@RequestHeader("Cookie")String encoding){
		System.out.println(encoding);
		return "accept";	
	}

}
