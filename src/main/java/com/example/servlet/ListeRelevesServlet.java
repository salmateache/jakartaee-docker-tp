package com.example.servlet;

import com.example.dao.ReleveNotesDAO;
import com.example.model.ReleveNotes;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class ListeRelevesServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        ReleveNotesDAO dao = new ReleveNotesDAO();
        List<ReleveNotes> releves = dao.getAll();
        req.setAttribute("releves", releves);
        req.getRequestDispatcher("liste.jsp").forward(req, res);
    }
}
