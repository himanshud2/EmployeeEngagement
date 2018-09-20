package com.info.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.info.dao.DBOperations;

public class createservlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String empid = (String) request.getParameter("empid");
		String fullname = (String) request.getParameter("fullname");
		String loginid = (String) request.getParameter("loginid");
		String password = (String) request.getParameter("password");
		String managername = (String) request.getParameter("managername");
		String projectname = (String) request.getParameter("projectname");
		String phonenumber = (String) request.getParameter("phonenumber");
		
		DBOperations db=new DBOperations();
		try {
			boolean check=db.insert(empid, fullname, phonenumber, loginid, password, managername, projectname);
			if(check==true){
				
				out.println("<h2>employee created<br>");
				out.println("<a href='admin.jsp'>click to go back</a>");

			}
			else{
				out.println("<h2>employee not created<br>");
				out.println("<a href='createemployee.jsp'>click to enter details again</a>");

				


			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
