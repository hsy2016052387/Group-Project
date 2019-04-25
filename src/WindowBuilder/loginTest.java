package WindowBuilder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class loginTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testLogin() {
		new login();
		login.textField.setText("2016052387");
		User user=new User();
		user.SetAccount();
		assertEquals("2016052387", user.GetAccount());
		//login.textField.setText("");
		//while(true);
	}
	
	@Test
	public void testTrue_Account() {
		login log = new login();
		String s = new String("");
		char[] a = {};
		assertEquals(true,log.true_Account(s, a));
		//while(true);
		s = "2019";
		assertEquals(false, log.true_Account(s, a));
	}

}
