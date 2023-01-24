<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
//TODO Auto-generated method stub
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		int cnt = 100;
		String temp = request.getParameter("cnt");
		
		if(temp != null && !temp.equals("")) {
			cnt = Integer.parseInt(temp); 
			
			for(int i = 0;i<cnt;i++) {
				out.println("안녕 Servlet!!<br>");
				}
		}else {
			out.print("쿼리값을 입력하지 않았습니다.");
		}


%>  
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%for(int i = 0; i<10;i++){%>
	안녕 JSP_Servlet!!<br>
	<%}%>
</body>
</html>