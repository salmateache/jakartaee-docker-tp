package com.example.servlet;

import com.example.dao.EtudiantDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/supprimerEtudiant")
public class SupprimerEtudiantServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private EtudiantDAO etudiantDAO = new EtudiantDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        etudiantDAO.supprimerEtudiant(id);
        resp.sendRedirect("etudiants"); // Retourner à la liste après la suppression
    }
}