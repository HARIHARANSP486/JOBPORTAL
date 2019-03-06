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
import com.chainsys.jobportal.validator.LoginValidator;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		long phone = Long.parseLong(request.getParameter("phone"));
		String password = request.getParameter("password");
		Register register = new Register();
		register.setPhonenumber(phone);
		register.setPassword(password);
		
		RegisterDAO registerDAO = new RegisterDAO();
		if (registerDAO.checkLogin(register)) {
		RequestDispatcher req = request
						.getRequestDispatcher("searchhome.html");
				req.forward(request, response);
		}
		else{
			RequestDispatcher req = request
					.getRequestDispatcher("loginfailure.html");
			req.forward(request, response);
		}

	}
	}



