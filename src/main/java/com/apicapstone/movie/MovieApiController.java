package com.apicapstone.movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class MovieApiController {

	@Autowired
	private MovieDao movieDao;

	@GetMapping("/movie")
	public List<Movie> getMovie(@RequestParam(value = "title", required = false) String title) {
		if (title == null || title.isEmpty()) {
			return movieDao.findAll();
		} else {
			return movieDao.findByTitle(title);
		}

	}
}
