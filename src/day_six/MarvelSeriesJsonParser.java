package day_six;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import day_six.json_objects.Answer;
import day_six.json_objects.MarvelSeries;

public class MarvelSeriesJsonParser implements JsonParser {
	private String json;
	
	public MarvelSeriesJsonParser(String json) {
		this.json = json;
	}
	
	@Override
	public List<MarvelSeries> parse() throws URISyntaxException, IOException, InterruptedException {
		ObjectMapper mapper = new ObjectMapper();
		Answer answer = mapper.readValue(json, new TypeReference<Answer>() {});
		return answer.getData().getResults();
	}
	
}
