package ClassLibrary;

public class NewsInfoCreate extends Thread {
	public void run() {
		if(NewsCrawer.NewsList.size()==0) {
			NewsCrawer newsCrawer = new NewsCrawer();
			newsCrawer.getNews();
		}
	}
}
