<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<f:view>
	<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>


	<h2>
				<h:outputText value="- Order Here -" />
	</h2>
	
	<h:form>
		Customer Id : 
		<h:outputText value="#{sessionCustomer.cusId}"/>
	</h:form>
	
</body>
	</html>	
</f:view>