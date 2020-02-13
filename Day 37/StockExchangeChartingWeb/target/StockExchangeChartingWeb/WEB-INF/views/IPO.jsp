<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>
<h2>Hello World!</h2>
<hr>
${message }

<table border="1">
<tr>
<th>ID</th>
<th>CompanyName</th>
<th>PricePerShare</th>
<th>Remarks</th>
<th>StockExchange</th>
<th>TotalStocks</th>


</tr>
<c:forEach var="ipo" items="${list3 }">
<tr>

<td>${ipo.id }</td>
<td>${ipo.companyName}</td>
<td>${ipo.pricePerShare }</td>
<td>${ipo.remarks }</td>
<td>${ipo.stockExchange}</td>
<td>${ipo.totalStocks }</td>


</tr>


</c:forEach>

</table>
</body>
</html>
