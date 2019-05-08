package ClassLibrary;

import java.io.IOException;    
import java.util.logging.FileHandler;  
import java.util.logging.Level;   
import java.util.logging.Logger;  
public class logClass {  
	FileHandler fileHandler = null;
	public void test() {
		try {
			fileHandler = new FileHandler("userlog.log");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
    public  void printlog(String infomation){  
    	if(fileHandler==null)
    		test();
        Logger log = Logger.getLogger("testlog");  
        log.setLevel(Level.ALL);  
        
        fileHandler.setLevel(Level.ALL);  
        fileHandler.setFormatter(new logFormatter());  
        log.addHandler(fileHandler);  
        log.info(infomation);
        log.removeHandler(fileHandler);
    }  
}