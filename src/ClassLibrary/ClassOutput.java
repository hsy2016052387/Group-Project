package ClassLibrary;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import WindowBuilder.Request;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import WindowBuilder.*;

/**
 * Hello world!
 *
 */
public class ClassOutput 
{
	public Configuration configuration = null;
	
	public ClassOutput(){  
	        configuration = new Configuration();  
	        configuration.setDefaultEncoding("UTF-8");  
	    }
	 public static void main(String[] args) throws IOException {  
	        ClassOutput test = new ClassOutput();  
	        test.createWord();  
	    }
	 public void createWord() throws IOException{  
	        Map<String,Object> dataMap=new HashMap<String,Object>();  
	        getData(dataMap);  
	        String path = System.getProperty("user.dir")+"./ftl";
	        configuration.setDirectoryForTemplateLoading(new File(path));
	        Template t=null;  
	        try {  
	            t = configuration.getTemplate("Class.ftl","UTF-8"); 
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	        File outFile = new File("./\u8bfe\u5ba4\u7533\u8bf7.doc"); 
	        Writer out = null;  
	        try {  
	            out =new OutputStreamWriter(new FileOutputStream(outFile),"UTF-8");  
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
    
	 public void getData(Map<String, Object> dataMap) {  


	        dataMap.put("num1", ClassRequest.class_num1);  
	        dataMap.put("num2",  ClassRequest.class_num2);
	        dataMap.put("num3", ClassRequest.class_num3);      
	        dataMap.put("Intended", ClassRequest.class_intended);   
	        dataMap.put("name", ClassRequest.class_name);   
	        dataMap.put("phone", ClassRequest.class_phone);
	        dataMap.put("purpose", ClassRequest.class_purpose);
	    }
}