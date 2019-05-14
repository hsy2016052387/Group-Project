package ClassLibrary;

import java.io.IOException;
import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;


public class DeptNotiCrawer {
	private final String DeptNotiUrl = "https://zhjw.jnu.edu.cn/7164/list.htm";
	private final String DeptNotiDetailUrlHead = "https://zhjw.jnu.edu.cn";
	public static ArrayList<String> DeptNotiList = new ArrayList<String>();
	public static ArrayList<String> linkList = new ArrayList<String>();
	public static ArrayList<String> dateList = new ArrayList<String>();
	public static ArrayList<String> contentlist = new ArrayList<String>();
	private Document doc = null;
	
	public DeptNotiCrawer() {
		try {
			doc = Jsoup.connect(DeptNotiUrl).timeout(8000).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void getDeptNoti(){
		
		Elements elements1 = doc.getElementsByClass("articleList");
		Elements DeptNotiElements = elements1.select("li");
		//DeptNotiElements.remove(0);
		for(int i=0;i<DeptNotiElements.size();i++) {
			
			Element DeptNotiElement = DeptNotiElements.get(i);
			Elements DeptNotiElement2 = DeptNotiElement.getElementsByClass("s_title");
			Elements links = DeptNotiElement2.get(0).getElementsByTag("a");
			Elements DeptNotiElement3 = DeptNotiElement.getElementsByClass("s_time");
			String date = DeptNotiElement3.get(0).text().substring(0, 10);
			String linkHref = links.get(0).attr("href");
			String linkText = links.get(0).text();
			String detailLink = DeptNotiDetailUrlHead+linkHref;
			DeptNotiList.add(linkText);
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
			Elements conElements = elements4.get(0).getElementsByTag("p");
			//System.out.println(conElements.size());
			StringBuffer contxt = new StringBuffer();
			for(int j=0;j<conElements.size();j++) {
				Element cont = conElements.get(j);
				contxt.append(cont.text().trim());
				contxt.append("\n");
			}
			contentlist.add(contxt.toString());
			//System.out.println(contxt);
			
			doc = copy;
			
		}
		Elements currpage = doc.getElementsByClass("curr_page");
		Elements allpages = doc.getElementsByClass("all_pages");
		if(!currpage.get(0).text().equals("8")) {
			Elements next = doc.getElementsByClass("next");
			String linknext = next.get(0).attr("href");
			String linkNectPage = DeptNotiDetailUrlHead+linknext;
			try {
				doc = Jsoup.connect(linkNectPage).timeout(8000).get();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			getDeptNoti();
			
		}
		
	
	}
	
}