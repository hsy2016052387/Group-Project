package TestLibrary;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import WindowBuilder.Login;

public class loginTest {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testTrue_Account() {
		Login log = new Login();
		String s = new String("");
		char[] a = {};
		assertEquals(true,log.true_Account(s, a));
		//while(true);
		s = "2019";
		assertEquals(false, log.true_Account(s, a));
	}

}
