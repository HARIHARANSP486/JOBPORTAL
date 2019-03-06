package com.chainsys.jobportal.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.jobportal.dao.AdminRegisterDAO;
import com.chainsys.jobportal.model.AdminRegistration;


@WebServlet("/AdminRegistrationServlet")
public class AdminRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer adminId=Integer.parseInt(request.getParameter("adminId"));
		String adminName=request.getParameter("adminName");
		String emailId=request.getParameter("emailId");
		Long phoneNumber=Long.parseLong(request.getParameter("phoneNumber"));
		String password=request.getParameter("password");
		AdminRegistration adminregistration=new AdminRegistration();
		adminregistration.setAdminId(adminId);
		adminregistration.setAdminName(adminName);
		adminregistration.setEmailId(emailId);
		adminregistration.setPhoneNumber(phoneNumber);
		adminregistration.setPassword(password);
		AdminRegisterDAO adminregisterDAO=new AdminRegisterDAO();
		try
		{
			adminregisterDAO.addAdmin(adminregistration);
			RequestDispatcher rd = request.getRequestDispatcher("adminsuccess.html");
			rd.forward(request, response);
		}catch(Exception e)
		{
			RequestDispatcher rd = request.getRequestDispatcher("failure.html");
			rd.forward(request, response);
		}
	}

}
