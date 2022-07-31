package day_one;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ImdbApiClient {
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
}
