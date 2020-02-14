package com.cts.training.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;



public class LoginFilter implements Filter {

   
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		response.setContentType("text/html");
		String user= request.getParameter("username");
		if(user.equalsIgnoreCase("admin"))
		{
			System.out.println("Preprocessing the request");
		    chain.doFilter(request, response);
		    System.out.println("Postprocessing the response");
	    }
		else {
	      RequestDispatcher rd= request.getRequestDispatcher("loginPage.jsp");
	      rd.include(request, response);
		}
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	
}
