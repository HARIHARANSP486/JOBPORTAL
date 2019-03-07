package com.chainsys.jobportal.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.jobportal.dao.FindAllDAO;
import com.chainsys.jobportal.model.Admin;

@WebServlet("/SearchJoblocationServlet")
public class SearchJoblocationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String jobLocation = request.getParameter("joblocation");
		System.out.println(jobLocation);
		FindAllDAO findallDAO = new FindAllDAO();
		try {
			List<Admin> adminlist = findallDAO.searchLocation(jobLocation);
			if(adminlist==null)
			{
				RequestDispatcher rd = request
						.getRequestDispatcher("details.html");	
				rd.forward(request, response);
			}
			else{
			request.setAttribute("JOBS", adminlist);
			RequestDispatcher rd = request
					.getRequestDispatcher("listlocation.jsp");
			rd.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
