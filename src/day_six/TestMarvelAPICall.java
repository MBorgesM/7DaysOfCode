package day_six;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.apache.commons.codec.binary.Hex;
import org.joda.time.DateTimeUtils;

import day_six.json_objects.MarvelSeries;

public class TestMarvelAPICall {
	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		String publicKey = "<YOUR PUBLIC KEY>";
		String privateKey = "<YOUR PRIVATE KEY>";
		Long currentTime = DateTimeUtils.currentTimeMillis();
		
		byte[] hash = org.apache.commons.codec.digest.DigestUtils.md5(currentTime + privateKey + publicKey);
		String key = new String(Hex.encodeHex(hash));
		
		String url = "https://gateway.marvel.com:443/v1/public/series?limit=10&apikey=" + publicKey + 
				"&hash=" + key + "&ts=" + currentTime;
		URI uri = new URI(url);
		
		String response = new MarvelApiClient().getBody(uri);
		List<MarvelSeries> list = new MarvelSeriesJsonParser(response).parse();
		
		list.forEach(System.out::println);
	}
}
