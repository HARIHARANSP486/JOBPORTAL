package com.chainsys.jobportal.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.jobportal.dao.RegisterDAO;
import com.chainsys.jobportal.model.Register;
import com.chainsys.jobportal.validator.PasswordValidator;


@WebServlet("/ForgetpasswordServlet")
public class ForgetpasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long phone=Long.parseLong(request.getParameter("phone"));
		String password=request.getParameter("newpassword");
		Register register=new Register();
		register.setPhonenumber(phone);
		register.setPassword(password);
		System.out.println(register.getPhonenumber());
		System.out.println(register.getPassword());
		RegisterDAO registerDAO=new RegisterDAO();
		PasswordValidator passwordvalidator=new PasswordValidator();
		if(passwordvalidator.passwordValidator(register))
		{
		registerDAO.changePassword(register);
			
			RequestDispatcher req = request.getRequestDispatcher("login.html");
			req.forward(request, response);
		}
		else
		{
			RequestDispatcher req = request.getRequestDispatcher("failure.html");
			req.forward(request, response);
		}
		
	
	
	}

}
