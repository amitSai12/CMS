<%@page import="com.java.complaint.Complaint"%>
<%@page import="com.java.complaint.ComplaintDAO"%>
<%@page import="com.java.complaint.ComplaintDAOImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background-image: linear-gradient(circle, #10c2e7, #83cef7, #bddbfd, #e5ebfe, #ffffff);">
<center>
<div style="margin-top:135px">
	<form method="get" action="ComplaintApply.jsp">
		 <input 
		 type="text" name="complaintType" placeholder="Complaint Type"
		 style="width:30%; height: 20px;font-family: cursive;text-align: center;border:1;
    		border-top-style: none;border-left-style: none;border-right-style: none;
    		background-color:transparent"><br><br><br> 
		 <input 
		type="text" name="cDescription"placeholder="Complaint Description"
		style="width:30%; height: 20px;font-family: cursive;text-align: center;border:1;
    		border-top-style: none;border-left-style: none;border-right-style: none;
    		background-color:transparent"><br><br><br>
		 <input
			type="text" name="severity"placeholder="Severity"
			style="width:30%; height: 20px;font-family: cursive;text-align: center;border:1;
    		border-top-style: none;border-left-style: none;border-right-style: none;
    		background-color:transparent"><br><br><br><br> 
		 <input
			type="submit" value="Apply"
			style="font-family: cursive;width:20%; height: 30px;
			border-radius:20px;background-color:black;color:white;
			cursor:pointer">
	</form>
	</div>
	</center>
	
	<%
	  if(request.getParameter("complaintType")!= null && request.getParameter("cDescription") != null){
		  ComplaintDAO dao = new ComplaintDAOImpl();
		  Complaint complaint = new Complaint();
		  complaint.setComplaintType(request.getParameter("complaintType"));
		  complaint.setcDescription(request.getParameter("cDescription"));
		  complaint.setSeverity(request.getParameter("severity"));
		  dao.addComplaint(complaint);
		  %>
		  <jsp:forward page="ComplaintShow.jsp"/>
		  <%
	  }
	%>
<%-- 
	<%
	if (request.getParameter("complaintId") != null) {
	}
	%>

	<jsp:useBean id="complaint" class="com.java.complaint.Complaint" />
	<jsp:setProperty property="*" name="complaint" />

	<jsp:useBean id="dao" class="com.java.complaint.ComplaintDAOImpl" />

	<%
	String result = dao.addComplaint(complaint);
	out.print(result);
	%> --%>


</body>
</html>