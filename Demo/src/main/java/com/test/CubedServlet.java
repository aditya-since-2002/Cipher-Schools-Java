package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CubedServlet extends HttpServlet{
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
	
		
		//HttpSession
		
		//int x3 = (int) req.getAttribute("x3");
	
		//HttpSession session=req.getSession();
		
		//int x3 = (int) session.getAttribute("x3");
		
		
		//Cookie
		
		/*int x3=0;
		Cookie cookie[] = req.getCookies();
		
		for(Cookie cook:cookie) {
			if(cook.getName().equals("x3")) {
				x3 = Integer.parseInt(cook.getValue());
			}
		}*/
		
		// url-rewriting
		
		int x3 = Integer.parseInt(req.getParameter("x3"));
		
		x3 = x3*x3*x3;
		PrintWriter out = res.getWriter();
		out.println("the value is: "+x3);
		
		
		
	}

}
