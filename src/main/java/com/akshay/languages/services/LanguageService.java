package com.akshay.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.akshay.languages.models.Language;
import com.akshay.languagesrepositories.LanguageRepository;

@Service
public class LanguageService {

	private final LanguageRepository languageRepository;
	
	public LanguageService (LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	// returns all the languages present
	public List<Language> allLanguages() {
		return languageRepository.findall();
	}

//	create a language
	public Language createLanguage(Language language) {
		return languageRepository.save(language);
	}
	
//	retrieves a language based on given id
	public Language findLanguage ( Long id ) {
		Optional<Language> optionalLanguage = languageRepository.findById(id);
		if (optionalLanguage.isPresent()) {
			return optionalLanguage.get();
		}
		else {
			return null;
		}
	}
	
}
