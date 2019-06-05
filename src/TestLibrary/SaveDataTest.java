package TestLibrary;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

import ClassLibrary.PasswordInfo;
import ClassLibrary.SaveData;
import ClassLibrary.WorkInfoCrawer;
import WindowBuilder.MainInterface;

public class SaveDataTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSaveData() {
		
		SaveData testSavePassWord = new SaveData("../testSavePassWord.txt");
		PasswordInfo passwordInfo = new PasswordInfo();
		passwordInfo.setStudyJnuAccount("2016052387");
		passwordInfo.setStudyJnuPassword("password1");
		passwordInfo.setShuziJnuAccount("2016052387");
		passwordInfo.setShuziJnuPassword("password2");
		passwordInfo.setSchoolCardAccount("2016052387");
		passwordInfo.setSchoolCardPassword("password3");
		testSavePassWord.save(passwordInfo);
		
		File file = new File("./testSavePassWord.txt");
        assertEquals(true, file.exists());
	}

}
