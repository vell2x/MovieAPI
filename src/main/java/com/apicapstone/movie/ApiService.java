package com.apicapstone.movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ApiService {
	private RestTemplate restTemplate = new RestTemplate();

	@Value("9daef3ac188ee8cf078562e2cf5e7709")
	String myApiKey;
	
	public List<Movie> searchByKeyword(String keyword) {
		String url = "https://api.themoviedb.org/3/search/movie?api_key=" + myApiKey +
				"&query=" + keyword;
		System.out.println(url);
		MovieResponse movie = restTemplate.getForObject(url, MovieResponse.class);
		return movie.getResults();
	}
}
