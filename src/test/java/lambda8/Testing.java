package lambda8;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

import com.insightfullogic.java8.examples.chapter1.SampleData;

public class Testing {

	@Test
	public void ch3_1a() {
		int i = Arrays.asList(1, 2, 3, 4, 5, 6).stream().reduce(0, (acc, element) -> acc + element);
		System.out.println(i);
	}
	
	@Test
	public void ch3_1b() {
		System.out.println(SampleData.getThreeArtists().stream().map(artist -> artist.getName() + " from " + artist.getNationality()).collect(Collectors.toList()));
	}
	
	@Test
	public void ch3_1b2() {
		System.out.println(SampleData.getThreeArtists().stream().flatMap(artist -> Stream.of(artist.getName(), artist.getNationality())).collect(Collectors.toList()));
	}
	
	@Test
	public void ch3_1c() {
		System.out.println(SampleData.albums.filter(album -> album.getTrackList().size() < 4).collect(Collectors.toList()));
	}
}
