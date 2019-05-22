package WindowBuilder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import WindowBuilder.Request;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

/**
 * Hello world!
 *
 */
public class LeaveOutput 
{  
	private Configuration configuration = null;
	
	public LeaveOutput(){  
	        configuration = new Configuration();  
	        configuration.setDefaultEncoding("UTF-8");  
	    }
	 public static void main(String[] args) throws IOException  {  
	        LeaveOutput test = new LeaveOutput();  
	        test.createWord();  
	    }
	 public void createWord() throws IOException {  
	        Map<String,Object> dataMap=new HashMap<String,Object>();  
	        getData(dataMap); 
	        String path = System.getProperty("user.dir")+"./src/WindowBuilder";//FTL文件所在位置
	        configuration.setDirectoryForTemplateLoading(new File(path));
	        Template t=null;
	        try {  
	            t = configuration.getTemplate("leave.ftl","UTF-8");    //FTL文件名称
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	        File outFile = new File("./请假条.doc");  //输出文件名称
	        Writer out = null;  
	        try {  
	            out = new OutputStreamWriter(new FileOutputStream(outFile),"UTF-8");  
	        } catch (FileNotFoundException e1) {  
	            e1.printStackTrace();  
	        }  
	           
	        try {  
	            t.process(dataMap, out);  
	        } catch (TemplateException e) {  
	            e.printStackTrace();  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	    }
  
	 private void getData(Map<String, Object> dataMap) {  
//		 dataMap.put("number!", "xiaom");  
//	        dataMap.put("name!", "xiaom");
//	        dataMap.put("reason!","xiaom");      
//	        dataMap.put("institute!","xiaom");   
//	        dataMap.put("specialty!","xiaom"); 
		 


	        dataMap.put("number", LeaveRequest.leave_number);  
	        dataMap.put("name", LeaveRequest.leave_name);
	        dataMap.put("reason",LeaveRequest.leave_reason);      
	        dataMap.put("institute",LeaveRequest.leave_reason);   
	        dataMap.put("specialty",LeaveRequest.leave_specialty);   
	    }
}