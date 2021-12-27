package com.ala.ApiPortfolio.services;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ala.ApiPortfolio.model.Languages;
import com.ala.ApiPortfolio.model.Projecte;
import com.ala.ApiPortfolio.model.software;

@Service
public interface igestProject {
	
	public List<Projecte> getProjects();
	public List<Projecte> getProjectsBysoft(software s);
	public List<Projecte> getProjectsBylang(Languages l);
	public Projecte getProjectById(int id);
	public void saveProject(Projecte proj);
	public void deletePriject(int id );
	public void removeSoft(int id);
	public byte[] getImage(int id)throws IOException;
}
