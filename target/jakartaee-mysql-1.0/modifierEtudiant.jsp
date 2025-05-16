<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Modifier Étudiant</title>
    <style>
        /* Styles CSS (vous pouvez les adapter) */
        body { font-family: Arial, sans-serif; margin: 20px; background-color: #f4f4f4; }
        h2 { color: #333; text-align: center; margin-bottom: 20px; }
        form { width: 50%; margin: 0 auto; background-color: #fff; padding: 20px; box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1); }
        label { display: block; margin-bottom: 5px; font-weight: bold; }
        input[type="text"] { width: 100%; padding: 8px; margin-bottom: 10px; border: 1px solid #ddd; border-radius: 4px; }
        input[type="submit"] { background-color: #4CAF50; color: white; padding: 10px 15px; border: none; border-radius: 4px; cursor: pointer; }
        input[type="submit"]:hover { background-color: #45a049; }
        a { display: block; margin-top: 10px; color: #007bff; text-decoration: none; }
        a:hover { text-decoration: underline; }
    </style>
</head>
<body>
    <h2>Modifier Étudiant</h2>
    <form action="modifierEtudiant" method="post">
        <input type="hidden" name="id" value="${etudiant.id}"> <%-- Champ caché pour l'ID --%>
        <label for="nom">Nom:</label>
        <input type="text" id="nom" name="nom" value="${etudiant.nom}" required>
        <label for="prenom">Prénom:</label>
        <input type="text" id="prenom" name="prenom" value="${etudiant.prenom}" required>
        <label for="email">Email:</label>
        <input type="text" id="email" name="email" value="${etudiant.email}" required>
        <input type="submit" value="Enregistrer les modifications">
        <a href="etudiants">Retour à la liste</a>
    </form>
</body>
</html>