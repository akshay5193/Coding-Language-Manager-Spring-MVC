package com.akshay.languagesrepositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.akshay.languages.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language,Long> {

//	This method retrieves all the books from the database
	List<Language> findall();
	
//	This method finds the book by its creator
	List<Language> findByCreatorContaining (String search);
	
}
