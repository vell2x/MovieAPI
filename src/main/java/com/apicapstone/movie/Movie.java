package com.apicapstone.movie;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie {
	@JsonProperty("vote_count")
	private String voteCount;
	private Long id;
	private String video;
	@JsonProperty("vote_average")
	private Double voteAverage;
	private String title;
	private Double popularity;
	@JsonProperty("poster_path")
	private String posterPath;
	@JsonProperty("original_language")
	private String originalLanguage;
	@JsonProperty("original_title")
	private String originalTitle;
	@JsonProperty("genre_ids")
	private Long genreIds;
	@JsonProperty("backdrop_path")
	private String backdropPath;
	private String adult;
	@JsonProperty("release_date")
	private String releaseDate;
	private String overview;

	public String getVoteCount() {
		return voteCount;
	}

	public void setVoteCount(String voteCount) {
		this.voteCount = voteCount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public Double getVoteAverage() {
		return voteAverage;
	}

	public void setVoteAverage(Double voteAverage) {
		this.voteAverage = voteAverage;
	}

	public Double getPopularity() {
		return popularity;
	}

	public void setPopularity(Double popularity) {
		this.popularity = popularity;
	}

	public String getPosterPath() {
		return posterPath;
	}

	public void setPosterPath(String posterPath) {
		this.posterPath = posterPath;
	}

	public String getOriginalLanguage() {
		return originalLanguage;
	}

	public void setOriginalLanguage(String originalLanguage) {
		this.originalLanguage = originalLanguage;
	}

	public String getOriginalTitle() {
		return originalTitle;
	}

	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle;
	}

	public Long getGenreIds() {
		return genreIds;
	}

	public void setGenreIds(Long genreIds) {
		this.genreIds = genreIds;
	}

	public String getBackdropPath() {
		return backdropPath;
	}

	public void setBackdropPath(String backdropPath) {
		this.backdropPath = backdropPath;
	}

	public String getAdult() {
		return adult;
	}

	public void setAdult(String adult) {
		this.adult = adult;
	}

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

	@Override
	public String toString() {
		return "Movie [voteCount=" + voteCount + ", id=" + id + ", video=" + video + ", voteAverage=" + voteAverage
				+ ", title=" + title + ", popularity=" + popularity + ", posterPath=" + posterPath
				+ ", originalLanguage=" + originalLanguage + ", originalTitle=" + originalTitle + ", genreIds="
				+ genreIds + ", backdropPath=" + backdropPath + ", adult=" + adult + ", releaseDate=" + releaseDate
				+ ", overview=" + overview + "]";
	}

}
