package com.levelup;

public class Contact {

	private String name;
	private String telephone;
	private String emailAddress;
	
	public Contact(String name, String telephone, String emailAddress) {
		super();
		this.name = name;
		this.telephone = telephone;
		this.emailAddress = emailAddress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
}
