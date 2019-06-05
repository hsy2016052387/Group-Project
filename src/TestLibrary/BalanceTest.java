package TestLibrary;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import WindowBuilder.Balance;



public class BalanceTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetele() {
		String dormnum = "331";
//		new Balance(dormnum);
		String result = new Balance(dormnum).getele(dormnum);
		assertEquals("false", result);
		
	}

}
