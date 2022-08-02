package day_one;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class SearchMovies {	
	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		URI uri = new URI("https://fake-movie-database-api.herokuapp.com/api?s=batman");
		
		String response = new ImdbApiClient().getBody(uri);
		
		System.out.println(response);
	}
}
