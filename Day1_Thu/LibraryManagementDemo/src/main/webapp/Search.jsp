<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="AllBooks.css">
</head>
<body>
<jsp:include page="Menu.jsp"/>
<br><br>
<form method="get" action="AllBooks.jsp" class="search-form">

<center>
<div class="highlight">
	<h1> -  YOUR LIBRARY 	 - </h1>
</div>
<div class="search-container">
    <input type="text" name="searchvalue" id="searchvalue" placeholder="enter value here ...">
</div> <br/>
  <input type="radio" name="searchtype" value="id" id="byId">
  <label for="byId">By Book Id</label> 
  <input type="radio" name="searchtype" value="dept" id="byDept">
  <label for="byDept">By Department</label>
  <input type="radio" name="searchtype" value="bookname" id="byBookName">
  <label for="byBookName">By Book Name</label>
  <input type="radio" name="searchtype" value="authorname" id="byAuthorName">
  <label for="byAuthorName">By Author Name</label>
  <input type="radio" name="searchtype" value="all" id="allBooks">
  <label for="allBooks">All Books</label> 
  <br><br><br/>
  <input type='submit' value='Search' class="search-button">
  </center>
</form>

</body>
</html>