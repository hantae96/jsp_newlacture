<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!--  -->
<% pageContext.setAttribute("result", "hello"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <%=request.getAttribute("result") %>입니다. --%>
	${result}
	${requestScope.result}
	${names[0]}
	${notice.title}
	<br>
	${param.num}
	${header.accept}
</body>
</html>