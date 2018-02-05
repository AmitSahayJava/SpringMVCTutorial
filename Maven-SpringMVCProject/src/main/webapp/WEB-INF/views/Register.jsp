<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <form action="registerUser" method="post">
   
   <table>
     <tr>
       <td>Enter Your Name: </td> <td><input type="text" name="name"></td>       
     </tr>
     <tr>
       <td>Enter Your Age: </td> <td><input type="text" name="age"></td>       
     </tr>
     
     <tr>
       <td>Enter Your Email: </td> <td><input type="text" name="email"></td>       
     </tr>
     <tr>
       <td>Select Your Country: </td> <td><select name="country">
              <option value="India">India</option>
              <option value="US">US</option>
              <option value="Others">Others</option>
       </select></td>       
     </tr>
     <tr>
     <td colspan="2"><input type="submit" value="Register User"/>
     </tr>
   </table>
   
   </form>
</body>
</html>