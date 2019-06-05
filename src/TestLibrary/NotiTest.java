package TestLibrary;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ClassLibrary.CollegeNotiCrawer;
import ClassLibrary.DeptNotiCrawer;
import WindowBuilder.*;

public class NotiTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void Collegetest() {
		CollegeNotiCrawer cNoti = new CollegeNotiCrawer();
		cNoti.getCollegeNoti();
		assertEquals(210,cNoti.CollegeNotiList.size());
	}
	
	@Test
	public void Depttest() {
		DeptNotiCrawer dNoti = new DeptNotiCrawer();
		dNoti.getDeptNoti();
		assertEquals(176,dNoti.DeptNotiList.size());
	}

}
