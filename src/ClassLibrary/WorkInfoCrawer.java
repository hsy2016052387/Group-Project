package ClassLibrary;

import java.io.IOException;
import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;


public class WorkInfoCrawer {
	private final String workInfoUrl = "https://career.jnu.edu.cn/eweb/jygl/zpfw.so?modcode=jygl_scfwzpxx&subsyscode=zpfw&type=searchZprd&sysType=TPZPFW&zpxxType=new";
	private final String workDetailInfoUrlHead = "https://career.jnu.edu.cn/eweb/jygl/zpfw.so?modcode=jygl_zpfwzpgg&subsyscode=zpfw&type=view&id=";
	public static ArrayList<String> workInfoList = new ArrayList<String>();
	public static ArrayList<String> linkList = new ArrayList<String>();
	public static ArrayList<String> dateList = new ArrayList<String>();
	private Document doc = null;
	
	public WorkInfoCrawer() {
		try {
			doc = Jsoup.connect(workInfoUrl).timeout(8000).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void getWorkInfo(){
		
		Elements elements1 = doc.select(".z_newsl");
		Elements workInfoElements = elements1.select("li");
		//workInfoElements.remove(0);
		for(int i=1;i<workInfoElements.size();i++) {
			Element workInfoElement = workInfoElements.get(i);
			Elements links = workInfoElement.getElementsByTag("a");
			Elements dates = workInfoElement.select("div");
			String date = dates.get(1).text();
			String linkHref = links.get(0).attr("onclick");
			String linkText = links.get(0).text();
			String detailLink = workDetailInfoUrlHead+linkHref.substring(10,32);
			workInfoList.add(linkText);
			linkList.add(detailLink);
			dateList.add(date);
		}
		
		
	}
	
	
}