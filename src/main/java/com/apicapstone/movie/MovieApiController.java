package com.apicapstone.movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MovieApiController {

	@Autowired
	private ApiService apiService;

	@RequestMapping("/movie")
	public ModelAndView movie() {
		List<Movie> movie = apiService.printCompleteList();
		return new ModelAndView("movie", "movie", movie);
	}
	
	@RequestMapping("/result")
	public ModelAndView showResultKeyword() {
			//@RequestParam("keyword") String keyword) {
		//List<Movie> movie = apiService.getKeyword(keyword);
		return new ModelAndView("result"); //, "movie", movie);
	}
	
	/*@RequestMapping("/result")
	public ModelAndView showResultReleaseDate(
			@RequestParam("releaseDate") String releaseDate) {
		List<Movie> movie = apiService.getReleaseDate(releaseDate);
		return new ModelAndView("movie", "movie", movie);
	}*/
}
