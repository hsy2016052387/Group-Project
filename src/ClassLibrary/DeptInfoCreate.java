package ClassLibrary;

public class DeptInfoCreate extends Thread{
	public void run() {
		if(DeptNotiCrawer.DeptNotiList.size()==0) {
			DeptNotiCrawer deptnoti = new DeptNotiCrawer();
			deptnoti.getDeptNoti();
		}
	}
}

