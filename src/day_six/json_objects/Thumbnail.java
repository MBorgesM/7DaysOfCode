package day_six.json_objects;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Thumbnail {
	@JsonProperty("path")
	private String path;
	
	@JsonProperty("extension")
	private String extension;
	
	public Thumbnail() {}
	
	public Thumbnail(String path, String extension) {
		this.path = path;
		this.extension = extension;
	}
	
	public String getUrl() {
		return path + "." + extension;
	}

	@Override
	public String toString() {
		return getUrl();
	}
	
}
