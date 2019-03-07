package com.chainsys.jobportal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.chainsys.jobportal.model.AdminRegistration;
import com.chainsys.jobportal.util.ConnectionUtil;

public class AdminRegisterDAO {
	// addAdmin method is used to registering the new admin.
	public void addAdmin(AdminRegistration adminregistration) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql = "insert into adminregistration(id,admin_id,admin_name,email_id,phone_number,password) values(adminregistration_idno_seq.NEXTVAL,?,?,?,?,?)";

			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, adminregistration.getAdminId());
			preparedStatement.setString(2, adminregistration.getAdminName());
			preparedStatement.setString(3, adminregistration.getEmailId());
			preparedStatement.setLong(4, adminregistration.getPhoneNumber());
			preparedStatement.setString(5, adminregistration.getPassword());
			preparedStatement.executeQuery();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			ConnectionUtil.close(connection, preparedStatement, null);
		}
	}
}
