package WindowBuilder;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.io.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.SwingConstants;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import javax.swing.JSeparator;

public class Balance extends JPanel {

	/**
	 * Create the panel.
	 */
	public Balance(String dormNum) {
		setBackground(Color.LIGHT_GRAY);
		setBounds(0, 0, 982, 524);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);
		panel.setBounds(0, 0, 982, 529);
		add(panel);
		
		JLabel label = new JLabel("\u5BBF\u820D\u7535\u8D39");
		label.setFont(new Font("����", Font.PLAIN, 24));
		label.setBounds(347, 86, 133, 26);
		panel.add(label);
		
		JLabel label_1 = new JLabel("\u5F53\u524D\u5269\u4F59\uFF1A");
		label_1.setFont(new Font("����", Font.PLAIN, 18));
		label_1.setBounds(282, 174, 116, 18);
		panel.add(label_1);
		
		JLabel label_7 = new JLabel();
		
		label_7.setFont(new Font("����", Font.PLAIN, 18));
		label_7.setBounds(408, 202, 471, 18);
		
		panel.add(label_7);
		
		JLabel label_2 = new JLabel();
		label_2.setFont(new Font("����", Font.PLAIN, 18));
		label_2.setBounds(408, 174, 252, 18);
		panel.add(label_2);
		if(dormNum==null) {
			label_7.setText("\u5bbf\u820d\u53f7\u4e0d\u5b58\u5728\uff0c\u8bf7\u5728\u4e2a\u4eba\u4fe1\u606f\u4e2d\u6b63\u786e\u586b\u5199");
			label_7.setForeground(Color.RED);
		}else {
			label_7.setText(dormNum);
			String res = getele(dormNum);
			if(res.equals("false"))
				label_2.setText("\u67e5\u8be2\u5931\u8d25\uff0c\u8bf7\u68c0\u67e5\u7f51\u7edc");
			else
				label_2.setText(res+"\uff08\u5ea6\uff09");
		}
		
		
		JLabel label_6 = new JLabel("\u63cf\u8ff0\uff1a");
		label_6.setHorizontalAlignment(SwingConstants.LEFT);
		label_6.setFont(new Font("����", Font.PLAIN, 18));
		label_6.setBounds(282, 202, 126, 18);
		panel.add(label_6);
		
		
		
		JLabel label_8 = new JLabel("\u5355\u4EF7\u7C7B\u578B\uFF1A    \u5B66\u751F\u7528\u7535[0.63\u5143]");
		label_8.setFont(new Font("����", Font.PLAIN, 18));
		label_8.setBounds(282, 233, 343, 18);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("\u6700\u5927\u8D1F\u8377\uFF1A    5A");
		label_9.setFont(new Font("����", Font.PLAIN, 18));
		label_9.setBounds(282, 261, 273, 18);
		panel.add(label_9);
		
		JLabel label_11 = new JLabel("\u62A5\u8B66\u4E0B\u9650\uFF1A    20\u5EA6");
		label_11.setFont(new Font("����", Font.PLAIN, 18));
		label_11.setBounds(282, 295, 252, 26);
		panel.add(label_11);
		
		JLabel label_12 = new JLabel("\u900F\u89C6\u4E0B\u9650\uFF1A    159\u5EA6");
		label_12.setFont(new Font("����", Font.PLAIN, 18));
		label_12.setBounds(281, 328, 222, 18);
		panel.add(label_12);
		
		JLabel label_13 = new JLabel("\u66F4\u65B0\u65F6\u95F4\uFF1A");
		label_13.setHorizontalAlignment(SwingConstants.LEFT);
		label_13.setFont(new Font("����", Font.PLAIN, 18));
		label_13.setBounds(282, 359, 91, 18);
		panel.add(label_13);
		
		JLabel label_14 = new JLabel();
		Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR); 
        int month = c.get(Calendar.MONTH) + 1; 
        int date = c.get(Calendar.DATE); 
        int hour = c.get(Calendar.HOUR_OF_DAY); 
        int minute = c.get(Calendar.MINUTE); 
        int second = c.get(Calendar.SECOND); 
        label_14.setText(year+"-"+month+"-"+date+" "+hour+":"+minute+":"+second);
		label_14.setFont(new Font("����", Font.PLAIN, 18));
		label_14.setBounds(397, 359, 197, 18);
		panel.add(label_14);

	}
	public String getele(String dormnum)
	{
		String Lurl = "http://202.116.25.12/Login.aspx";
    	String url = "http://202.116.25.12/default.aspx";
    	String viewstate = "";
        String eventvalidation = "";  
        String num = "";
        String rest = "";
        String nums = "";
        
    	
        
        CloseableHttpClient closeableHttpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(Lurl);
        List<NameValuePair> nvps = new ArrayList<>();
        nvps.add(new BasicNameValuePair("__LASTFOCUS", ""));
        nvps.add(new BasicNameValuePair("__EVENTTARGET", ""));
        nvps.add(new BasicNameValuePair("__EVENTARGUMENT", ""));
        nvps.add(new BasicNameValuePair("__VIEWSTATE", "/wEPDwULLTE5ODQ5MTY3NDlkZM4DISokA1JscbtlCdiUVQMwykIc"));
        nvps.add(new BasicNameValuePair("__EVENTVALIDATION", "/wEWBQLz+M6SBQK4tY3uAgLEhISACwKd+7q4BwKiwImNC7oxDnFDxrZR6l5WlUJDrpGZXrmN"));
        nvps.add(new BasicNameValuePair("__VIEWSTATEGENERATOR", "C2EE9ABB"));
        nvps.add(new BasicNameValuePair("txtname", dormnum));
        
        
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR); 
        int month = c.get(Calendar.MONTH); 
        int date = c.get(Calendar.DATE); 
        int hour = c.get(Calendar.HOUR_OF_DAY); 
        int minute = c.get(Calendar.MINUTE); 
        int second = c.get(Calendar.SECOND); 
        
        nvps.add(new BasicNameValuePair("hidtime", year+"-"+month+"-"+date+" "+hour+":"+minute+":"+second));
        nvps.add(new BasicNameValuePair("txtpwd", ""));
        nvps.add(new BasicNameValuePair("ctl01", ""));
        
        
        httpPost.setHeader("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
        
       
        httpPost.setHeader("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
        httpPost.setHeader("Accept-Encoding", "gzip, deflate, sdch");
        httpPost.setHeader("Accept-Language", "zh-CN,zh;q=0.8");
        httpPost.setHeader("Cache-Control", "max-age=0");
        httpPost.setHeader("Connection", "keep-alive");
   
        httpPost.setHeader("Content-Type", "application/x-www-form-urlencoded");
        httpPost.setHeader("Referer", "http://202.116.25.12/Login.aspx");
        httpPost.setHeader("Host", "202.116.25.12");
        httpPost.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36");
        httpPost.setHeader("Upgrade-Insecure-Requests", "1");
        
        
        

        String Cookie = "";
           
        try {
           
        	
            httpPost.setEntity(new UrlEncodedFormEntity(nvps, "UTF8"));
            CloseableHttpResponse httpResponse = closeableHttpClient.execute(httpPost);

           
            if(httpResponse.getStatusLine().getStatusCode() == 200) {
            	
                Header[] headers = httpResponse.getAllHeaders();
                for (Header header : headers) {
                	if(header.getName().equals("Set-Cookie"))
                		Cookie += header.getValue();
                }
               String[] Cookies = Cookie.split(";");
               int j;
               
               Cookies[2]=Cookies[2].substring(7);        
               Cookie = Cookies[0]+"; "+Cookies[2];
               
                	
                    
                	
                }
            else
            {
            	return "false";
            }
            
        } catch (UnsupportedEncodingException e) {

            e.printStackTrace();
        } catch (ClientProtocolException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        } finally {
        	
            httpPost.abort();  
        }
        
      

        
        CloseableHttpClient closeableHttpClients = HttpClients.createDefault();
     
        HttpGet httpGet = new HttpGet(url);
        httpGet.setHeader("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36"); 
        httpGet.setHeader("cookie", Cookie);
        
        httpGet.setHeader("Connection", "keep-alive");
        String body = "";
           
        try {
            
            CloseableHttpResponse httpResponses = closeableHttpClients.execute(httpGet);
            HttpEntity entity = httpResponses.getEntity();
            body = EntityUtils.toString(entity, "UTF8");
            String regex = "id=\"__VIEWSTATE\" value=\"(.+?)\"";
              
            Pattern pattern1 = Pattern.compile(regex);  
            Matcher matcher1 = pattern1.matcher(body);  
            
            while (matcher1.find()) {  
            	
            	viewstate = matcher1.group(1);
                     }  
            
            regex = "id=\"__EVENTVALIDATION\" value=\"(.+?)\"";
            
            pattern1 = Pattern.compile(regex);  
            matcher1 = pattern1.matcher(body);  
            
            while (matcher1.find()) {  
            	
            	eventvalidation = matcher1.group(1);
                     }  
            
            regex = "(\\[\\u7535\\u8868\\]\\|\\d+)";
            
            pattern1 = Pattern.compile(regex);  
            matcher1 = pattern1.matcher(body);  
            while (matcher1.find()) {  
            	
            	num = matcher1.group(1);
                     }
            System.out.println(num);
            nums = num.substring(0, 4) + num.substring(5);
            

            
            
        } catch (UnsupportedEncodingException e) {

            e.printStackTrace();
        } catch (ClientProtocolException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        } finally {
        	
            httpPost.abort();     
        }
        
      
        CloseableHttpClient closeableHttpClientss = HttpClients.createDefault();
        
        HttpPost httpPosts = new HttpPost(url);
   
        List<NameValuePair> nvpss = new ArrayList<>();
        nvpss.add(new BasicNameValuePair("__EVENTTARGET", "RegionPanel1%24Region2%24GroupPanel1%24ContentPanel1%24DDL_%E7%9B%91%E6%8E%A7%E9%A1%B9%E7%9B%AE"));
        nvpss.add(new BasicNameValuePair("__VIEWSTATE", viewstate));
        nvpss.add(new BasicNameValuePair("__VIEWSTATEGENERATOR", "CA0B0334"));
        nvpss.add(new BasicNameValuePair("__EVENTVALIDATION", eventvalidation));
        nvpss.add(new BasicNameValuePair("PandValue", "10"));
        nvpss.add(new BasicNameValuePair("hidpageCurrentSize", "1"));
        nvpss.add(new BasicNameValuePair("hidpageSum", "1")); 
        nvpss.add(new BasicNameValuePair("hidpageCurrentSize2", "1"));
        nvpss.add(new BasicNameValuePair("hidpageSum2", "4"));
        nvpss.add(new BasicNameValuePair("hidpageCurrentSize3", "1"));
        nvpss.add(new BasicNameValuePair("hidpageSum3", "25"));
        nvpss.add(new BasicNameValuePair("__12_value", num));
        
        nvpss.add(new BasicNameValuePair("RegionPanel1$Region3$ContentPanel3$tb_ammeterNumb", nums));
        
        nvpss.add(new BasicNameValuePair("__41_value", "00900200"));
        nvpss.add(new BasicNameValuePair("RegionPanel1$Region1$GroupPanel2$Grid3$Toolbar2$pagesize3", "1"));
        nvpss.add(new BasicNameValuePair("RegionPanel1$Region1$GroupPanel2$Grid2$Toolbar3$pagesize2", "1"));
        nvpss.add(new BasicNameValuePair("RegionPanel1$Region1$GroupPanel2$Grid1$Toolbar1$pagesize", "1"));
        nvpss.add(new BasicNameValuePair("__box_page_state_changed", "false"));
        nvpss.add(new BasicNameValuePair("__12_last_value", num));
        nvpss.add(new BasicNameValuePair("__41_last_value", "00000000"));
        nvpss.add(new BasicNameValuePair("__box_ajax_mark", "true"));
        
        
        httpPosts.setHeader("User-Agent","Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; rv:11.0) like Gecko Core/1.70.3676.400 QQBrowser/10.4.3469.400");
        httpPosts.setHeader("cookie",Cookie);
        httpPosts.setHeader("Accept", "*/*");
        httpPosts.setHeader("Accept-Encoding", "gzip, deflate");
        httpPosts.setHeader("Accept-Language", "zh-cn");
        httpPosts.setHeader("Cache-Control", "no-cache");
        httpPosts.setHeader("Connection", "keep-alive");
 
        httpPosts.setHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        httpPosts.setHeader("Referer", "http://202.116.25.12/default.aspx");
        httpPosts.setHeader("Host", "202.116.25.12");
        httpPosts.setHeader("X-Requested-With", "XMLHttpRequest");
        
        
     
       
        
        
 
        try {
           
        	
            httpPosts.setEntity(new UrlEncodedFormEntity(nvpss, "UTF8"));
            CloseableHttpResponse httpResponsess = closeableHttpClientss.execute(httpPosts);
            HttpEntity entity = httpResponsess.getEntity();
            
            String bodys = EntityUtils.toString(entity, "UTF8");
            String regex = "box.__27.setValue\\(\"(.+?)\"\\)";
            
            Pattern pattern1 = Pattern.compile(regex);  
            Matcher matcher1 = pattern1.matcher(bodys);  
            
            while (matcher1.find()) {  
            	
            	rest = matcher1.group(1);
                     }  
           
            
                
            
        } catch (UnsupportedEncodingException e) {

            e.printStackTrace();
        } catch (ClientProtocolException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        } finally {
        	
            httpPost.abort();      
        }
        return rest;
	}

}
