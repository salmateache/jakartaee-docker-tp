<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <html>

    <head>
        <title>Liste des Notes</title>
    </head>

    <body>
        <h2>Notes des Étudiants</h2>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>ID Étudiant</th>
                <th>Matière</th>
                <th>Note</th>
            </tr>
            <c:forEach var="n" items="${notes}">
                <tr>
                    <td>${n.id}</td>
                    <td>${n.etudiantId}</td>
                    <td>${n.matiere}</td>
                    <td>${n.note}</td>
                </tr>
            </c:forEach>
        </table>
    </body>

    </html>