package ClassLibrary;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MoreCollegeNotiCrawer {
	
	private  String CollegeNotiUrl;
	private  String CollegeNotiDetailUrlHead;
	private final String TranCollegeNotiUrl = "https://translation.jnu.edu.cn/7832/list.htm";
	private final String TranCollegeNotiDetailUrlHead = "https://translation.jnu.edu.cn";
	private final String BusiCollegeNotiUrl = "https://gjsxy.jnu.edu.cn/tzgg/list.htm";
	private final String BusiCollegeNotiDetailUrlHead = "https://gjsxy.jnu.edu.cn";
	private final String PackCollegeNotiUrl = "https://pack.jnu.edu.cn/11282/list.htm";
	private final String PackCollegeNotiDetailUrlHead = "https://pack.jnu.edu.cn";
	private String common_ui;
	public static ArrayList<String> CollegeNotiList = new ArrayList<String>();
	public static ArrayList<String> linkList = new ArrayList<String>();
	public static ArrayList<String> dateList = new ArrayList<String>();
	public static ArrayList<String> contentlist = new ArrayList<String>();
	public static int fnum,snum;
	private Document doc = null;
	
	public MoreCollegeNotiCrawer(int id) {
		if(id == 1) {
			CollegeNotiUrl = TranCollegeNotiUrl;
			CollegeNotiDetailUrlHead = TranCollegeNotiDetailUrlHead;
			common_ui = "xwlb";
		}
		if(id == 2) {
			CollegeNotiUrl = BusiCollegeNotiUrl;
			CollegeNotiDetailUrlHead = BusiCollegeNotiDetailUrlHead;
			common_ui = "common-list";
			fnum = CollegeNotiList.size();
		}
		if(id == 3) {
			CollegeNotiUrl = PackCollegeNotiUrl;
			CollegeNotiDetailUrlHead = PackCollegeNotiDetailUrlHead;
			common_ui = "common-list";
			snum = CollegeNotiList.size();
		}
		try {
			doc = Jsoup.connect(CollegeNotiUrl).timeout(8000).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void getCollegeNoti(){
		
		Elements elements1 = doc.getElementsByClass(common_ui);
		//System.out.println(elements1.size());
		Elements CollegeNotiElements = elements1.select("li");
		//CollegeNotiElements.remove(0);
		for(int i=0;i<CollegeNotiElements.size();i++) {
			
			Element CollegeNotiElement = CollegeNotiElements.get(i);
			Elements links = CollegeNotiElement.getElementsByTag("a");
			Elements CollegeNotiElement3 = CollegeNotiElement.getElementsByTag("span");
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
		if(!currpage.get(0).text().equals(allpages.get(0).text())) {
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
	
//	public static void main(String[] args) {
//		MoreCollegeNotiCrawer newsCrawer = new MoreCollegeNotiCrawer(1);
//		newsCrawer.getCollegeNoti();
//	}
	
}
