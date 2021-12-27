package com.ala.ApiPortfolio.controllers;

import java.io.IOException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ala.ApiPortfolio.model.Languages;
import com.ala.ApiPortfolio.model.Projecte;
import com.ala.ApiPortfolio.model.software;
import com.ala.ApiPortfolio.services.igestLang;
import com.ala.ApiPortfolio.services.igestProject;
import com.ala.ApiPortfolio.services.igestSoft;

@CrossOrigin("*")

@RestController
@RequestMapping("/api")
public class Restcontroller {
	
	@Autowired
	igestLang gl;
	
	@Autowired
	igestProject gp;
	
	@Autowired
	igestSoft gs;
	
	// Langs operations
	
	@GetMapping("/Langs")
	public List<Languages> getLangs(){
		return gl.getlangs();
	}
	
	@GetMapping("/Lang/{id}")
	public Languages getLangs(@PathVariable int id){
		return gl.getLangById(id);
	}
	
	@PostMapping("/Lang")
	public void saveLangs(@RequestBody Languages lang){
		gl.saveLang(lang);
	}
	

	@PutMapping("/Lang")
	public void alterfLangs(@RequestBody Languages lang){
		gl.saveLang(lang);
	}
	
	@DeleteMapping("/lang/{id}")
	public void deleteLang(@PathVariable int id) {
		
		List<Projecte> lp = getProjectsbylang(id);
		for (Projecte projecte : lp) {
			projecte.setLang(null);
			gp.saveProject(projecte);
		}
		gl.deleteLang(id);
	}
	
	//soft operations
	
	@GetMapping("/Softs")
	public List<software> getSofts(){
		return gs.getSofts();
	}
	
	@GetMapping("/Soft/{id}")
	public software getSoft(@PathVariable int id){
		return gs.getSoftById(id);
	}
	
	@PostMapping("/Soft")
	public void saveLangs(@RequestBody software soft){
		gs.saveSoft(soft);
	}
	
	@PutMapping("/Soft")
	public void alterLangs(@RequestBody software soft){
		gs.saveSoft(soft);
	}
	
	@DeleteMapping("/Soft/{id}")
	public void deleteSoft(@PathVariable int id) {
		List<Projecte> lp = getProjectsbysoft(id);
		for (Projecte projecte : lp) {
			projecte.setSoft(null);
			gp.saveProject(projecte);
		}
		
		gs.deleteSoft(id);
	}
	
	//projects operations
	
	@GetMapping("/Projects")
	public List<Projecte> getProjects(){
		return gp.getProjects();
	}
	
	@GetMapping("/Project/{id}")
	public Projecte getProject(@PathVariable int id){
		return gp.getProjectById(id);
	}
	
	@GetMapping("/projectbysoft/{id}")
	public List<Projecte> getProjectsbysoft(@PathVariable int id){
		software s = gs.getSoftById(id);
		return gp.getProjectsBysoft(s);
	} 
	
	@GetMapping("/projectbylang/{id}")
	public List<Projecte> getProjectsbylang(@PathVariable int id){
		Languages l = gl.getLangById(id);
		return gp.getProjectsBylang(l);
	} 
	
	@GetMapping(value="/Project/img/{id}",produces = MediaType.IMAGE_PNG_VALUE)
	public byte[] getImage(@PathVariable int id) throws IOException{
		return gp.getImage(id) ;
		
	}
	
	
	@PostMapping("/Project")
	public void saveLangs(@RequestBody Projecte p){
		gp.saveProject(p);
	}
	
	@PutMapping("/Project")
	public void alterLangs(@RequestBody Projecte p){
		gp.saveProject(p);
	}
	
	@DeleteMapping("/Project/{id}")
	public void deleteProject(@PathVariable int id) {
		gp.deletePriject(id);
	}
	
}
