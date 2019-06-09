package ClassLibrary;

import java.io.IOException;
import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;


public class CollegeNotiCrawer {
	private String CollegeNotiUrl = new String();
	private String CollegeNotiDetailUrlHead = new String();
	private final String TranCollegeNotiUrl = "https://rwxy.jnu.edu.cn/11063/list.htm";
	private final String TranCollegeNotiDetailUrlHead = "https://rwxy.jnu.edu.cn";
	public static ArrayList<String> CollegeNotiList = new ArrayList<String>();
	public static ArrayList<String> linkList = new ArrayList<String>();
	public static ArrayList<String> dateList = new ArrayList<String>();
	public static ArrayList<String> contentlist = new ArrayList<String>();
	private Document doc = null;
	
	public CollegeNotiCrawer() {
		try {
			CollegeNotiUrl = TranCollegeNotiUrl;
			CollegeNotiDetailUrlHead = TranCollegeNotiDetailUrlHead;
			doc = Jsoup.connect(CollegeNotiUrl).timeout(8000).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void getCollegeNoti(){
		
		Elements elements1 = doc.getElementsByClass("news_list list2");
		Elements CollegeNotiElements = elements1.select("li");
		//CollegeNotiElements.remove(0);
		for(int i=0;i<CollegeNotiElements.size();i++) {
			
			Element CollegeNotiElement = CollegeNotiElements.get(i);
			Elements CollegeNotiElement2 = CollegeNotiElement.getElementsByClass("news_title");
			Elements links = CollegeNotiElement2.get(0).getElementsByTag("a");
			Elements CollegeNotiElement3 = CollegeNotiElement.getElementsByClass("news_meta");
			String date = CollegeNotiElement3.get(0).text();
			String linkHref = links.get(0).attr("href");
			String linkText = links.get(0).text();
			String detailLink = CollegeNotiDetailUrlHead+linkHref;
			CollegeNotiList.add(linkText);
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
			String linkNectPage = CollegeNotiDetailUrlHead+linknext;
			try {
				doc = Jsoup.connect(linkNectPage).timeout(8000).get();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			getCollegeNoti();
			
		}
		
	
	}
	
}
