package ua.training;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processUser(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processUser(req, resp);
    }

    private void processUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String data = req.getMethod() + req.getAuthType()
                + req.getContextPath() + req.getPathInfo()
                + req.getQueryString();
        req.setAttribute("data", data);
        String login = (String) req.getAttribute("log");
        String password = (String) req.getAttribute("pas");

        req.setAttribute("login", login + "te");
        req.setAttribute("password", password + "tr");
        System.out.println(login + " " + password);
        System.out.println(data);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

}
