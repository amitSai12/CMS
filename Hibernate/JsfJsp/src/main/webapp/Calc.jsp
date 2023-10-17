<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%> 
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%> 


<f:view>
<html>
<body style="font-family:cursive">
<center>
	<h:form>
		<h2 style="background-color:black; color:white;height:36px">Please Enter Numbers</h2> <br/>
		
		<b>1st No : </b>
		<h:inputText id="num1" value="#{calculation.firstNo}"
		style="border-top-style:none;border-left-style:none;border-right-style:none;
		border-bottom-style:none;height:25px"/><br/><br/>
		
		<b>2nd No : </b> 
		<h:inputText id="num2" value="#{calculation.secondNo}"
		style="border-top-style:none;border-left-style:none;border-right-style:none;
		border-bottom-style:none;height:25px"/><br/><br/>
		
		<h:commandButton actionListener="#{calculation.addition}" value="Sum"/> &nbsp;&nbsp;
		
		
		<h:commandButton actionListener="#{calculation.substraction}" value="Sub"/>&nbsp;&nbsp;
		
		
		 <h:commandButton actionListener="#{calculation.multiplication}" value="Mult"/> <br/><br/>
		
		
		Result  is :
		
		<h:outputText value="#{calculation.result}" />
		
		
		
		
	</h:form>
</center>
</body>
</html>
</f:view>
