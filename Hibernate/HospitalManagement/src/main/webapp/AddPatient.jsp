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
    		 <h:form>
        	<center>
                <h2><h:outputText value="- Patient Form -"/></h2>
          
            Patient Id : 
			<h:inputText value="#{patient.pid}" /> </br></br>
            Name : 
			<h:inputText value="#{patient.name}" /></br></br>
            Age : 
			<h:inputText value="#{patient.age}" /></br></br>
            Weight (in kgs) : 
			<h:inputText value="#{patient.weight}" /></br></br>
			Gender (f/m) :
			<h:inputText value="#{patient.gender}" /></br></br>
			Address :
			<h:inputText value="#{patient.address}" /></br></br>
			Phone No :
			<h:inputText value="#{patient.phoneno}" /></br></br>
			Disease :
			<h:inputText value="#{patient.disease}" /></br>		</br>	
			Doctor Id :
			<h:inputText value="#{patient.drId}" /></br></br>
			
			<h:commandButton action="#{pImpl.addPatientDao(patient)}" value="Submit" />
			</center>
            </h:form>
	</body>
</html>
</f:view>
           