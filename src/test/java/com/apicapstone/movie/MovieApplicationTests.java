package com.apicapstone.movie;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MovieApplicationTests {
	@Autowired
	ApiService apiService;

	@Test
	public void ApiServiceConnected01() {
		List<Movie> movie = apiService.printCompleteList();
		assertNotNull(movie);
	}

}
