package com.example.servlet;

import com.example.dao.EtudiantDAO;
import com.example.model.Etudiant;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/etudiants") // Annotation pour déclarer le servlet
public class ListeEtudiantsServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        EtudiantDAO dao = new EtudiantDAO();
      List<Etudiant> etudiants = dao.getAllEtudiants();

        req.setAttribute("etudiants", etudiants);
        req.getRequestDispatcher("/liste.jsp").forward(req, res);
    }
}
