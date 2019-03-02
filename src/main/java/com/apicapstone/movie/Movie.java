package com.apicapstone.movie;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Movie {
	private String title;
	@JsonProperty("release_date")
	private String releaseDate;
	private String overview;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}
}