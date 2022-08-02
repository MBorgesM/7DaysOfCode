package day_six.json_objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Answer {
	@JsonProperty("data")
	private Data data;
	
	public Answer() {}
	
	public Answer(Data data) {
		this.data = data;
	}

	public Data getData() {
		return this.data;
	}
}
