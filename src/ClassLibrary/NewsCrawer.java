package ClassLibrary;

import java.io.IOException;
import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;


public class NewsCrawer {
	private final String NewsUrl = "https://news.jnu.edu.cn/jnyw/jdtt/";
	private final String newsDetailUrlHead = "https://news.jnu.edu.cn";
	public static ArrayList<String> NewsList = new ArrayList<String>();
	public static ArrayList<String> linkList = new ArrayList<String>();
	public static ArrayList<String> dateList = new ArrayList<String>();
	public static ArrayList<String> contentlist = new ArrayList<String>();
	private Document doc = null;
	
	public NewsCrawer() {
		try {
			doc = Jsoup.connect(NewsUrl).timeout(8000).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void getNews(){
		
		Elements elements1 = doc.getElementsByClass("newsConList");
		Elements NewsElements = elements1.select("li");
		//NewsElements.remove(0);
		for(int i=0;i<NewsElements.size();i++) {
			
			Element NewsElement = NewsElements.get(i);
			Elements NewsElement2 = NewsElement.getElementsByClass("title");
			
			Elements links = NewsElement2.get(0).getElementsByTag("a");
			String linkHref = links.get(0).attr("href");
			String linkText = links.get(0).text();
			String detailLink = newsDetailUrlHead+linkHref;
			
			Elements NewsElement3 = NewsElement.getElementsByClass("date");
			String date = NewsElement3.get(0).text();
			NewsList.add(linkText);
			linkList.add(detailLink);
			dateList.add(date);
			
			Document copy = doc;
			try {
				doc = Jsoup.connect(detailLink).timeout(8000).get();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			};
			Elements elements4 = doc.getElementsByClass("conTxt");
			Elements conElements = elements4.get(0).getElementsByTag("p");
			//System.out.println(conElements.size());
			StringBuffer contxt = new StringBuffer();
			for(int j=0;j<conElements.size();j++) {
				Element cont = conElements.get(j);
				contxt.append("\n");
				contxt.append(cont.text().trim());
			}
			contentlist.add(contxt.toString());
			//System.out.println(contxt);
			
			doc = copy;
						
		}
		
		
		Elements end = doc.getElementsByClass("current");
		String endpage = end.get(0).text();
		Elements elements2 = doc.getElementsByClass("next");
		String linknext = elements2.get(0).attr("href");
		if(!endpage.equals("19")) {
			String linkNectPage = newsDetailUrlHead+linknext;
			try {
				doc = Jsoup.connect(linkNectPage).timeout(8000).get();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			getNews();
			
		}
		
	
	}
	
//	public static void main(String[] args) {
//		NewsCrawer newsCrawer = new NewsCrawer();
//		newsCrawer.getNews();
//	}
	
}