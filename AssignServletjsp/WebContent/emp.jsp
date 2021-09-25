<%@page import="com.eg.Emp"%>

<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee List</title>
</head>
<body>
	<h1>Employee List</h1>
	<table border="1" width="500" align="center">
		<tr bgcolor="00FF7F">
			<th><b>ID</b></th>
			<th><b>Employee Name</b></th>
			<th><b>Department</b></th>
		</tr>
		<%
			ArrayList<Emp> emp = (ArrayList<Emp>) request.getAttribute("data");
		for (Emp e : emp) {
		%>
		<tr>
			<td><%=e.getId()%></td>
			<td><%=e.getName()%></td>
			<td><%=e.getDept()%></td>
		</tr>
		<%
			}
		%>
	</table>
	<hr />
</body>
</html>