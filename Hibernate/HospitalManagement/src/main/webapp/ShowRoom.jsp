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
                <h2><h:outputText value="- Rooms HMS -"/></h2>
            </center>
        <h:dataTable value="#{rImpl.showRoomDao()}" var="r" border="5">
        	           <h:column>
        	           <f:facet name="header">
        	           		<h:outputText value="Room_No" />
        	           </f:facet>
        	            <h:outputText value="#{r.roomNo}"/>
        	           </h:column>
        	           <h:column>
        	           <f:facet name="header">
        	           		<h:outputText value="Room_Type" />
        	           </f:facet>
        	            <h:outputText value="#{r.roomType}"/>
        	           </h:column>
        	           <h:column>
        	           <f:facet name="header">
        	           		<h:outputText value="Status" />
        	           </f:facet>
        	            <h:outputText value="#{r.status}"/>
        	           </h:column>
        	           </h:dataTable>
        	   </h:form>        
    </body>
   </html>
   </f:view>