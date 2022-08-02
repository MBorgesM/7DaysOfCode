package day_two;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import day_one.ImdbApiClient;

public class ParseJSON {
	
	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		URI uri = new URI("https://fake-movie-database-api.herokuapp.com/api?s=batman");
		String json = new ImdbApiClient().getBody(uri);
		
		List<Movie> movies = new ImdbMovieJsonParser(json).parse();
		
		movies.forEach(System.out::println);
	}
}
