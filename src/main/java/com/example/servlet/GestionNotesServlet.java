package com.example.servlet;

import java.io.IOException;
import java.util.List;

import com.example.dao.GestionNotesDAO;
import com.example.model.GestionNotes;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GestionNotesServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html;charset=UTF-8");
        req.setCharacterEncoding("UTF-8");

        GestionNotesDAO dao = new GestionNotesDAO();
        List<GestionNotes> notes = dao.getAllNotes();
        req.setAttribute("notes", notes);

        req.getRequestDispatcher("gestionNotes.jsp").forward(req, res);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html;charset=UTF-8");
        req.setCharacterEncoding("UTF-8");

        int idEtudiant = Integer.parseInt(req.getParameter("idEtudiant"));
        int idEvaluation = Integer.parseInt(req.getParameter("idEvaluation"));
        double valeur = Double.parseDouble(req.getParameter("valeurNote"));

        GestionNotes note = new GestionNotes(idEtudiant, idEvaluation, valeur);
        GestionNotesDAO dao = new GestionNotesDAO();
        dao.ajouterNote(note);

        res.sendRedirect("GestionNotesServlet");
    }
}
