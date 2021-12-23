package com.ala.ApiPortfolio.services;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ala.ApiPortfolio.model.software;

@Service
public interface igestSoft {
	
	public List<software> getSofts();
	public software getSoftById(int id);
	public void saveSoft(software SOFT);
	public void deleteSoft(int id );

}
