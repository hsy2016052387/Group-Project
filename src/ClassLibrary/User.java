package ClassLibrary;

import java.util.ArrayList;

import org.jsoup.select.Elements;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

import WindowBuilder.Login;

public class User  {
	private static String loginaccount;
	private static String loginpassword;
	private static ArrayList<Score> scores;
	
	public User() {
		loginaccount=Login.textField.getText();
		loginpassword=Login.passwordField.getText();
		//反序列化读取scores，scores为空或不为空。
		//String path1=this.getClass().getClassLoader().getResource(".").getPath();
		//String path=path1+"../data/"+Login.user.GetAccount()+".dat";
		//SaveData saveData=new SaveData();
		//scores=saveData.load();
		//scores=new ArrayList<Score>();
	}
	
	public String GetAccount() {
		return loginaccount;
	}
	
	
	public String GetPassward() {
		return loginpassword;
	}
	
	public void InizedScores(Elements trs) {
		scores=new ArrayList<Score>();
		for(int i=1;i<trs.size();i++) {
			Elements tds=trs.get(i).select("td");
			Score score=new Score();
			score.setAcademic_year(tds.get(0).text());
			score.setTerm(tds.get(1).text());
			score.setCourse(tds.get(2).text());
			score.setCredit(tds.get(3).text());
			score.setGrades(tds.get(4).text());
			score.setGPA(tds.get(5).text());
			score.setExam_date(tds.get(6).text());
			score.setExam_properties(tds.get(7).text());
			score.setCourse_type(tds.get(8).text());
			score.setStudy_type(tds.get(9).text());
			score.setStatus(tds.get(10).text());
			scores.add(score);
		}
	}
	
	public ArrayList<Score> GetScores(){
		return scores;
	}
	
	public void loadScores() {
		SaveData saveData=new SaveData();
		scores=saveData.load();
	}
}
