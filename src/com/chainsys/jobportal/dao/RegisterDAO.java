package com.chainsys.jobportal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.chainsys.jobportal.model.AdminRegistration;
import com.chainsys.jobportal.model.Register;
import com.chainsys.jobportal.util.ConnectionUtil;

public class RegisterDAO {

	public void addUser(Register register) throws Exception {
		Connection connection =null;
		PreparedStatement preparedstatement=null;
		try {
			 connection = ConnectionUtil.getConnection();
			String sql = "insert into register(name,phone_number,email,password,dept_name,experience) values(?,?,?,?,?,?)";
			preparedstatement = connection
					.prepareStatement(sql);
			preparedstatement.setString(1, register.getName());
			preparedstatement.setLong(2, register.getPhonenumber());
			preparedstatement.setString(3, register.getEmail());
			preparedstatement.setString(4, register.getPassword());
			preparedstatement.setString(5, register.getDeptname());
			preparedstatement.setInt(6, register.getExperience());
			preparedstatement.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			ConnectionUtil.close(connection, preparedstatement, null);
		}
	}
	public Boolean checkLogin(Register register) {
		Boolean isFind=false;
		Connection connection=null;
		PreparedStatement preparedstatement =null;
		ResultSet resultSet=null;
				try {
			 connection = ConnectionUtil.getConnection();
			String sql = "select phone_number,password from register where phone_number=? and password=?";
			preparedstatement = connection
					.prepareStatement(sql);
			long phone = register.getPhonenumber();
			preparedstatement.setLong(1, phone);
			preparedstatement.setString(2, register.getPassword());
			resultSet=preparedstatement.executeQuery();
			 
			while(resultSet.next())
			{
				isFind=true;
				break;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
				finally
				{
					ConnectionUtil.close(connection, preparedstatement, resultSet);
				}
				return isFind;
		
	}
	public Boolean checkadminLogin(AdminRegistration adminregistration)
	{
		Boolean isFound=false;
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		ResultSet resultset=null;
		try
		{
			 connection=ConnectionUtil.getConnection();
			String sql="select phone_number,password from adminregistration where phone_number=? and password=?";
			preparedStatement=connection.prepareStatement(sql);
			long phone=adminregistration.getPhoneNumber();
			preparedStatement.setLong(1, phone);
			preparedStatement.setString(2,adminregistration.getPassword());
			resultset=preparedStatement.executeQuery();
			while(resultset.next())
			{
				isFound=true;
				break;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			ConnectionUtil.close(connection, preparedStatement, resultset);
		}
		return isFound;
	}
	public void changePassword(Register register)
	{
		Connection connection=null;
		PreparedStatement preparedstatement=null;
	try
	{
		connection = ConnectionUtil.getConnection();
		String sql="update register set phone_number=? ,password=? where phone_number=?";
		preparedstatement = connection
				.prepareStatement(sql);
		Long phone=register.getPhonenumber();
		preparedstatement.setLong(1,phone);
		preparedstatement.setString(2,register.getPassword());
		preparedstatement.setLong(3,phone);
		preparedstatement.executeUpdate();
		
		
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		ConnectionUtil.close(connection, preparedstatement, null);
	}
	}
}
