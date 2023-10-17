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
                <h2><h:outputText value="Employ Records"/></h2>
            </center>
        <h:dataTable value="#{employDao.showEmploy()}" var="e" border="3">
        	    <h:column>
        	    <f:facet name="header">
                    <h:outputLabel value="Employ No" />
                    <h:outputText value="#{e.empno}"/>
                   </f:facet>
                </h:column>
        	    <h:column>
        	    <f:facet name="header">
                    <h:outputLabel value="Employ Name" />
                    <h:outputText value="#{e.name}"/>
                   </f:facet>
                </h:column>
        	    <h:column>
        	    <f:facet name="header">
                    <h:outputLabel value="Gender" />
                    <h:outputText value="#{e.gender}"/>
                   </f:facet>
                </h:column>
        	    <h:column>
        	    <f:facet name="header">
                    <h:outputLabel value="Designation" />
                    <h:outputText value="#{e.desig}"/>
                   </f:facet>
                </h:column>
        	    <h:column>
        	    <f:facet name="header">
                    <h:outputLabel value="Department" />
                    <h:outputText value="#{e.dept}"/>
                   </f:facet>
                </h:column>
                <h:column>
        	    <f:facet name="header">
                    <h:outputLabel value="Basic" />
                    <h:outputText value="#{e.basic}"/>
                   </f:facet>
                </h:column>
        </h:dataTable>
        
        </h:form>
    </body>
</html>
</f:view>
