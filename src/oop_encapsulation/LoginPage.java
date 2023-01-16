package oop_encapsulation;

public class LoginPage {
	
	private String userName;
	private String passWord;
	String role;
	
	public LoginPage(String userName, String passWord, String role) {
		
		this.userName = userName;
		this.passWord = passWord;
		this.role = role;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	public String getUserInfo() {
		return userName + " " + passWord  + " " + role;
		
	}
	

}
