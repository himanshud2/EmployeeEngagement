package com.info.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.info.dao.DBOperations;

public class addeventservlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String type = (String) request.getParameter("type");
		String eventid = (String) request.getParameter("eventid");
		String eventname = (String) request.getParameter("eventname");
		String eventvenue = (String) request.getParameter("eventvenue");
		String eventdate = (String) request.getParameter("eventdate");
		String eventtime = (String) request.getParameter("eventtime");
		
		DBOperations db=new DBOperations();
		try {
			boolean check=db.addevent(type, eventid, eventname, eventvenue, eventdate, eventtime);
			if(check==true){
				
				out.println("<h2>event created<br>");
				out.println("<a href='admin.jsp'>click to go back</a>");

			}
			else{
				out.println("<h2>event not created<br>");
				out.println("<a href='addevent.jsp'>click to enter details again</a>");

				


			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
