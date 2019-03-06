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


@WebServlet("/SearchJobVacancy")
public class SearchJobVacancy extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String jobvacancy=request.getParameter("jobvacancy");
		System.out.println(jobvacancy);
		FindAllDAO findallDAO=new FindAllDAO();
		try
		{
			List<Admin> adminlist=findallDAO.searchVacancy(jobvacancy);
			System.out.println(adminlist);
			request.setAttribute("JOBS", adminlist);
			
			RequestDispatcher rd = request.getRequestDispatcher("listvacancy.jsp");
			rd.forward(request,response);
		}
		catch(Exception e)
		{
			e.printStackTrace();

		}
	
	
	
	}

}
