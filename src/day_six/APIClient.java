package day_six;

import java.io.IOException;
import java.net.URI;

public interface APIClient {
	public String getBody(URI uri) throws IOException, InterruptedException;
	
	public Class<? extends Content> type();
}
