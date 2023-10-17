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
				<h:outputText value="- Menu -" />
			</h2>

			<h:dataTable value="#{menuList}" var="m" border="3">
				<h:column>
					<f:facet name="header">
						<h:outputLabel value="Menu Id" />
					</f:facet>
					<h:outputText value="#{m.menId}" />

				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputLabel value="Item Name" />
					</f:facet>
					<h:outputText value="#{m.menItem}" />

				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputLabel value="Price" />
					</f:facet>
					<h:outputText value="#{m.menPrice}" />

				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputLabel value="Restaurant Id" />
					</f:facet>
					<h:outputText value="#{m.restaurantId}" />

				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputLabel value="Calories" />
					</f:facet>
					<h:outputText value="#{m.menCalories}" />

				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputLabel value="Speciality" />
					</f:facet>
					<h:outputText value="#{m.menSpeciality}" />

				</h:column>

			</h:dataTable>
		</center>
	</h:form>


</body>
	</html>
</f:view>