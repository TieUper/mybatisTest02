package com.tie.servlet;

import com.tie.model.PageInfo;
import com.tie.service.StudentService;
import com.tie.service.StudentServiceImpl;
import org.omg.CORBA.INTERNAL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/queryInfo")
public class StudentServlet extends HttpServlet {

    StudentService service = new StudentServiceImpl();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int pageSize = 3;
        String pageSizeStr = req.getParameter("pageSize");
        if (pageSizeStr != null && pageSizeStr != "") {
            pageSize = Integer.parseInt(pageSizeStr);
        }
        int pageNumber = 1;
        String pageNumberStr = req.getParameter("pageNumber");
        if (pageNumberStr != null && pageNumberStr != "") {
            pageNumber = Integer.parseInt(pageNumberStr);
        }
        String sName = req.getParameter("sName");
        String tName = "张";
        PageInfo studentPageInfo = service.getStudentPageInfo(sName, tName, pageSize, pageNumber);

        req.setAttribute("pageInfo", studentPageInfo);
        req.getRequestDispatcher("/index.jsp").forward(req,resp);

    }
}
