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
<center>

	<h2>
				<h:outputText value="- Sign Up -" />
			</h2>
	<h:form>
		<h:outputLabel value="Customer Name : " />
		<h:inputText id="cutomerName" value="#{customer.cudName}" />
		<br/> <br/>
		
		<h:outputLabel value="Phone No : " />
		<h:inputText id="phoneNo" value="#{customer.cusPhoneNo}" />
		<br/><br/>
		
		<h:outputLabel value="UserName : " />
		<h:inputText id="userName" value="#{customer.cusUsername}" />
		<br/><br/>
		
		<h:outputLabel value="PassWord : " />
		<h:inputSecret id="passWord" value="#{customer.cusPassword}" />
		<br/><br/>
		
		<h:outputLabel value="Email : " />
		<h:inputText id="email" value="#{customer.cusEmail}" />
		<br/><br/>

		<h:commandButton action="#{cDao.signUpDao(customer)}" value="Sign Up" />
		<h:messages layout="table"></h:messages>
	</h:form>
	</center>
</body>
	</html>
</f:view>