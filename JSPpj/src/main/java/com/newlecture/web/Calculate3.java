package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Calculate3")
public class Calculate3 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
//		
		ServletContext application = req.getServletContext();
		HttpSession session = req.getSession();
		Cookie[] cookies =req.getCookies();
		
		
		
		String value = req.getParameter("value");
		String operator = req.getParameter("operator");
		String dot = req.getParameter("dot");
		
		String exp = "";
		
		
		
		if(cookies != null)
			for(Cookie c : cookies) {
				if(c.getName().equals("value"))
					exp = (c.getValue());
					break;
				}
		
		
		if(operator != null && operator.equals("=")) {
			
		}else {
			exp += (value == null)?"":value;
			exp += (operator == null)?"":operator;
			exp += (dot == null)?"":dot;
		}
		Cookie expCookie = new Cookie("exp",exp);
		resp.addCookie(expCookie);
		
		
		resp.sendRedirect("/Calcpage");
		
	}
}

