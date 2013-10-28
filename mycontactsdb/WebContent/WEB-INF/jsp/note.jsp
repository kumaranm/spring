<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Spring 3 MVC Series - My Notes</title>
</head>
<body>

	<h2>My Notes</h2>

	<form:form method="post" action="addnote.html" commandName="note">

		<table>
			<tr>
				<td><form:label path="title">
						<spring:message code="label.title" />
					</form:label></td>
				<td><form:input path="title" /></td>
			</tr>
			<tr>
				<td><form:label path="desc">
						<spring:message code="label.desc" />
					</form:label></td>
				<td><form:input path="desc" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit"
					value="<spring:message code="label.addnote"/>" /></td>
			</tr>
		</table>
	</form:form>


	<h3>Notes</h3>
	<c:if test="${!empty notesList}">
		<table class="data">
			<tr>
				<th>Sl no</th>
				<th>Title</th>
				<th>Note</th>
				<th>&nbsp;</th>
			</tr>
			<c:forEach items="${notesList}" var="note">
				<tr>
					<td>${note.id}</td>
					<td>${note.title}</td>
					<td>${note.desc}</td>
					<td><a href="deletenote/${note.id}">delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	<a href="index.jsp">Back</a>
</body>
</html>