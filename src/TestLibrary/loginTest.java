package TestLibrary;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Before;
import org.junit.Test;

import ClassLibrary.User;
import WindowBuilder.Login;

public class loginTest {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void testTrue_Account() {
		//验证二维码图片有没有保存下来
		Login log = new Login();
		String path = this.getClass().getClassLoader().getResource(".").getPath();
		//btnNewButton_1.setIcon(new ImageIcon(path+"../images/download.png"));
        File storeFile=new File(path+"../images/yzm.gif");
        assertEquals(true, storeFile.exists());
	}

}
