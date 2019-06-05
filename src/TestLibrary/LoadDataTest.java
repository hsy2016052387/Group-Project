package TestLibrary;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ClassLibrary.PasswordInfo;
import ClassLibrary.SaveData;
import ClassLibrary.WorkInfoCrawer;

public class LoadDataTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testLoadPasswordInfo() {
		//fail("Not yet implemented");
		SaveData testSavePassWord = new SaveData("../testSavePassWord.txt");
		PasswordInfo passwordInfo = testSavePassWord.loadPasswordInfo();
		assertEquals("2016052387",passwordInfo.getStudyJnuAccount());
		assertEquals("password1",passwordInfo.getStudyJnuPassword());
		assertEquals("2016052387",passwordInfo.getShuziJnuAccount());
		assertEquals("password2",passwordInfo.getShuziJnuPassword());
		assertEquals("2016052387",passwordInfo.getSchoolCardAccount());
		assertEquals("password3",passwordInfo.getSchoolCardPassword());
		
	}

}
