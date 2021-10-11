package com.yutao.shi;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author shiyutao
 * @create 2021-10-10 16:15
 */
public class helloservlet implements Servlet{


    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("helloservlet");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
