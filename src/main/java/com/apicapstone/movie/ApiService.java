package com.apicapstone.movie;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ApiService {

//	private String endPoint;
//	private Map<String, String> configurationMap = null;
//	private ConfigManager config = null;
//	private HttpConfiguration httpConfiguration = null;
	private RestTemplate restTemplate = new RestTemplate();

	@Value("${myapi.key}")
	String myApiKey;

	private RestTemplate restTemplateWithUserAgent;
	// This is an instance initialization block. It runs when a new instance of the
	// class is created--right before the constructor.
//	{
//		// This configures the restTemplateWithUserAgent to include a User-Agent header
//		// with every HTTP request. Some of the APIs in this demo have a bug where
//		// User-Agent is required.
//		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
//			request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
//			return execution.execute(request, body);
//		};
//		restTemplateWithUserAgent = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
//	}

	public List<Movie> searchByKeyword(String keyword) {
//		String url = "https://api.themoviedb.org/3/search/movie?api_key=" + myApiKey + "&language=en-US&query="
//				+ keyword + "&page=1&include_adult=false";
		String url = "https://api.themoviedb.org/3/movie/33427?api_key=" + myApiKey;

		MovieResponse movie = restTemplate.getForObject(url, MovieResponse.class);
		return movie.getResults();
	}
}
