<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<html> 
<head>
    <title>Liste des Cours</title>
</head> 
<body> 
    <h2>Cours</h2> 
    <table border="1"> 
        <tr>
            <th>ID</th>
            <th>Nom du Cours</th>
            <th>Code du Cours</th>
            <th>Crédits</th>
        </tr> 
        <c:forEach var="c" items="${cours}"> 
            <tr> 
                <td>${c.idCours}</td> 
                <td>${c.nomCours}</td> 
                <td>${c.codeCours}</td> 
                <td>${c.credits}</td> 
            </tr> 
        </c:forEach> 
    </table> 
</body> 
</html>
