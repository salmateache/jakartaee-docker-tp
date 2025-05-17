<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>Liste des Évaluations</title></head>
<body>
<h2>Évaluations</h2>
<table border="1">
    <tr><th>ID</th><th>Matière</th><th>Date</th><th>ID Étudiant</th></tr>
    <c:forEach var="e" items="${evaluations}">
        <tr>
            <td>${e.id}</td>
            <td>${e.matiere}</td>
            <td>${e.dateEval}</td>
            <td>${e.idEtud}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
