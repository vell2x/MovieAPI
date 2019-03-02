package com.apicapstone.movie;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MovieResponse {

	@JsonProperty("results")
	private List<Movie> results;
	
	public List<Movie> getResults() {
		return results;
	}
	public void setResults(List<Movie> results) {
		this.results = results;
	}
	
}
