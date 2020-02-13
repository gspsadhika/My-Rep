<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h2>Hello World!</h2>
<hr>
${message }

<table border="1">
<tr>
<th>ID</th>
<th>BoardOfDirectories</th>
<th>CEOName</th>
<th>CompanyName</th>
<th>Sector</th>
<th>TurnOver</th>

<div>
        <tr>
			<td><form:label path="companyName">Company Name</form:label></td>
			<td><form:input path="companyName"></form:input></td>
		</tr>
		<tr>
			<td><form:label path="idNumber">Company Id</form:label></td>
			<td><form:input path="idNumber"></form:input></td>
		</tr>
		<tr>
			<td><form:label path="ceoName">Company CEO</form:label></td>
			<td><form:input path="ceoName"></form:input></td>
		</tr>
		<tr>
			<td><form:label path="briefDescription">Brief Description</form:label></td>
			<td><form:input path="briefDescription"></form:input></td>
		</tr>
		<tr>
			<td><form:label path="boardMember">Board member</form:label></td>
			<td><form:input path="boardMember"></form:input></td>
		</tr>
</div>
<c:forEach var="user1" items="${list1 }">
<tr>

<td>${user1.id }</td>
<td>${user1.bod}</td>
<td>${user1.ceo }</td>
<td>${user1.companyname }</td>
<td>${user1.sector}</td>
<td>${user1.turnover }</td>


</tr>


</c:forEach>


</table>
</body>
</html>
