package com.ala.ApiPortfolio.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ala.ApiPortfolio.model.Languages;

@RepositoryRestResource 
public interface LangRepo extends JpaRepository<Languages, Integer>{

}
