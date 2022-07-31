package day_two;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ImdbMovieJsonParser {
	private String json;
	
	public ImdbMovieJsonParser(String json) {
		this.json = json;
	}
	
	public List<Movie> parse() throws URISyntaxException, IOException, InterruptedException {
		String fixedJson = this.json.substring(this.json.indexOf('['), this.json.indexOf(']') + 1);
		
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(fixedJson, new TypeReference<List<Movie>>() {});
	}
}
