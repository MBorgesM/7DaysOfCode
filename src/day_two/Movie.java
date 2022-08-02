package day_two;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import day_six.Content;

@JsonPropertyOrder({
    "imdbID",
    "Title",
    "Year",
    "Poster"
})
public class Movie implements Content, Comparable<Content> {
	@JsonProperty("imdbID")
	private String imdbID;
	
	@JsonProperty("Title")
	private String title;
	
	@JsonProperty("Year")
	private String year;
	
	@JsonProperty("Poster")
	private String poster;
	
	public Movie() {}

	public Movie(String imdbID, String title, String year, String poster) {
		this.imdbID = imdbID;
		this.title = title;
		this.year = year;
		this.poster = poster;
	}

	@Override
	public String getId() {
		return imdbID;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public String getYear() {
		return year;
	}

	public String getPoster() {
		return poster;
	}

	@Override
	public String toString() {
		return "Movie [imdbID=" + imdbID + ", title=" + title + ", year=" + year + ", poster=" + poster + "]";
	}

	@Override
	public int compareTo(Content outro) {
		return this.getYear().compareTo(outro.getYear());
	}
}
