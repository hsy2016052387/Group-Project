package ClassLibrary;

public class MoreCollegeInfoCreate extends Thread{
	public void run() {
		if(MoreCollegeNotiCrawer.CollegeNotiList.size()==0) {
			MoreCollegeNotiCrawer mcoll1 = new MoreCollegeNotiCrawer(1);
			mcoll1.getCollegeNoti();
			MoreCollegeNotiCrawer mcoll2 = new MoreCollegeNotiCrawer(2);	
			mcoll2.getCollegeNoti();
			MoreCollegeNotiCrawer mcoll3 = new MoreCollegeNotiCrawer(3);
			mcoll3.getCollegeNoti();
			
		}
	}
}
