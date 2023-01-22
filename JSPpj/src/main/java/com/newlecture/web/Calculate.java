package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calculate")
public class Calculate extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
//		
		PrintWriter out = resp.getWriter();
		
		int x = 0;
		int y = 0;
		System.out.print(req);		
		String tempX = req.getParameter("x");
		String tempY = req.getParameter("y");
		
		
		if ((!(tempX == "" ) && !(tempX == null)) && (!(tempY == "" ) && !(tempY == null))){
			x = Integer.valueOf(tempX);
			y = Integer.valueOf(tempY);
			out.println(x+y);
		}else {
			out.print("값을 입력하세요");
		}		
	}
}
