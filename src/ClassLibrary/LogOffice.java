package ClassLibrary;

import java.io.File;

import WindowBuilder.BrowserPanel;
import WindowBuilder.Login;
import WindowBuilder.MainInterface;

import java.io.IOException;
import java.net.MalformedURLException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.FailingHttpStatusCodeException;
import com.gargoylesoftware.htmlunit.NicelyResynchronizingAjaxController;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlImage;
import com.gargoylesoftware.htmlunit.html.HtmlInput;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.javascript.host.Element;

public class LogOffice {
	public static HtmlPage page;
	String Account;
	String Passward;
	String VC;
	public static HtmlPage page2;
	public static WebClient client;
    public LogOffice() {
        client = new WebClient(BrowserVersion.CHROME);
        client.getOptions().setJavaScriptEnabled(true);    //默认执行js，如果不执行js，则可能会登录失败，因为用户名密码框需要js来绘制。
        client.getOptions().setCssEnabled(false);
        client.setAjaxController(new NicelyResynchronizingAjaxController());
        client.getOptions().setThrowExceptionOnScriptError(false);
    }
    
    //获得并设置验证码图片在登录界面
    public void SetVCImage() {
    	 try {
    	        page = client.getPage("https://jwxt.jnu.edu.cn/Login.aspx");
    	        //获取验证码图片
    	        HtmlImage vcImage=(HtmlImage)page.getFirstByXPath("//*[@id=\"Table16\"]/tbody/tr[9]/td[3]/img");
    	        //ImageIcon icon=new ImageIcon(vcImage);
    	        //Login.lblNewLabel.s
    			String path = this.getClass().getClassLoader().getResource(".").getPath();
    			//btnNewButton_1.setIcon(new ImageIcon(path+"../images/download.png"));
    	        File storeFile=new File(path+"../images/yzm.gif");
    	        vcImage.saveAs(storeFile);
    	        ImageIcon icon=new ImageIcon(ImageIO.read(new File(path+"../images/yzm.gif")));
    	        Login.lblNewLabel.removeAll();
    	        Login.lblNewLabel.setIcon(icon);
    	        Login.lblNewLabel.updateUI();
    	        }catch (FailingHttpStatusCodeException | IOException e) {
    				// TODO: handle exception
    	        	//return false;
    	        	e.printStackTrace();
    			}
    }
    
    //设置账号、密码、验证码并登录
    public boolean Login(String Account,String Passward,String VC) {
    	this.Account=Account;
    	this.Passward=Passward;
    	this.VC=VC;
        HtmlInput ln = page.getHtmlElementById("txtYHBS");
        HtmlInput pwd = page.getHtmlElementById("txtYHMM");
        HtmlInput VerificationCode=(HtmlInput)page.getElementById("txtFJM");
        HtmlInput btn = page.getFirstByXPath("//*[@id=\"btnLogin\"]");
        ln.setAttribute("value", Account);
        pwd.setAttribute("value", Passward);
        VerificationCode.setAttribute("value", VC);
        try {
        	 page2 = btn.click();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			//return false;
		}
        System.out.println(page2.getBaseURI());
       if(page2.getBaseURI().equals("https://jwxt.jnu.edu.cn/Login.aspx")) {
    	   System.out.println("登录失败");
    	   return false;
       }
       else
    	   System.out.println("登录成功");
       return true;
	}
    
    //从教务处获得成绩并保存在user里面
    public void GetScoreTable() {
    	try {
			HtmlPage page=client.getPage("https://jwxt.jnu.edu.cn/Secure/Cjgl/Cjgl_Cjcx_WdCj.aspx");
			String pageXml = page.asXml();
			HtmlElement cx_btn=(HtmlElement)page.getFirstByXPath("//*[@id=\"lbtnQuery\"]");
			HtmlPage page2=cx_btn.click();
			Document document=Jsoup.parse(page2.asXml());
			Elements elements=document.select("#GVLSCJ").select("tbody");
			Login.user.InizedScores(elements.select("tr"));
		} catch (FailingHttpStatusCodeException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
    }
    
    //从教务处上获取个人信息
    public void GetUserInfo() {
    	try {
			HtmlPage page=client.getPage("https://jwxt.jnu.edu.cn/Secure/Xjgl/Xjgl_Xsxxgl_Xjxxxg_XS.aspx");
			Document document = Jsoup.parse(page.asXml());
			Elements elements1 = document.select("#TableJB1");
			
			Elements inputs = elements1.select("input");
			
			MainInterface.userInfo.setStudentID(inputs.get(3).attr("value"));
			MainInterface.userInfo.setCollege(inputs.get(4).attr("value"));
			MainInterface.userInfo.setName(inputs.get(6).attr("value"));
			MainInterface.userInfo.setMajor(inputs.get(10).attr("value"));
			//System.out.print(inputs.get(3).attr("value")+inputs.get(4).attr("value")+inputs.get(6).attr("value")+inputs.get(10).attr("value"));
			
		} catch (FailingHttpStatusCodeException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
    }
    
    public Elements GetTrainPlan() {
    	try {
			HtmlPage page=client.getPage("https://jwxt.jnu.edu.cn/default.aspx");
			String pageXml=page.asXml();
			//System.out.println(pageXml);
			Document document=Jsoup.parse(pageXml);
			Elements elements=document.select(".yaoqiu").select("table").select("tbody");
			return elements.select("tr");
		} catch (FailingHttpStatusCodeException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
    	return new Elements();
	}
}
