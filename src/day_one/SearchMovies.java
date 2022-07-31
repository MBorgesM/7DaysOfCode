package day_one;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpResponse;

public class SearchMovies {	
	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		URI uri = new URI("https://fake-movie-database-api.herokuapp.com/api?s=batman");
		
		HttpResponse<String> response = ImdbApiClient.getResponse(uri);
		
		System.out.println(response.statusCode());
		System.out.println(response.body());
	}
}
