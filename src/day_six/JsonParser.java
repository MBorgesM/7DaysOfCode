package day_six;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

public interface JsonParser {
	public List<? extends Content> parse() throws URISyntaxException, IOException, InterruptedException;
}
