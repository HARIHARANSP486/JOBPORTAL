package com.chainsys.jobportal.model;

public class Admin {
	private int id;
	private int adminId;
	private String adminName;
	private String vacancyDept;
	private String vacancyDetails;
	private String jobLocation;
	private String companyName;
	private Long phoneNumber;
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
	public String getVacancyDept() {
		return vacancyDept;
	}
	public void setVacancyDept(String vacancyDept) {
		this.vacancyDept = vacancyDept;
	}
	public String getVacancyDetails() {
		return vacancyDetails;
	}
	public void setVacancyDetails(String vacancyDetails) {
		this.vacancyDetails = vacancyDetails;
	}
	public String getJobLocation() {
		return jobLocation;
	}
	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phone) {
		this.phoneNumber = phone;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", adminId=" + adminId + ", adminName="
				+ adminName + ", vacancyDept=" + vacancyDept
				+ ", vacancyDetails=" + vacancyDetails + ", jobLocation="
				+ jobLocation + ", companyName=" + companyName
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
	

}
