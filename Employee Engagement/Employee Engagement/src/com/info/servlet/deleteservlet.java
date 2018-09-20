package com.info.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.info.dao.DBOperations;

public class deleteservlet extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String empid = (String) request.getParameter("empid");
		String fullname = (String) request.getParameter("fullname");
		DBOperations db=new DBOperations();
		try {
			boolean check=db.delete(empid, fullname);
			if(check==true){
				
				out.println("<h2>employee deleted<br>");
				out.println("<a href='admin.jsp'>click to go back</a>");

			}
			else{
				out.println("<h2>employee not deleted<br>");
				out.println("<a href='deleteemployee.jsp'>click to enter details again</a>");

				


			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
