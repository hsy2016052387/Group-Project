package TestLibrary;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ClassLibrary.WorkInfoCrawer;

public class WorkInfoCrawerTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetWorkInfo() {
		//fail("Not yet implemented");
		//验证爬取的就业信息是不是50条
		WorkInfoCrawer test = new WorkInfoCrawer();
		test.getWorkInfo();
		assertEquals(50,WorkInfoCrawer.workInfoList.size());
	}

}
