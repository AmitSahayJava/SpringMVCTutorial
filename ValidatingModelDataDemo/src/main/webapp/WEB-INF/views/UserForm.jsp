<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error{
  color: red;
}
</style>
</head>
<body>
	<h1>
		<center>User Registration Form</center>
	</h1>
	<form action="userdatacontroller" method="post">
		<table align="center">
           <tr>
             <td>Enter Your Name: </td>  <td><input type="text" name="userName"> </td>  <td><f:errors path="userData.userName" cssClass="error"/></td>
           </tr>
           <tr>
             <td>Enter Your DOB: </td>  <td><input type="text" name="userDOB"> </td>     <td><f:errors path="userData.userDOB" cssClass="error"/></td>
           </tr>
           <tr>
             <td>Select Your Skills: </td>  <td><input type="text" name="userSkills"> </td>  <td><f:errors path="userData.userSkills" cssClass="error"/></td>
           </tr>
           <tr>
             <td>Enter Your Address: </td>  <td><textarea rows="5" cols="10" name="userAddress"></textarea> </td>  <td><f:errors path="userData.userAddress" cssClass="error"/></td>
           </tr>
           <tr>
             <td colspan="2" align="center"> <input type="submit" value="Submit"> </td>
           </tr>
		</table>
	</form>

</body>
</html>