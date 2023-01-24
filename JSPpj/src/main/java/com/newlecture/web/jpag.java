package com.newlecture.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/spag")
public class jpag extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num = 0;
		String num_ = request.getParameter("n"); 
		if(num_ != null && !num_.equals(""))
			num = Integer.parseInt(num_);
		
		String [] names = {"newlec","dag"};
		request.setAttribute("names", names);
		
		Map<String,Object> notice = new HashMap<>();
		notice.put("id", 1);
		notice.put("title","EL은 좋아");
		request.setAttribute("notice", notice);
		String result;
		if(num %2 !=0)
			result = "홀수";
		else
			result = "짝수";
		
		request.setAttribute("result", result);
	
		//redirect(일을 새로 요청해야할때)
		
		//forward(일을 이어나갈수 있을때)
		RequestDispatcher dispathcher = 
				request.getRequestDispatcher("spag.jsp");
		dispathcher.forward(request, response);
		
	}
}
