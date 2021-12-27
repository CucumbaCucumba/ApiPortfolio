package com.ala.ApiPortfolio.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class software {

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String nom;
	
	public void deleteMe() {
		this.id=0;
		this.nom=null;
	}
}
