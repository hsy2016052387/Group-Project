package TestLibrary;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import WindowBuilder.User;
import WindowBuilder.Login;

public class loginTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testLogin() {
		new Login();
		Login.textField.setText("2016052387");
		User user=new User();
		user.SetAccount();
		assertEquals("2016052387", user.GetAccount());
		//login.textField.setText("");
		//while(true);
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
