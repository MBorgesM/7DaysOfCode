package day_two;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
    "imdbID",
    "Title",
    "Year",
    "Poster"
})
public class Movie {
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

	public String getImdbID() {
		return imdbID;
	}

	public String getTitle() {
		return title;
	}

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
}
