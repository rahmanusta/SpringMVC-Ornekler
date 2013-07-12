package com.kodcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {
	
	/*
	@RequestMapping(value="/form")
	public String formMethod(){
		return "form";
	}
	*/
	@RequestMapping(value="/form2")
	public String formMethod2(){
		return "form2";
	}
	
/*	
	@RequestMapping(value="/postForm")
	public ModelAndView formHesap(@RequestParam Double sayi1,@RequestParam Double sayi2){
		System.out.println("Veri geldi: sayı1: "+sayi1+" ve "+sayi2);
		
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("form");
		modelAndView.addObject("sonuc", (sayi1+sayi2));
		return modelAndView;
	} */
	
	@RequestMapping(value="/postForm2")
	public String formHesap2(@ModelAttribute("formbean") FormBean formbean){
		formbean.setSonuc(formbean.getSayi1()+formbean.getSayi2());
		return "form2";
	}

}
