package day_four;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import day_one.ImdbApiClient;
import day_two.ImdbMovieJsonParser;
import day_two.Movie;

public class TestHTMLGenerator {
	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		URI uri = new URI("https://fake-movie-database-api.herokuapp.com/api?s=batman");
		File file = new File("./index.html");
		if (file.exists()) {
			file.delete();
			file.createNewFile();
		}
		
		PrintWriter pw = new PrintWriter(new FileOutputStream(
				file,
				true));
		
		String json = new ImdbApiClient().getBody(uri);
		List<Movie> movies = new ImdbMovieJsonParser(json).parse();
		
		new HtmlGenerator(pw).generate(movies);
		
		pw.close();
	}
}
