<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring 3 MVC Series - My Contact Manager</title>
</head>
<body>
	<h2>My Contact Manager</h2>
	<form:form method="post" action="addMyContact.html">

		<table>
			<tr>
				<td><form:label path="name">Name</form:label></td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td><form:label path="mobile">Mobile</form:label></td>
				<td><form:input path="mobile"/></td>
			<tr>
				<td colspan="2"><input type="submit" value="Add My Contact" /></td>
			</tr>
		</table>

	</form:form>
</body>
</html>