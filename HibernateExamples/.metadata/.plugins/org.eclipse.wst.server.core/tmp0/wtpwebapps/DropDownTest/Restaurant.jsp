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
    <h2> Find Menu </h2>
    <h:selectOneMenu value="#{rDao.showRestaurantDao()}">
        <f:selectItems value="#{rDao.getMenu()}" var="restaurant" itemValue="#{restaurant.restaurantId}" itemLabel="#{restaurant.restaurantName}" />
    </h:selectOneMenu>
    </h:form>

    		
    </body>
</html>
</f:view>