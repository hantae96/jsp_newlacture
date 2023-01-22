package com.newlecture.web;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi")
public class Nana extends HttpServlet {
	 @Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		int cnt = 100;
		String temp = req.getParameter("cnt");
		
		if(temp != null && !temp.equals("")) {
			cnt = Integer.parseInt(temp);
			
			for(int i = 0;i<cnt;i++) {
				out.println("안녕 Servlet!!<br>");
				}
		}else {
			out.print("쿼리값을 입력하지 않았습니다.");
		}
//		cnt = Integer.parseInt(req.getParameter("cnt"));
		
		
	 }
}
