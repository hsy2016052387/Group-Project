package ClassLibrary;

public class WorkInfoCreate extends Thread {
	public void run() {
		if(WorkInfoCrawer.workInfoList.size()==0) {
			WorkInfoCrawer workInfoCrawer = new WorkInfoCrawer();
			workInfoCrawer.getWorkInfo();
		}
	}
}
