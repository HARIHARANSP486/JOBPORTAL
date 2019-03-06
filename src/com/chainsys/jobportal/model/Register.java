package com.chainsys.jobportal.model;

public class Register {

	
	private String name;
	private long phonenumber;
	private String email;
	private String password;
	private String deptname;
	private int experience;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Register [name=" + name + ", phonenumber=" + phonenumber
				+ ", email=" + email + ", password=" + password + ", deptname="
				+ deptname + ", experience=" + experience + "]";
	}
	
}
