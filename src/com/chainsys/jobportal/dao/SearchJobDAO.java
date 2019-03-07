package com.chainsys.jobportal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.chainsys.jobportal.model.Admin;
import com.chainsys.jobportal.util.ConnectionUtil;

public class SearchJobDAO {
	/*
	 * serachJob( String deptName) method is used to display the related vacancy
	 * details table when user pass the department name.
	 */
	public Admin searchJob(String deptName) throws SQLException {
		Connection connection = ConnectionUtil.getConnection();
		String sql = "select vacancy_dept,vacancy_details,job_location,company_name from admin where vacancy_dept=?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, deptName);
		ResultSet resultset = preparedStatement.executeQuery();
		Admin admin = null;
		if (resultset.next()) {
			admin = new Admin();
			admin.setVacancyDept(resultset.getString("vacancy_dept"));
			admin.setVacancyDetails(resultset.getString("vacancy_details"));
			admin.setJobLocation(resultset.getString("job_location"));
			admin.setCompanyName(resultset.getString("company_name"));
		} else {
			System.out.println("DEPTNAME ERROR");
		}
		ConnectionUtil.close(connection, preparedStatement, resultset);
		return admin;
	}

	/*
	 * searchLocation( String jobLocation) method is used to display the related
	 * vacancy details table when user pass the job loacation name.
	 */
	public Admin searchLocation(String jobLocation) throws SQLException {
		Connection connection = ConnectionUtil.getConnection();
		String sql = "select vacancy_dept,vacancy_details,job_location,company_name from admin where job_location=?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, jobLocation);
		ResultSet rset = preparedStatement.executeQuery();
		Admin admin = null;
		if (rset.next()) {
			admin = new Admin();
			admin.setVacancyDept(rset.getString("vacancy_dept"));
			admin.setVacancyDetails(rset.getString("vacancy_details"));
			admin.setJobLocation(rset.getString("job_location"));
			admin.setCompanyName(rset.getString("company_name"));
		} else {
			System.out.println("JOBLOCATION ERROR");
		}
		ConnectionUtil.close(connection, preparedStatement, rset);
		return admin;
	}

	/*
	 * searchCompany( String companyName) method is used to display the related
	 * vacancy details table when user pass the company name.
	 */
	public Admin searchCompany(String companyName) throws SQLException {
		Connection connection = ConnectionUtil.getConnection();
		String sql = "select vacancy_dept,vacancy_details,job_location,company_name from admin where company_name=?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, companyName);
		ResultSet result = preparedStatement.executeQuery();
		Admin admin = null;
		if (result.next()) {
			admin = new Admin();
			admin.setVacancyDept(result.getString("vacancy_dept"));
			admin.setVacancyDetails(result.getString("vacancy_details"));
			admin.setJobLocation(result.getString("job_location"));
			admin.setCompanyName(result.getString("company_name"));
		} else {
			System.out.println("COMPANY NAME ERROR");
		}
		ConnectionUtil.close(connection, preparedStatement, result);
		return admin;
	}

	/*
	 * searchVacancy( String vacancyDetails) method is used to display the
	 * related vacancy details table when user pass the vacancyDetails name.
	 */
	public Admin searchVacancy(String vacancyDetails) throws SQLException {
		Connection connection = ConnectionUtil.getConnection();
		String sql = "select vacancy_dept,vacancy_details,job_location,company_name from admin where vacancy_details=?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, vacancyDetails);
		ResultSet rSet = preparedStatement.executeQuery();
		Admin admin = null;
		if (rSet.next()) {
			admin = new Admin();
			admin.setVacancyDept(rSet.getString("vacancy_dept"));
			admin.setVacancyDetails(rSet.getString("vacancy_details"));
			admin.setJobLocation(rSet.getString("job_location"));
			admin.setCompanyName(rSet.getString("company_name"));
		} else {
			System.out.println("COMPANY NAME ERROR");
		}
		ConnectionUtil.close(connection, preparedStatement, rSet);
		return admin;

	}

}
