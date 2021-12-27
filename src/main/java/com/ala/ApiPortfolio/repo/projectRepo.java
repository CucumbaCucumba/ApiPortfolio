package com.ala.ApiPortfolio.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ala.ApiPortfolio.model.Languages;
import com.ala.ApiPortfolio.model.Projecte;
import com.ala.ApiPortfolio.model.software;

@RepositoryRestResource
public interface projectRepo extends JpaRepository<Projecte, Integer>{
	
	List<Projecte> findBySoftContains(software s);
	List<Projecte> findByLangContains(Languages l);

}
