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
			<h2>
				<h:outputText value="- Restaurants -" />
			</h2>

			<h:dataTable value="#{rDao.showRestaurantDao()}" var="r" border="3">
				<h:column>
					<f:facet name="header">
						<h:outputLabel value="Restaurant Id" />
						</f:facet>
						<h:outputText value="#{r.restaurantId}" />
					
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputLabel value="Restaurant Name" />
						</f:facet>
						<h:outputText value="#{r.restaurantName}" />
					
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputLabel value="Branch" />
						</f:facet>
						<h:outputText value="#{r.branch}" />
					
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputLabel value="City" />
						</f:facet>
						<h:outputText value="#{r.city}" />
					
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputLabel value="Number" />
						</f:facet>
						<h:outputText value="#{r.mobileNo}" />
					
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputLabel value="Email" />
						</f:facet>
						<h:outputText value="#{r.email}" />
					
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputLabel value="Rating" />
						</f:facet>
						<h:outputText value="#{r.varchar}" />
					
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputLabel value="All Menu" />
						</f:facet>
						<h:commandButton value="Show" action="#{mDao.menuId(r.restaurantId)}" />
					
			</h:column>

			</h:dataTable>
		</center>
	</h:form>


</body>
	</html>
</f:view>

























































































































