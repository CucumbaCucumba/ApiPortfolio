package com.ala.ApiPortfolio.services;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ala.ApiPortfolio.model.Projecte;

@Service
public interface igestProject {
	
	public List<Projecte> getProjects();
	public Projecte getProjectById(int id);
	public void saveProject(Projecte proj);
	public void deletePriject(int id );
	public byte[] getImage(int id)throws IOException;
}
