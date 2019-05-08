package ClassLibrary;

public class CollegeInfo extends Thread{
	public void run() {
		if(CollegeNotiCrawer.CollegeNotiList.size()==0) {
			CollegeNotiCrawer workInfoCrawer = new CollegeNotiCrawer();
			workInfoCrawer.getCollegeNoti();
		}
	}
}
