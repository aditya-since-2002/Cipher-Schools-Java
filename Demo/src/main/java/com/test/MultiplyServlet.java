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

public class MultiplyServlet extends HttpServlet{
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int x1 = Integer.parseInt(req.getParameter("num1"));
		int x2 = Integer.parseInt(req.getParameter("num2"));
		
		
		int x3 = x1 * x2;
		
		//PrintWriter out = res.getWriter();
		
		
		//HttpSession
		
		//HttpSession session = req.getSession();
		
		//session.setAttribute("x3", x3);
		
		//req.setAttribute("x3", x3);
		
		//RequestDispatcher rd= req.getRequestDispatcher("cube");
		
		
		//Cookies
		
		//Cookie cookie = new Cookie("x3",x3+" ");
		
		//res.addCookie(cookie);
		
		//rd.forward(req, res);
		
		//res.addCookie(cookie);
		
		//res.sendRedirect("cube");
		
		
		
		//Url_rewriting
		
		res.sendRedirect("cube?*3= "+x3);
		
		
		
	}

}
