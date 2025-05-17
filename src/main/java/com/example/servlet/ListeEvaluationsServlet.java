package com.example.servlet;

import com.example.dao.EvaluationDAO;
import com.example.model.Evaluation;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;
@WebServlet("/liste-evaluations")
public class ListeEvaluationsServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        EvaluationDAO dao = new EvaluationDAO();
        List<Evaluation> evaluations = dao.getAll();
        req.setAttribute("evaluations", evaluations);
        req.getRequestDispatcher("liste.jsp").forward(req, res);
    }
}
