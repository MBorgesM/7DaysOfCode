package day_two;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import day_one.SearchMovies;

public class ParseJSON {
	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		URI uri = new URI("https://fake-movie-database-api.herokuapp.com/api?s=batman");
		String json = SearchMovies.getResponse(uri).body();
		String fixedJson = json.substring(json.indexOf('['), json.indexOf(']') + 1);
		
		ObjectMapper mapper = new ObjectMapper();
		List<Movie> movies = mapper.readValue(fixedJson, new TypeReference<List<Movie>>() {});
		
		movies.forEach(System.out::println);
	}
}
