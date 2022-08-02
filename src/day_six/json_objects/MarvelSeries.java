package day_six.json_objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import day_six.Content;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({
    "id",
    "title",
    "startYear",
    "thumbnail"
})
public class MarvelSeries implements Content {
	@JsonProperty("id")
	public String id;
	
	@JsonProperty("title")
	public String title;
	
	@JsonProperty("startYear")
	public String year;
	
	@JsonProperty("thumbnail")
	public Thumbnail thumbnail;
	
	public MarvelSeries() {}

	public MarvelSeries(String id, String title, String year, Thumbnail thumbnail) {
		this.id = id;
		this.title = title;
		this.year = year;
		this.thumbnail = thumbnail;
	}

	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public String getTitle() {
		return this.title;
	}

	@Override
	public String getYear() {
		return this.year;
	}

	public Thumbnail getThumbnail() {
		return this.thumbnail;
	}

	@Override
	public String toString() {
		return "MarvelSeries [id=" + id + ", title=" + title + ", year=" + year + ", thumbnail=" + thumbnail + "]";
	}
}
