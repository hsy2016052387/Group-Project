package ClassLibrary;

import java.io.IOException;
import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;


public class SchoolNotiCrawer {
	private final String SchoolNotiUrl = "https://zh.jnu.edu.cn/8378/list.psp";
	private final String SchoolNotiDetailUrlHead = "https://zh.jnu.edu.cn";
	public static ArrayList<String> SchoolNotiList = new ArrayList<String>();
	public static ArrayList<String> linkList = new ArrayList<String>();
	public static ArrayList<String> dateList = new ArrayList<String>();
	public static ArrayList<String> contentlist = new ArrayList<String>();
	private Document doc = null;
	
	public SchoolNotiCrawer() {
		try {
			doc = Jsoup.connect(SchoolNotiUrl).timeout(8000).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
public void getSchoolNoti(){
		Elements elements1 = doc.getElementsByClass("media-list main-right-list list-announcement clearfix");
		Elements SchoolNotiElements = elements1.select("li");
		//SchoolNotiElements.remove(0);
		for(int i=0;i<SchoolNotiElements.size();i++) {
			Element SchoolNotiElement = SchoolNotiElements.get(i);
			//Elements SchoolNotiElement2 = SchoolNotiElement.getElementsByClass("news_title");
			Elements links = SchoolNotiElement.getElementsByTag("a");
			Elements title = links.get(0).getElementsByClass("media-heading");
			Elements SchoolNotiElement3 = SchoolNotiElement.getElementsByClass("media-left");
			String date = SchoolNotiElement3.get(0).getElementsByTag("small").get(0).text() + "-" + SchoolNotiElement3.get(0).getElementsByTag("strong").get(0).text();
			if(date.equals("2018-11-12")) 
				continue;
			String linkHref = links.get(0).attr("href");
			String linkText = title.get(0).text();
			String detailLink = SchoolNotiDetailUrlHead+linkHref;
			SchoolNotiList.add(linkText);
			linkList.add(detailLink);
			dateList.add(date);
			
			Document copy = doc;
			try {
				doc = Jsoup.connect(detailLink).timeout(8000).get();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			};
			Elements elements4 = doc.getElementsByClass("wp_articlecontent");
			StringBuffer contxt = new StringBuffer("");
			if (elements4.size() > 0) {
				Elements conElements = elements4.get(0).getElementsByTag("p");
				//System.out.println(conElements.size());
				
				for(int j=0;j<conElements.size();j++) {
					Element cont = conElements.get(j);
					contxt.append(cont.text().trim());
					contxt.append("\n");
				}
			}
			contentlist.add(contxt.toString());
			//System.out.println(contxt);
			
			doc = copy;
			
		}
		Elements currpage = doc.getElementsByClass("curr_page");
		Elements allpages = doc.getElementsByClass("all_pages");
		if(!currpage.get(0).text().equals("15")) {
			Elements next = doc.getElementsByClass("next");
			String linknext = next.get(0).attr("href");
			String linkNectPage = SchoolNotiDetailUrlHead+linknext;
			try {
				doc = Jsoup.connect(linkNectPage).timeout(8000).get();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			getSchoolNoti();
			
		}
		
	
	}
	
//	public static void main(String[] args) {
//		SchoolNotiCrawer sCrawer = new SchoolNotiCrawer();
//		sCrawer.getSchoolNoti();
//	}
	
}
