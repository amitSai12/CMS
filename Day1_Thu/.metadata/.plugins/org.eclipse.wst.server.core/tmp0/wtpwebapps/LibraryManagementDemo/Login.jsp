<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="login.css">
</head>
<body>
	<form method="post" action="Login.jsp">
		<center>
			<h2>- LOGIN HERE -</h2><br/>
			<input type="text" name="userName" placeholder="UserName"/><br><br>
			<input type="password" name="password" placeholder="Password"/><br><br><br>
			<input type="submit" value="LOGIN" />
		</center>
		
	</form>
	
	
	
	<c:if test="${param.userName!=null && param.password!=null }">
		
		<jsp:useBean id="login" class="com.java.library.LibUsers"/>
		<jsp:setProperty property="*" name="login"/>
		<jsp:useBean id="beanDao" class="com.java.library.LibraryDAOImpl"/>
		<c:set var="count" value="${beanDao.authenticate(login)}"/>
		<c:if test="${count==1}">
			<%
				session.setAttribute("user",request.getParameter("userName"));
			%>
			<jsp:forward page="Menu2.jsp"/>
	</c:if>
	</c:if>
	<c:if test="${count==0}">
	
	
		<div class="invalid-credentials">
   			<c:out value=" Invalid Credentials...."/>
		</div>

	</c:if>
	
</body>
</html>