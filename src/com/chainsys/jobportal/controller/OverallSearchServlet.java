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

@WebServlet("/OverallSearchServlet")
public class OverallSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String selectAny = request.getParameter("selectAny");
		System.out.println(selectAny);
		FindAllDAO findallDAO = new FindAllDAO();
		try {
			List<Admin> adminlist = findallDAO.searchAny(selectAny);

			request.setAttribute("JOBS", adminlist);
			RequestDispatcher rd = request
					.getRequestDispatcher("listdetails.jsp");
			rd.forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
