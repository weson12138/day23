package com;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class goServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String username = req.getParameter("username");//用户名
        String password = req.getParameter("password");//密码
        String[] hobby = req.getParameterValues("hobby");//爱好
        String sex = req.getParameter("sex");//性别

        PrintWriter out = resp.getWriter();
        out.println("username"+username);
        out.println("password"+password);
        out.println("sex"+sex);
        out.print("hobby"+hobby);
    }
}
