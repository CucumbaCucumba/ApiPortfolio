package com.ala.ApiPortfolio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ala.ApiPortfolio.model.Languages;
import com.ala.ApiPortfolio.repo.LangRepo;

@Service
public class gestLang implements igestLang{

	@Autowired
	LangRepo lr;
	
	@Override
	public List<Languages> getlangs() {
		// TODO Auto-generated method stub
		return lr.findAll();
	}

	@Override
	public Languages getLangById(int id) {
		// TODO Auto-generated method stub
		return lr.getById(id);
	}

	@Override
	public void saveLang(Languages lang) {
		// TODO Auto-generated method stub
		lr.save(lang);
	}

	@Override
	public void deleteLang(int id) {
		// TODO Auto-generated method stub
		lr.deleteById(id);
	}

}
