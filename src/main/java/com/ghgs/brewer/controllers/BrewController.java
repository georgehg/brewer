package com.ghgs.brewer.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BrewController {
	
	@RequestMapping("brews/new")
	public String add() {
		return "brew/BrewManagement";
	}
	
	@RequestMapping(value = "brews/new", method = RequestMethod.POST)
	public void cadastrar() {
		
	}

}
