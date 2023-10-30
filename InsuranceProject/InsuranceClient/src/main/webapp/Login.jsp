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
                <h2><h:outputText value="- Login Here -"/></h2><br>
                
                 Username : 
                <h:inputText id="userName" value="#{customerAuth.userName}" /><br><br>
            	Password :
            	<h:inputText id="email" value="#{customerAuth.passWord}"/> <br><br>
            	
         		<h:commandButton action="#{cDaoImpl.login(userName,passWord)}" value="Login" /> &nbsp;
               </center>
               </h:form>
               </body>
               </html>
               </f:view>
               
                
                
                
                
                
                
                
                