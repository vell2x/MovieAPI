package com.apicapstone.movie;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie {
	private String title;
	private String character;
	@JsonProperty("release_date")
	private String releaseDate;
	@JsonProperty("vote_count")
	private Integer voteCount;
	@JsonProperty("vote_average")
	private Double voteAverage;
	private Integer id;
	private String overview;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCharacter() {
		return character;
	}
	public void setCharacter(String character) {
		this.character = character;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public Integer getVoteCount() {
		return voteCount;
	}
	public void setVoteCount(Integer voteCount) {
		this.voteCount = voteCount;
	}
	public Double getVoteAverage() {
		return voteAverage;
	}
	public void setVoteAverage(Double voteAverage) {
		this.voteAverage = voteAverage;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", character=" + character + ", releaseDate=" + releaseDate + ", voteCount="
				+ voteCount + ", voteAverage=" + voteAverage + ", id=" + id + ", overview=" + overview + "]";
	}
	
	
}
