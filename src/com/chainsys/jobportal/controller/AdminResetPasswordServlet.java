package com.chainsys.jobportal.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.jobportal.dao.AdminPasswordReset;
import com.chainsys.jobportal.model.AdminRegistration;
import com.chainsys.jobportal.validator.PasswordValidator;


@WebServlet("/AdminResetPasswordServlet")
public class AdminResetPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		Long phone=Long.parseLong(request.getParameter("phone"));
		String password=request.getParameter("newpassword");
		AdminRegistration adminregistration=new AdminRegistration();
		adminregistration.setPhoneNumber(phone);
		adminregistration.setPassword(password);
		System.out.println(adminregistration.getPhoneNumber());
		System.out.println(adminregistration.getPassword());
		PasswordValidator passwordvalidator=new PasswordValidator();
		AdminPasswordReset adminpasswordreset=new AdminPasswordReset();
		if(passwordvalidator.adminPasswordValidator(adminregistration)){
			adminpasswordreset.changePasswordAdmin(adminregistration);
			RequestDispatcher req = request.getRequestDispatcher("adminpasswordsuccess.html");
			req.forward(request, response);
		}
		else
		{
			RequestDispatcher req = request.getRequestDispatcher("failure.html");
			req.forward(request, response);
		}
   	
   	
   	}

}
