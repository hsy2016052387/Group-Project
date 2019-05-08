package WindowBuilder;

public class User {
	private static String loginaccount;
	private static String loginpassword;
	
	public void SetAccount() {
		loginaccount=Login.textField.getText();
	}
	
	public String GetAccount() {
		return loginaccount;
	}
}
