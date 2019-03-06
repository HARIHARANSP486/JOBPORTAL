package com.chainsys.jobportal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.chainsys.jobportal.model.Admin;
import com.chainsys.jobportal.util.ConnectionUtil;

public class FindAllDAO {
	public ArrayList<Admin> findAll(String deptName) throws SQLException
	{
		Connection connection=ConnectionUtil.getConnection();
		String sql="select vacancy_dept,vacancy_details,job_location,company_name from admin where vacancy_dept=?";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setString(1, deptName);
		 ResultSet resultSet=preparedStatement.executeQuery();   
		 ArrayList<Admin> adminlist=new ArrayList<>();
		 Admin adminDetails=null;
		 while(resultSet.next())
		 {
			 adminDetails=new Admin();
			 adminDetails.setVacancyDept(resultSet.getString("vacancy_dept"));
			 adminDetails.setVacancyDetails(resultSet.getString("vacancy_details"));
			 adminDetails.setJobLocation(resultSet.getString("job_location"));
			 adminDetails.setCompanyName(resultSet.getString("company_name"));
			 adminlist.add(adminDetails);
			 
		 }
		 ConnectionUtil.close(connection, preparedStatement, resultSet);
		 return adminlist;
	}
	public ArrayList<Admin> searchLocation(String jobLocation) throws SQLException
	{
		Connection connection=ConnectionUtil.getConnection();
		String sql="select vacancy_dept,vacancy_details,job_location,company_name from admin where job_location=?";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setString(1,jobLocation);
		ResultSet rset=preparedStatement.executeQuery();
		ArrayList<Admin> adminlist=new ArrayList<Admin>();
		Admin adminDetails=null;
		while(rset.next())
		{
			adminDetails=new Admin();
			adminDetails.setVacancyDept(rset.getString("vacancy_dept"));
			adminDetails.setVacancyDetails(rset.getString("vacancy_details"));
			adminDetails.setJobLocation(rset.getString("job_location"));
			adminDetails.setCompanyName(rset.getString("company_name"));
			adminlist.add(adminDetails);
		}
		ConnectionUtil.close(connection, preparedStatement, rset);
		return adminlist;
		
	}
	public ArrayList<Admin> searchCompany(String companyName) throws SQLException
	{
		Connection connection=ConnectionUtil.getConnection();
		String sql="select vacancy_dept,vacancy_details,job_location,company_name from admin where company_name=?";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setString(1,companyName);
		ResultSet result=preparedStatement.executeQuery();
		ArrayList<Admin> adminlist=new ArrayList<>();
		Admin adminDetails=null;
		while(result.next())
		{
			System.out.println("harisp");
			adminDetails=new Admin();
			adminDetails.setVacancyDept(result.getString("vacancy_dept"));
			adminDetails.setVacancyDetails(result.getString("vacancy_details"));
			adminDetails.setJobLocation(result.getString("job_location"));
			adminDetails.setCompanyName(result.getString("company_name"));
			adminlist.add(adminDetails);
		}
		ConnectionUtil.close(connection, preparedStatement, result);
		return adminlist;
		
	}
	public ArrayList<Admin> searchVacancy(String vacancyDetails) throws SQLException
	{
		Connection connection=ConnectionUtil.getConnection();
		String sql="select vacancy_dept,vacancy_details,job_location,company_name from admin where vacancy_details=?";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setString(1,vacancyDetails);
		ResultSet rSet=preparedStatement.executeQuery();
		ArrayList<Admin> adminlist=new ArrayList<>();
		
		Admin adminDetails=null;
		while(rSet.next())
		{ 
			System.out.println("harisp");
			adminDetails=new Admin();
			adminDetails.setVacancyDept(rSet.getString("vacancy_dept"));
			adminDetails.setVacancyDetails(rSet.getString("vacancy_details"));
			adminDetails.setJobLocation(rSet.getString("job_location"));
			adminDetails.setCompanyName(rSet.getString("company_name"));
			adminlist.add(adminDetails);
		}
		ConnectionUtil.close(connection, preparedStatement, rSet);
		return adminlist;
		
	}
		
		
	


}
