package TestLibrary;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ClassLibrary.SchoolCardMoneyCrawer;

public class SchoolCardMoneyCrawerTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetBalance() {
		//fail("Not yet implemented");
		String account = "201605238";
		String password = "123456";
		SchoolCardMoneyCrawer test = new SchoolCardMoneyCrawer();
		test.getBalance(account, password);
		assertEquals("\u767b\u9646\u5931\u8d25\uff0c\u8bf7\u68c0\u67e5\u8d26\u53f7\u5bc6\u7801",test.getBalance(account, password));
	}

}
