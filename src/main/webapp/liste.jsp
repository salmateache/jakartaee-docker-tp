<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>Relevés de notes</title></head>
<body>
<h2>Relevés de notes</h2>
<table border="1">
<tr><th>ID</th><th>Nom Étudiant</th><th>Matière</th><th>Note</th></tr>
<c:forEach var="r" items="${releves}">
<tr>
<td>${r.id}</td>
<td>${r.nomEtudiant}</td>
<td>${r.matiere}</td>
<td>${r.note}</td>
</tr>
</c:forEach>
</table>
</body>
</html>

