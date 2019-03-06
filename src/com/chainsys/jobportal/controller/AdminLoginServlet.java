package com.chainsys.jobportal.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.jobportal.dao.RegisterDAO;
import com.chainsys.jobportal.model.AdminRegistration;

@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		long phone = Long.parseLong(request.getParameter("phone"));
		String password = request.getParameter("password");
		AdminRegistration adminregistration = new AdminRegistration();
		adminregistration.setPhoneNumber(phone);
		adminregistration.setPassword(password);
		RegisterDAO registerDAO = new RegisterDAO();
		
			if (registerDAO.checkadminLogin(adminregistration)) {
				RequestDispatcher req = request
						.getRequestDispatcher("admin.jsp");
				req.forward(request, response);
			}

			else {
				// TODO Auto-generated catch block
				RequestDispatcher req = request
						.getRequestDispatcher("failure.html");
				req.forward(request, response);
			}
		} 
			

	}

