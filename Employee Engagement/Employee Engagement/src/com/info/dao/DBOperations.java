package com.info.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;



public class DBOperations {
	Scanner sc = new Scanner(System.in);
	Connection con;
	PreparedStatement ps;

	public String check(String username, String password) throws SQLException, NamingException {
		String s = null;
		Context ctx = new InitialContext();
		DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/myTestDBCP");
		
		con = ds.getConnection();
		ps = con.prepareStatement("select * from login where username=? and password=? ");
		ps.setString(1, username);
		ps.setString(2, password);
		
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			s = rs.getString(1);

		}
		return s;
	}
	
	
	public boolean insert(String empid,String fullname,String phonenumber,String loginid,String password,String managername,String projectname) throws Exception{
		
		boolean isInserted = false;

		Context ctx = new InitialContext();
		DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/myTestDBCP");
		
		con = ds.getConnection();
		ps = con.prepareStatement("insert into employee1 values(?,?,?,?,?,?,?) ");
		ps.setString(1, empid);
		ps.setString(2, fullname);
		ps.setString(3, phonenumber);
		ps.setString(4, loginid);
		ps.setString(5, password);
		ps.setString(6, managername);
		ps.setString(7, projectname);
		
		int x = ps.executeUpdate();
		if(x>0){
			isInserted = true;
		}
		return isInserted;
		
	
	}
	
public boolean delete(String empid,String fullname) throws Exception{
		
		boolean isInserted = false;

		Context ctx = new InitialContext();
		DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/myTestDBCP");
		
		con = ds.getConnection();
		ps = con.prepareStatement("delete from employee1 where empid=? and fullname=? ");
		ps.setString(1, empid);
		ps.setString(2, fullname);
		
		
		int x = ps.executeUpdate();
		if(x>0){
			isInserted = true;
		}
		return isInserted;
		
	
	}

public boolean addevent(String type,String eventid,String eventname,String eventvenue,String eventdate,String eventtime) throws Exception{
	
	boolean isInserted = false;

	Context ctx = new InitialContext();
	DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/myTestDBCP");
	
	con = ds.getConnection();
	ps = con.prepareStatement("insert into events values(?,?,?,?,?,?) ");
	ps.setString(1, type);
	ps.setString(2, eventid);
	ps.setString(3, eventname);
	ps.setString(4, eventvenue);
	ps.setString(5, eventdate);
	ps.setString(6, eventtime);
	
	int x = ps.executeUpdate();
	if(x>0){
		isInserted = true;
	}
	return isInserted;
	

}
		}
	
	

