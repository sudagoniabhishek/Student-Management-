<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>
<h1  style="color:white;">WELCOME TO LOGIN </h1>
<form action="Log"   method="post">

<table>
<tr>
<td>
&nbsp;
</td><td>
&nbsp;
</td>
</tr>
<tr>
<td><h2 style="color:white;">Email:</h2></td><td><input type="email"    name="tbemail"   class="tb"        value="<%= request.getParameter("tbemail")%>"   /></td>
</tr>
<tr>
<td><h2 style="color:white;">Password:</h2></td><td><input type="password"  name="tbpass"    class="tb"  value="<%=request.getParameter("tbpass")%>"                  /></td>
</tr>
<tr>
<td></td><td><h2 style="color:magenta;"><input type="submit"   value="Login"></h2></td>
</tr>




</table>


</form>
<link rel="stylesheet"  href="log.css"/>

</body>
</html>