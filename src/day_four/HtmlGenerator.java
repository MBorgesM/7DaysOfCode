package day_four;

import java.io.PrintWriter;
import java.util.List;

import day_two.Movie;

public class HtmlGenerator {
	private PrintWriter pw;

	public HtmlGenerator(PrintWriter pw) {
		this.pw = pw;
	}
	
	public void generate(List<Movie> movies) {
		String head =
				"""
				<head>
					<meta charset=\"utf-8\">
					<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">
					<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" 
						+ "integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">					
				</head>
				""";
		
		pw.write(head);
		
		for(Movie movie : movies) {
			String cardDiv =
					"""
					<div class=\"card text-white bg-dark mb-3\" style=\"max-width: 18rem;\">
						<h4 class=\"card-header\">%s</h4>
						<div class=\"card-body\">
							<img class=\"card-img\" src=\"%s\" alt=\"%s\">
							<p class=\"card-text mt-2\">IMDb ID: %s - Ano: %s</p>
						</div>
					</div>
					""";
			
			pw.println(String.format(
					cardDiv,
					movie.getTitle(),
					movie.getPoster(),
					movie.getTitle(),
					movie.getId(),
					movie.getYear()));
		}
	}
}
