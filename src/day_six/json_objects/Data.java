package day_six.json_objects;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
	
	@JsonProperty("results")
	private List<MarvelSeries> results;
	
	public Data() {}
	
	public Data(List<MarvelSeries> results) {
		this.results = results;
	}

	public List<MarvelSeries> getResults() {
		return this.results;
	}
}
