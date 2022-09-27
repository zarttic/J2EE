package controller;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServeltCode implements Servlet {


    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        //1. 设置文档的类型
        resp.setContentType("text/html;charset=utf-8");
        //2. 获取文档输出流
        PrintWriter out = resp.getWriter();
        //3. 直接输出内容到网页
        //前端代码和java后端代码耦合在一块儿了.
        out.println("<!doctype html>");//h5的文档的头的声明部分
        out.println("<html>");
        out.println("   <head>");
        out.println("       <title>a港大</title>");
        out.println("       <meta charset=utf-8>");
        out.println("   </head>");
        out.println("   <body>");
        out.println("        <h3>第一个servlet程序</h3>");
        out.println("   </body>");
        out.println("</html>");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
