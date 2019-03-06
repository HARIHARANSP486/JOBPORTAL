package com.chainsys.jobportal.model;

public class AdminRegistration {
	private int id;
	private int adminId;
	private String adminName;
	private String emailId;
	private long phoneNumber;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "adminrgistration [id=" + id + ", adminId=" + adminId
				+ ", adminName=" + adminName + ", emailId=" + emailId
				+ ", phoneNumber=" + phoneNumber + ", password=" + password
				+ "]";
	}
	

}
