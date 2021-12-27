package com.ala.ApiPortfolio.services;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ala.ApiPortfolio.model.Languages;
import com.ala.ApiPortfolio.model.Projecte;
import com.ala.ApiPortfolio.model.software;
import com.ala.ApiPortfolio.repo.projectRepo;

@Service
public class gestProject implements igestProject{

	@Autowired
	projectRepo pr;
	
	@Override
	public List<Projecte> getProjects() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

	@Override
	public Projecte getProjectById(int id) {
		// TODO Auto-generated method stub
		return pr.findById(id).get();
	}

	@Override
	public void saveProject(Projecte proj) {
		// TODO Auto-generated method stub
		pr.save(proj);
		
	}

	@Override
	public void deletePriject(int id) {
		// TODO Auto-generated method stub
		pr.deleteById(id);
		
	}

	@Override
	public byte[] getImage(int id) throws IOException {
	
		String p = pr.findById(id).get().getImgagePath();
		File f = new File(System.getProperty("user.home"));
		Path path=Paths.get(f+"/images/"+p);
		return Files.readAllBytes(path);
	}

	@Override
	public void removeSoft(int id) {
		// TODO Auto-generated method stub
		int s = id;
	}

	@Override
	public List<Projecte> getProjectsBysoft(software s) {
		// TODO Auto-generated method stub
		return pr.findBySoftContains(s);
	}

	@Override
	public List<Projecte> getProjectsBylang(Languages l) {
		// TODO Auto-generated method stub
		return pr.findByLangContains(l);
	}
	
	
	
	

}
