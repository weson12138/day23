package com;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloWordServlet extends HttpServlet {

   //每次通过get方式请求服务器调用
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    //每次通过post的方式请求服务起调用
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    //web服务器关闭调用destroy方法
    @Override
    public void destroy() {
        super.destroy();
    }


    //web服务器实例化Servlet之后调用init方法 只会执行一次
    @Override
    public void init() throws ServletException {
        super.init();
    }
}
