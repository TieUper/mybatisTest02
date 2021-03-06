package com.tie.servlet;

import com.tie.service.AirportService;
import com.tie.service.AirportServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/showtake")
public class ShowTakeServlet extends HttpServlet {

    private AirportService service = new AirportServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(service.showTakePort());
        req.setAttribute("takeport",service.showTakePort());
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
