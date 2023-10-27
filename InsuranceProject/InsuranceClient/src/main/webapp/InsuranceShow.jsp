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
                <h2><h:outputText value="Insurance Details"/></h2>
           
        <h:dataTable value="#{paginationDao.getInsuranceList()}" var="i" border="3">
              	    <h:column>
                    <f:facet name="header">
                    	<h:outputLabel value="Inurance Id" />
                    </f:facet>
                    <h:outputText value="#{i.insuranceId}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Insurance Name" />
                    </f:facet>
                    <h:outputText value="#{i.insuranceName}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Insurance Type" />
                    </f:facet>
                    <h:outputText value="#{i.insuranceType}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Premium Start" />
                    </f:facet>
                    <h:outputText value="#{i.premiumStart}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Premium End" />
                    </f:facet>
                    <h:outputText value="#{i.premiumEnd}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Min Period" />
                    </f:facet>
                    <h:outputText value="#{i.minPeriod}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value="Min Period" />
                    </f:facet>
                    <h:outputText value="#{i.maxPeriod}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value=" Launch Date" />
                    </f:facet>
                    <h:outputText value="#{i.launchDate}"/>
                </h:column>
                    <h:column>
                     <f:facet name="header">
                    	<h:outputLabel value=" Status" />
                    </f:facet>
                    <h:outputText value="#{i.status}"/>
                </h:column>
                  </h:dataTable><br><br>
                
                  <!--The paging buttons-->
            <h:commandButton value="first" action="#{paginationDao.pageFirst}"
                             disabled="#{paginationDao.firstRow == 0}" />
                             
                              <h:outputText value="&nbsp;" escape="false"/>
                              
            <h:commandButton value="prev" action="#{paginationDao.pagePrevious}"
                             disabled="#{paginationDao.firstRow == 0}" />
                             
            <h:outputText value="&nbsp;" escape="false"/>
            
            <h:commandButton value="next" action="#{paginationDao.pageNext}"
                             disabled="#{paginationDao.firstRow + paginationDao.rowsPerPage >= paginationDao.totalRows}" />
                             
            <h:outputText value="&nbsp;" escape="false"/>
            
            <h:commandButton value="last" action="#{paginationDao.pageLast}"
                             disabled="#{paginationDao.firstRow + paginationDao.rowsPerPage >= paginationDao.totalRows}" />
                             
            <h:outputText value="&nbsp;" escape="false"/>  <br><br>
            
            <h:outputText value="Page #{paginationDao.currentPage} / #{paginationDao.totalPages}" />
            <br /> <br />
            <!-- Set rows per page -->
            <h:outputLabel for="rowsPerPage" value="Rows: "/>
            <h:inputText id="rowsPerPage" value="#{paginationDao.rowsPerPage}" size="3" maxlength="3" />
            <h:outputText value="&nbsp;" escape="false"/>
            <h:commandButton value="Set" action="#{paginationDao.pageFirst}" />
            <h:message for="rowsPerPage" errorStyle="color: red;" /> <br><br>
                  
      
        <h:commandButton action="CustomerShow" value="Customer Details" />  &nbsp;&nbsp;
        <h:commandButton action="CustomerAdd" value="Add Customer " />
         </center>
        </h:form>
    </body>
</html>
</f:view>
