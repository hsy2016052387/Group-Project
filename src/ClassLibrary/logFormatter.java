package ClassLibrary;

import java.util.Date;  
import java.util.logging.Formatter;  
import java.util.logging.LogRecord;
class logFormatter extends Formatter {  
    @Override  
    public String format(LogRecord record) {  
        Date date = new Date();  
        String sDate = date.toString();  
        return "[" + sDate + "]" +"   "+ "[" + record.getLevel() + "]"  
                 + record.getMessage() + "\r\n";  
    }  
} 
