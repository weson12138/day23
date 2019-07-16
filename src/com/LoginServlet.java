package com;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //登陆功能
        //获取客户端发送过来的数据
        //http;：//localhost:8080/loginServlet?username=admin&password=123
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html:charset=utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println("username:"+username+",password:"+password);
    }
}
