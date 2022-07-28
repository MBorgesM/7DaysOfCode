package day_one;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SearchMovies {
	public static HttpResponse<String> getResponse(URI uri) throws IOException, InterruptedException {
		HttpClient httpClient = HttpClient.newHttpClient();
		HttpRequest httpRequest = HttpRequest.newBuilder()
				.GET()
				.headers("accept", "application/json")
				.uri(uri)
				.build();
				
		return httpClient
				.send(httpRequest, HttpResponse.BodyHandlers.ofString());
	}
	
	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		URI uri = new URI("https://fake-movie-database-api.herokuapp.com/api?s=batman");
		
		HttpResponse<String> response = getResponse(uri);
		
		System.out.println(response.statusCode());
		System.out.println(response.body());
	}
}
