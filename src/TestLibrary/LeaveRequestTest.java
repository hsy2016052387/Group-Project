package TestLibrary;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import WindowBuilder.*;
import ClassLibrary.*;

public class LeaveRequestTest {
	private static LeaveRequest  leaverequest= new LeaveRequest() ;
	
	@Before
	public void setUp() throws Exception {
		
	}

	

	@Test
	public void testLeaveRequest() {
		LeaveRequest.leave_name = "\u674e\u56db";

		LeaveRequest.leave_number = "2016000000";

		LeaveRequest.leave_institute = "\u5b66\u9662";

		LeaveRequest.leave_specialty = "\u8f6f\u4ef6\u5de5\u7a0b";

		LeaveRequest.leave_reason = "\u751f\u75c5";
			LeaveOutput docl =new LeaveOutput();
			try {
				docl.createWord();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			File file = new File("./\u8bf7\u5047\u6761.doc");
	        assertEquals(true, file.exists());
	}

}
