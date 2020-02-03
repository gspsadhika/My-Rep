package com.cts.training.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

public class Technology {
    @Id
    @GeneratedValue
    @Column(name="id")
	private long id;
    
    @Column(name="expertise")
	private String expertise;
    
    @Column(name="language")
	private String language;
	
	@ManyToMany(mappedBy="technology")
	private Set<Developer> developer;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Set<Developer> getDeveloper() {
		return developer;
	}

	public void setDeveloper(Set<Developer> developer) {
		this.developer = developer;
	}
	
}
