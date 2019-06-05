package TestLibrary;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ClassLibrary.*;

public class NewsTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		NewsCrawer news = new NewsCrawer();
		news.getNews();
		assertEquals(152,news.NewsList.size());
	}

}
