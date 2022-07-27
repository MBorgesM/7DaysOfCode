package day_one;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SearchMovies {
	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		HttpClient httpClient = HttpClient.newHttpClient();
		HttpRequest httpRequest = HttpRequest.newBuilder()
				.GET()
				.headers("accept", "application/json")
				.uri(new URI("https://fake-movie-database-api.herokuapp.com/api?s=batman"))
				.build();
				
		HttpResponse<String> response = httpClient
				.send(httpRequest, HttpResponse.BodyHandlers.ofString());
		
		System.out.println(response.statusCode());
		System.out.println(response.body());
	}
}
