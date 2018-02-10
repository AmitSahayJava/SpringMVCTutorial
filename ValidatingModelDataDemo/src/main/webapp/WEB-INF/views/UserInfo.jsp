<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>User Name:</td> <td>${userData.userName }</td>
		</tr>
		<tr>
			<td>User Date Of Birth:</td> <td>${userData.userDOB }</td>
		</tr>
		<tr>
			<td>User Skills set:</td> <td>${userData.userSkills }</td>
		</tr>
		<tr>
			<td>User Address:</td> <td>${userData.userAddress }</td>
		</tr>
       <a href="getAllUserList">Get All Registered User List</a>
	</table>
</body>
</html>