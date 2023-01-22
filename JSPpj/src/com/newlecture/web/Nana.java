package com.newlecture.web;
import javax.servlet.HttpServlet;

public class Nana  extends HTTPServlet{
	@Override
	protected void service(HttpServletRequest req,HttpServletResponese resp) {
		
		PrintWriter out = resp.getWriter();
		out.println("Hello world!!!");
	}

}
