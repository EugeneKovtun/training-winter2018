package ua.training;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        System.out.println(login);
        System.out.println(password);
        req.setAttribute("login", login);
        req.setAttribute("password", password);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

//    private void processUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String login = req.getParameter("login");
//        String password = req.getParameter("password");
//        System.out.println(login);
//        System.out.println(password);
//        req.setAttribute("login", login);
//        req.setAttribute("password", password);
//        req.getRequestDispatcher("index.jsp").forward(req, resp);
//    }
}
