package com.example.servlet;

import com.example.dao.EtudiantDAO;
import com.example.model.Etudiant;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/modifierEtudiant")
public class ModifierEtudiantServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private EtudiantDAO etudiantDAO = new EtudiantDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Etudiant etudiant = etudiantDAO.getEtudiantById(id);
        if (etudiant != null) {
            req.setAttribute("etudiant", etudiant);
            req.getRequestDispatcher("/modifierEtudiant.jsp").forward(req, resp); // Créez ce fichier JSP
        } else {
            resp.sendRedirect("etudiants"); // Retourner à la liste si l'étudiant n'est pas trouvé
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String nom = req.getParameter("nom");
        String prenom = req.getParameter("prenom");
        String email = req.getParameter("email");

        Etudiant etudiant = new Etudiant();
        etudiant.setId(id);
        etudiant.setNom(nom);
        etudiant.setPrenom(prenom);
        etudiant.setEmail(email);

        etudiantDAO.modifierEtudiant(etudiant);
        resp.sendRedirect("etudiants"); // Retourner à la liste après la modification
    }
}