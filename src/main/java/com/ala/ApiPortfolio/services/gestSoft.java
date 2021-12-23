package com.ala.ApiPortfolio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ala.ApiPortfolio.model.software;
import com.ala.ApiPortfolio.repo.softRepo;

@Service
public class gestSoft implements igestSoft{

	@Autowired
	softRepo sr;
	
	@Override
	public List<software> getSofts() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

	@Override
	public software getSoftById(int id) {
		// TODO Auto-generated method stub
		return sr.getById(id);
	}

	@Override
	public void saveSoft(software SOFT) {
		// TODO Auto-generated method stub
		sr.save(SOFT);
		
	}

	@Override
	public void deleteSoft(int id) {
		// TODO Auto-generated method stub
		sr.deleteById(id);
		
	}

}
