package ClassLibrary;

import java.io.Serializable;

public class PasswordInfo implements Serializable{
	private String studyJnuAccount;
	private String studyJnuPassword;
	private String shuziJnuAccount;
	private String shuziJnuPassword;
	private String schoolCardAccount;
	private String schoolCardPassword;
	
	public void setStudyJnuAccount(String studyJnuAccount) {
		this.studyJnuAccount = studyJnuAccount;
	}
	
	public void setStudyJnuPassword(String studyJnuPassword) {
		this.studyJnuPassword = studyJnuPassword;
	}
	
	public void setShuziJnuAccount(String shuziJnuAccount) {
		this.shuziJnuAccount = shuziJnuAccount;
	}
	
	public void setShuziJnuPassword(String shuziJnuPassword) {
		this.shuziJnuPassword = shuziJnuPassword;
	}
	
	public void setSchoolCardAccount(String schoolCardAccount) {
		this.schoolCardAccount = schoolCardAccount;
	}
	
	public void setSchoolCardPassword(String schoolCardPassword) {
		this.schoolCardPassword = schoolCardPassword;
	}
	
	public String getStudyJnuAccount() {
		return studyJnuAccount;
	}
	
	public String getStudyJnuPassword() {
		return studyJnuPassword;
	}
	
	public String getShuziJnuAccount() {
		return shuziJnuAccount;
	}
	
	public String getShuziJnuPassword() {
		return shuziJnuPassword;
	}
	
	public String getSchoolCardAccount() {
		return schoolCardAccount;
	}
	
	public String getSchoolCardPassword() {
		return schoolCardPassword;
	}
}
