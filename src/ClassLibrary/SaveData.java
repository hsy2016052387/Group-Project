package ClassLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import org.eclipse.jetty.client.RequestNotifier;

import WindowBuilder.Login;


public class SaveData {
	
	//private static File file;
	String path=this.getClass().getClassLoader().getResource(".").getPath();
	String pString=path+"../data/"+Login.user.GetAccount()+".txt";
	//btnNewButton_1.setIcon(new ImageIcon(path+"../images/download.png"));
    //File storeFile=new File(path+"../images/yzm.gif");

    //private String file="val.dat";
	public SaveData() {
		try{
			//System.out.println(path);
			String pString=path+"../data/"+Login.user.GetAccount()+".txt";
			File file =new File(pString);
            if(file.createNewFile())
                System.out.println("文件创建成功！");
            else
                System.out.println("出错了，该文件已经存在。");
        }
        catch(IOException ioe) {
            ioe.printStackTrace();
        }
	}
    
    public ArrayList<Score> load() {
    	File file =new File(pString);
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            return (ArrayList<Score>) ois.readObject();
        } catch ( FileNotFoundException e ) {
        } catch ( Exception e ) {
            e.printStackTrace();
// 反序列化失败 - 删除缓存文件
            if ( e instanceof InvalidClassException ) {
                //File data = getFileStreamPath(file);
                //data.delete();
            }
        } finally {
            try {
                ois.close();
            } catch ( Exception e ) {
            }
            try {
                fis.close();
            } catch ( Exception e ) {
            }
        }
        return null;
    }

    public void save(Serializable ser){
    	File file =new File(pString);
    	try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file)))
        {
            //将List转换成数组
            //TestObject[] obj = new TestObject[list.size()];
            //list.toArray(obj);
            //执行序列化存储
            out.writeObject(ser);
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
