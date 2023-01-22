package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add2")
public class add2 extends HttpServlet{
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
		String[] tempNum = req.getParameterValues("num");
		
		String op = req.getParameter("operator");
		
		int result = 0;
		
		for (int i = 0; i<tempNum.length;i++) {
			int num = Integer.parseInt(tempNum[i]);
			result+=num;
		}
		
	}
}
