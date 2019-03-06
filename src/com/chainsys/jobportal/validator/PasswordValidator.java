package com.chainsys.jobportal.validator;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.chainsys.jobportal.model.AdminRegistration;
import com.chainsys.jobportal.model.Register;
import com.chainsys.jobportal.util.ConnectionUtil;

public class PasswordValidator {
	public Boolean passwordValidator(Register register)
	{
		Boolean isFind=false;
		try {
			Connection connection=ConnectionUtil.getConnection();
			String sql="select phone_number from register where phone_number=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			long phone = register.getPhonenumber();
			preparedStatement.setLong(1, phone);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next())
			{
				isFind=true;
				break;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isFind;
	}
	public Boolean adminPasswordValidator(AdminRegistration adminregistration)
	{
		Boolean isFound=false;
		try
		{
			Connection connection=ConnectionUtil.getConnection();
			String sql="select phone_number from adminregistration where phone_number=?";
			long phone=adminregistration.getPhoneNumber();
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setLong(1,phone);
			ResultSet result=preparedStatement.executeQuery();
			while(result.next())
			{
				isFound=true;
				break;
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return isFound;
	}
}
