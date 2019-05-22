package ClassLibrary;

public class UserInfo {
	private String name = "";
	private String studentID;
	private String college;
	private String major;
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setStudentID(String studentID){
		this.studentID = studentID;
	}
	
	public void setCollege(String college){
		this.college = college;
	}
	
	public void setMajor(String major){
		this.major = major;
	}
	
	
	public String getName() {
		return name;
	}
	
	public String getStudentID() {
		return studentID;
	}
	
	public String getCollege() {
		return college;
	}
	
	public String getMajor() {
		return major;
	}
	
}
