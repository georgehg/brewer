package com.ghgs.brewer.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ghgs.brewer.model.Brew;

@Controller
public class BrewController {
	
	@RequestMapping("brews/new")
	public String newBrew(Brew brew) {
		return "brew/BrewManagement";
	}
	
	@RequestMapping(value = "brews/new", method = RequestMethod.POST)
	public String cadastrar(@Valid Brew brew, BindingResult result, Model model, RedirectAttributes redirAttribs) {
		
		if (result.hasErrors()) {
			return newBrew(brew);
		}
		
		redirAttribs.addFlashAttribute("message", "Cerveja salva com sucesso");
		
		return "redirect:/brews/new";
	}

}
