package day_one;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import day_six.APIClient;
import day_six.Content;
import day_two.Movie;

public class ImdbApiClient implements APIClient {
	
	@Override
	public String getBody(URI uri) throws IOException, InterruptedException {
		HttpClient httpClient = HttpClient.newHttpClient();
		HttpRequest httpRequest = HttpRequest.newBuilder()
				.GET()
				.headers("accept", "application/json")
				.uri(uri)
				.build();
				
		return httpClient
				.send(httpRequest, HttpResponse.BodyHandlers.ofString())
				.body();
	}

	@Override
	public Class<? extends Content> type() {
		return Movie.class;
	}
}
