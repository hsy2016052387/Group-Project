package ClassLibrary;

public class CollegeInfoCreate extends Thread{
	public void run() {
		if(CollegeNotiCrawer.CollegeNotiList.size()==0) {
			CollegeNotiCrawer workInfoCrawer = new CollegeNotiCrawer();
			workInfoCrawer.getCollegeNoti();
		}
	}
}
