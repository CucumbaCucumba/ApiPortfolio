package com.ala.ApiPortfolio.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ala.ApiPortfolio.model.Languages;

@Service
public interface igestLang {

	public List<Languages> getlangs();
	public Languages getLangById(int id);
	public void saveLang(Languages lang);
	public void deleteLang(int id );
	
}
