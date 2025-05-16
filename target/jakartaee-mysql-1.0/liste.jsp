<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Liste des Étudiants</title>
    <style>
        /* Styles CSS (comme précédemment) */
        body { font-family: Arial, sans-serif; margin: 20px; background-color: #f4f4f4; }
        h2 { color: #333; text-align: center; margin-bottom: 20px; }
        table { width: 80%; margin: 0 auto; border-collapse: collapse; background-color: #fff; box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1); }
        th, td { padding: 10px; border: 1px solid #ddd; text-align: left; }
        th { background-color: #f0f0f0; color: #333; font-weight: bold; }
        tr:nth-child(even) { background-color: #f9f9f9; }
        tr:hover { background-color: #e0e0e0; }
    </style>
</head>
<body>
    <h2>Liste des Étudiants</h2>
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nom</th>
                <th>Prénom</th>
                <th>Email</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="e" items="${etudiants}">
                <tr>
                    <td>${e.id}</td>
                    <td>${e.nom}</td>
                    <td>${e.prenom}</td>
                    <td>${e.email}</td>
                    <td>
                        <a href="modifierEtudiant?id=${e.id}">Modifier</a> |
                        <a href="supprimerEtudiant?id=${e.id}" onclick="return confirm('Êtes-vous sûr de vouloir supprimer cet étudiant ?')">Supprimer</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>