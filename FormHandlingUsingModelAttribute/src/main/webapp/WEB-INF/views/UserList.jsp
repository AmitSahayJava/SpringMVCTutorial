<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1" align="center">
		<tr>
			<th>Name</th>
			<th>Age</th>
			<th>Country</th>
			<th>Email</th>
		</tr>
     <c:forEach var="user" items="${userList}">
     <tr>
       <td><c:out value="${user.name }"/></td>
       <td><c:out value="${user.age }"/></td>
       <td><c:out value="${user.country }"/></td>
       <td><c:out value="${user.email }"/></td>
       
     </tr>     
     </c:forEach>
	</table>
</body>
</html>