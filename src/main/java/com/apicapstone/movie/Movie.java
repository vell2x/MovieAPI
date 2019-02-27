package com.apicapstone.movie;

public class Movie {
	private String title;
	private String rating;
	private String genre;
	private Integer length;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	@Override
	public String toString() {
		return "Movie [title=" + title + ", rating=" + rating + ", genre=" + genre + ", length=" + length + "]";
	}

}
