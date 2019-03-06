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


@WebServlet("/SearchJobServlet")
public class SearchJobServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String deptName = request.getParameter("deptname");
		System.out.println(deptName);
		//SearchJobDAO searchjobDAO=new SearchJobDAO();
		FindAllDAO findallDAO=new FindAllDAO();
		Admin admin=new Admin();
		//admin.setVacancyDept(deptName);
		try
		{
		List<Admin> adminlist=	findallDAO.findAll(deptName);
			request.setAttribute("JOBS", adminlist);
			
			RequestDispatcher rd = request.getRequestDispatcher("list.jsp");
			rd.forward(request,response);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	
	}

}
