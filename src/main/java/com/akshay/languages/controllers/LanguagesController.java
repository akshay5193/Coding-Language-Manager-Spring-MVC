package com.akshay.languages.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.akshay.languages.models.Language;
import com.akshay.languages.services.LanguageService;

@Controller
public class LanguagesController {

	private final LanguageService languageService;
	
	public LanguagesController (LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@RequestMapping("/languages")
    public String index(Model model) {
        List<Language> languages = languageService.allLanguages();
        model.addAttribute("languages", languages);
        return "/languages/index.jsp";
    }
	
}
