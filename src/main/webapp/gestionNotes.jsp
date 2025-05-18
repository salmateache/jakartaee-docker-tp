<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="com.example.model.GestionNotes" %>
<html>
<head>
    <title>Gestion des Notes</title>
</head>
<body>
   <h2>Ajouter une Note</h2>
<form method="post" action="gestionnotes">
    <label for="idEtudiant">ID Étudiant:</label>
    <input type="number" id="idEtudiant" name="idEtudiant" required><br><br>

    <label for="idEvaluation">ID Évaluation:</label>
    <input type="number" id="idEvaluation" name="idEvaluation" required><br><br>

    <label for="valeurNote">Note:</label>
    <input type="number" id="valeurNote" name="valeurNote" step="0.01" required><br><br>

    <input type="submit" value="Enregistrer">
</form>


    <h2>Liste des Notes</h2>
<table border="1">
    <tr>
        <th>ID</th>
        <th>ID Étudiant</th>
        <th>ID Évaluation</th>
        <th>Note</th>
    </tr>

    <!-- Lignes ajoutées manuellement -->
    <tr>
        <td>1</td>
        <td>1</td>
        <td>1</td>
        <td>15.5</td>
    </tr>
    <tr>
        <td>2</td>
        <td>2</td>
        <td>2</td>
        <td>17.0</td>
    </tr>
    <tr>
        <td>3</td>
        <td>1</td>
        <td>4</td>
        <td>19.6</td>
    </tr>

    <%
        List<GestionNotes> notes = (List<GestionNotes>) request.getAttribute("notes");
        if (notes != null) {
            for (GestionNotes n : notes) {
    %>
    <tr>
        <td><%= n.getId() %></td>
        <td><%= n.getIdEtudiant() %></td>
        <td><%= n.getIdEvaluation() %></td>
        <td><%= n.getValeurNote() %></td>
    </tr>
    <%
            }
        }
    %>
</table>
</body>
</html>
