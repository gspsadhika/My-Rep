package com.cts.training.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="actor")
public class Actor {
	@Id
	@GeneratedValue
	private long id;
	private String actorName;
	
	@ManyToOne
	@JoinColumn(name="movie_id")
	private Movie movie;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	

}
