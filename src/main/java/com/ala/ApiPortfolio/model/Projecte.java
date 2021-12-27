package com.ala.ApiPortfolio.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

	@Entity @Data @NoArgsConstructor @AllArgsConstructor
	public class Projecte {
		@Id @GeneratedValue(strategy = GenerationType.AUTO)
		int id;
		private String name;
		private String description;
		private String imgagePath;
		@ManyToMany
		private List<Languages> lang = new ArrayList<Languages>();
		@ManyToMany
		private List<software> soft = new ArrayList<software>();

		
	

		

	}

	

