package com.cts.training.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/register")

public class Register extends HttpServlet 
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		PrintWriter out= response.getWriter();
		String id= request.getParameter("id");
		String email= request.getParameter("email");
		String password1 = request.getParameter("passw");
		String confirmPass= request.getParameter("passwo");		
		//String[] course= request.getParameterValues("course");
		
		out.println("ID: " +id);
		out.println("Email: " +email);
		out.println("Password: " +password1);
		out.println("Confirm Password: " +confirmPass);
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/cts";
			String username="admin";
			String password="admin";
			Connection conn=  DriverManager.getConnection(url, username, password);
			System.out.println("Connection Succesfull");
			String query="insert into UserTable values (?,?,?,?)";
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setString(1, id);
			ps.setString(2, email);
			ps.setString(3, password1);
			ps.setString(4, confirmPass);
			int result=ps.executeUpdate();
		 } 
		
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
