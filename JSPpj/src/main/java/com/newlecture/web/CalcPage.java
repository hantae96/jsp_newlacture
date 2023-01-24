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

@WebServlet("/calcpage")
public class CalcPage extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
//		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
	
		
		PrintWriter out = resp.getWriter();
		Cookie[] cookies =req.getCookies();
		String exp = "0";
		
		if(cookies != null)
			for(Cookie c : cookies) {
				if(c.getName().equals("value"))
					exp = (c.getValue());
					break;
				}
			
		
		out.write("<!DOCTYPE html>");
		out.write("<html>");
		out.write("<head>");
		out.write("<meta charset=\"UTF-8\">");
		out.write("<title>Insert title here</title>");
		out.write("<style>");
		out.write("input{");
		out.write("width : 50px;");
		out.write("height:50px;");
		out.write("}");

		out.write(".output{");
		out.write("height : 50px;");
		out.write("background : #e9e9e9;");
		out.write("font-size:24px;");
		out.write("font-weight : bold;");
		out.write("text-align : right;");
		out.write("padding : 0px 0px 5px;");
		out.write("padding-right : 5px;");

		out.write("}");
		out.write("</style>");
		out.write("</head>");
		out.write("<body>");
		out.write("<header>");
		out.write("<h1>사용자 입력을 받아서 계산해주는 페이지</h1>");
		out.write("</header>");
 
		out.write("<div>");
		out.write("<form action =\"Cal3\" method = \"post\">");

		out.write("<table>");
		out.write("<tr>");
		out.printf("<td class = \"output\" colspan = \"4\">%s</td>",exp);
		out.write("</tr>");
		out.write("<tr>");
		out.write("<td><input type = \"submit\" name = \"operator\" value = \"CE\"></td>");
		out.write("<td><input type = \"submit\" name = \"operator\" value = \"C\"></td>");
		out.write("<td><input type = \"submit\" name = \"operator\" value = \"BS\"></td>");
		out.write("<td><input type = \"submit\" name = \"operator\" value = \"/\"></td>");
		out.write("</tr>");

		out.write("<tr>");
		out.write("<td><input type = \"submit\" name = \"value\" value =\"7\"></td>");
		out.write("<td><input type = \"submit\" name = \"value\" value = \"8\"></td>");
		out.write("<td><input type = \"submit\" name = \"value\" value = \"9\"></td>");
		out.write("<td><input type = \"submit\" name = \"operator\" value = \"*\"></td>");
		out.write("</tr>");

		out.write("<tr>");
		out.write("<td><input type = \"submit\" name = \"value\" value = \"4\"></td>");
		out.write("<td><input type = \"submit\" name = \"value\" value = \"5\"></td>");
		out.write("<td><input type = \"submit\" name = \"value\" value = \"6\"></td>");
		out.write("<td><input type = \"submit\" name = \"operator\" value = \"-\"></td>");
		out.write("</tr>");

		out.write("<tr>");
		out.write("<td><input type = \"submit\" name = \"value\" value = \"1\"></td>");
		out.write("<td><input type = \"submit\" name = \"value\" value = \"2\"></td>");
		out.write("<td><input type = \"submit\" name = \"value\" value = \"3\"></td>");
		out.write("<td><input type = \"submit\" name = \"operator\" value = \"+\"></td>");
		out.write("</tr>");

		out.write("<tr>");
		out.write("<td><input type = \"submit\" name = \"value\" value = \"0\"></td>");
		out.write("<td><input type = \"submit\" name = \"operator\" value = \"+\"></td>");
		out.write("<td><input type = \"submit\" name = \"operator\" value = \"=\"></td>");
		out.write("</tr>");
		out.write("</table>");
		out.write("</form>");
		out.write("</div>");
		out.write("</body>");
		out.write("</html>");
		
		
}
}
