<%@ page language="java" contentType="text/html;"%>


<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
    <form  action="LoginController" method="get">
	<table>
		<tr bgcolor="magenta">
			<center><td colspan="2"> Login Here </td></center>
		</tr>
		<tr>
			<center><td>User Name</td></center>
			<td><input type="text"name="USERNAME"></td>
		</tr>
		<tr>
			<center><td>Password</td></center>
			<td><input type="password" name="PASSWORD"></td>
		</tr>
		<tr>
			<td colspan="2">
			<center><input type="submit"value="Login"/></center>
			</td>
		</tr>		
	</table>
	</form>
</body>
</html>