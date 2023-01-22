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

@WebServlet("/Cal2")
public class Calculate2 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
//		
		ServletContext application = req.getServletContext();
		HttpSession session = req.getSession();
		Cookie[] cookies =req.getCookies();
		
		
		PrintWriter out = resp.getWriter();
		
		int value = 0;
		
		
		String tempValue = req.getParameter("value");
		String op = req.getParameter("operator");
	
		
		if(!tempValue.equals("") && !(tempValue==null))
			value = Integer.parseInt(tempValue);
		
		
		if(op.equals("=")) {	
//			int x = (Integer)application.getAttribute("value");
//			int x = (Integer)session.getAttribute("value");
			int x = 0;
			
			for(Cookie c : cookies) {
			if(c.getName().equals("value"))
				x = Integer.parseInt(c.getValue());
				break;
			}
			
			String operator = "";
			for(Cookie c : cookies) {
				if(c.getName().equals("op"))
					operator = c.getValue();
					break;
				}

			
			int y = value;
//			String operator = (String)application.getAttribute("op");
//			String operator = (String)session.getAttribute("op");
			if (operator.equals("+")) {
				out.println(x+y);
			}else if (operator.equals("-")) {
				out.println(x-y);
		}else {
//			application.setAttribute("value", value);
//			application.setAttribute("op",op);
			
//			session.setAttribute("value", value);
//			session.setAttribute("op",op);
			
			Cookie valueCookie = new Cookie("value",String.valueOf(value));
			Cookie OpCookie = new Cookie("op",op);
			
			valueCookie.setPath("/");
			
			resp.addCookie(valueCookie);
			resp.addCookie(OpCookie);
		}
		
	}
}
}
