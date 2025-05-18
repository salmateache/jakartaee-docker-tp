package com.example.servlet;

import com.example.dao.NotesDAO;
import com.example.model.Notes;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class ListeNotesServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        NotesDAO dao = new NotesDAO();
        List<Notes> notes = dao.getAll();
        req.setAttribute("notes", notes);
        req.getRequestDispatcher("notes.jsp").forward(req, res);
    }
}
