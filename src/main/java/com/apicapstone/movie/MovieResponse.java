package com.apicapstone.movie;

import java.util.List;

public class MovieResponse {

	private List<Movie> movie;

	public void setMovie(List<Movie> movie) {
		this.movie = movie;
	}

	public List<Movie> getMovie() {
		return this.movie;
	}

}
