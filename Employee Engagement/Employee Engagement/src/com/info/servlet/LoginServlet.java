package com.info.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.info.dao.DBOperations;

public class LoginServlet extends HttpServlet {
	DBOperations db = new DBOperations();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = (String) request.getParameter("username");
		String password = (String) request.getParameter("password");

		try {
			String check = db.check(username, password);
			System.out.println(check);

			if (check == null) {
				response.sendRedirect("lg.html");

			} else if (check.equalsIgnoreCase("admin")) {

				response.sendRedirect("admin.jsp");
			}

			else {
				response.sendRedirect("employee.jsp");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
