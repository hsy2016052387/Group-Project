package TestLibrary;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import WindowBuilder.*;
import ClassLibrary.*;

public class ClassRequestTest {

	@Before
	public void setUp() throws Exception {
	}


	@Test
	public void testClassRequest() {
		ClassRequest.class_num1 = "2018";
		ClassRequest.class_num2 = "2019";
		ClassRequest.class_num3 = "2";
		ClassRequest.class_intended = "20160000";
		ClassRequest.class_name = "С01";
		ClassRequest.class_phone = "136000000";
		ClassRequest.class_purpose = "\u5f00\u4f1a";
		ClassOutput docc =new ClassOutput();
        try {
			docc.createWord();
		} catch (IOException e) {
		
			e.printStackTrace();
			
		}
        File file = new File("./\u8bfe\u5ba4\u7533\u8bf7.doc");
        assertEquals(true, file.exists());
	}

}
