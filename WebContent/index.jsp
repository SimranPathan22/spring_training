<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="login" method="post">
  <input type="hidden" name="requestAction" value="login">
  
<%if(null!=request.getAttribute("message")) { %>
<h3 style=" color:red;"><%=request.getAttribute("message") %></h3>
<%} %>
   <table>
   <tr>
       <td>UserName :</td>
       <td><input type="text" name="UserName"></td>
   </tr>
   
   <tr>
   		<td>Password : </td>
   		<td><input type="password" name="Password"></td>
   </tr>
   
   <tr>
       <td><input type="submit" name="Login" value="Login"></td>
   </tr>
   </table>

</form>

</body>
</html>