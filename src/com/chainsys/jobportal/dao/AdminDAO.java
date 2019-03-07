package com.chainsys.jobportal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.chainsys.jobportal.model.Admin;
import com.chainsys.jobportal.util.ConnectionUtil;

public class AdminDAO {
	/*
	 * addDetails method is used to add the details about vacancy happens in the
	 * industry
	 */
	public void addDetails(Admin admin) throws Exception {
		Connection connection = null;
		PreparedStatement preparedstatement = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "insert into admin(id,vacancy_dept,vacancy_details,job_location,company_name,reference_numbers) values(admin_id_seq.NEXTVAL,?,?,?,?,?,?,?)";
			preparedstatement = connection.prepareStatement(sql);
			preparedstatement.setString(1, admin.getVacancyDept());
			System.out.println(admin.getVacancyDept());
			preparedstatement.setString(2, admin.getVacancyDetails());
			preparedstatement.setString(3, admin.getJobLocation());
			preparedstatement.setString(4, admin.getCompanyName());
			preparedstatement.setLong(5, admin.getPhoneNumber());
			preparedstatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, preparedstatement, null);
		}
	}

	/*
	 * checkLogin is used to check the admin phone number where it is present in
	 * the admin registration table.
	 */
//	public Admin checkLogin(Admin admin) {
//		Admin administration = null;
//		Connection connection = null;
//		PreparedStatement preparedstatement = null;
//		try {
//			connection = ConnectionUtil.getConnection();
//			String sql = "select phone_no from admin where phone_no=?";
//			preparedstatement = connection.prepareStatement(sql);
//			long phone = admin.getPhoneNumber();
//			preparedstatement.setLong(1, phone);
//			preparedstatement.executeUpdate();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			ConnectionUtil.close(connection, preparedstatement, null);
//		}
//		return administration;
	}


