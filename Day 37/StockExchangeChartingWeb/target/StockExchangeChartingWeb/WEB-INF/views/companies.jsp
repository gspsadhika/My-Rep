<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page isELIgnored="false" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:url var="userUrl" value="/user/save"></c:url>
<form:form action="${userUrl}" modelAttribute="company">

	<table>
	  	<tr>
			<td><form:label path="id">Id</form:label></td>
			<td><form:input path="id"/></td>
		</tr>
		<tr>
			<td><form:label path="companyname">Companyname</form:label></td>
			<td><form:input path="companyname"/></td>
		</tr>
		<tr>
			<td><form:label path="sector">Sector</form:label></td>
			<td><form:input path="sector"/></td>
		</tr>
		<tr>
			<td><form:label path="ceo">CEOname</form:label></td>
			<td><form:input path="ceo"/></td>
		</tr>
		<tr>
			<td><form:label path="bod">Board of Directories</form:label></td>
			<td><form:input path="bod"/></td>
		</tr>
		 	<tr>
			<td><form:label path="turnover">TurnOver</form:label></td>
			<td><form:input path="turnover"/></td>
		</tr>
		
		 
		<tr>
			<td></td>
			<td><button type="submit">SUBMIT</button></td>
		</tr>
		
		
	</table>
</form:form>
</body>
</html>