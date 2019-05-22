package ClassLibrary;

import java.io.Serializable;

public class Dorm implements Serializable {
	private String dormID;
	
	public void setDormID(String dormID) {
		this.dormID = dormID;
	}
	
	public String getDormID() {
		return dormID;
	}
}
