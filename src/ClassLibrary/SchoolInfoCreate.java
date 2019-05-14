package ClassLibrary;

public class SchoolInfoCreate extends Thread{
	public void run() {
		if(SchoolNotiCrawer.SchoolNotiList.size()==0) {
			SchoolNotiCrawer schoolnoti = new SchoolNotiCrawer();
			schoolnoti.getSchoolNoti();
		}
	}
}
