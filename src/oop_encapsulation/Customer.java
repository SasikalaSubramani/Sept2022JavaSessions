package oop_encapsulation;

public class Customer {
	
	//POJO - Plain old java object
	private String name;
	private int  userId;
	private String emailId;
	
	public Customer(String name, int userId, String emailId) {
		
		this.name = name;
		this.userId = userId;
		this.emailId = emailId;
	}
	//setter methods are used to create the value and update the existing value
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	

}
