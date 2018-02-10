<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
.error{
color: red;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="formdata" method="post">
		User Name: <input type="text" name="name" />
		<form:errors path="user.name" cssClass="error"></form:errors>
		<br> User Email: <input type="text" name="email" /><br> <input
			type="submit" value="Submit">
			<form:errors path="user.email" cssClass="error"></form:errors>
	</form>
</body>
</html>