package com.chainsys.jobportal.model;

public class Admin {
	private int id;
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
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", vacancyDept=" + vacancyDept
				+ ", vacancyDetails=" + vacancyDetails + ", jobLocation="
				+ jobLocation + ", companyName=" + companyName
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	

	
	}


