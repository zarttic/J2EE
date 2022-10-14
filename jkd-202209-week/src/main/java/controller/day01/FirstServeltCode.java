package controller.day01;

import javax.servlet.*;
import java.io.*;
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
//        //1. 设置文档的类型
        resp.setContentType("text/html;charset=utf-8");
//        //2. 获取文档输出流
        PrintWriter out = resp.getWriter();
//        //3. 直接输出内容到网页
        //前端代码和java后端代码耦合在一块儿了.
        FileInputStream ip = new FileInputStream("src/main/webapp/homework_1/login.html");
        BufferedReader rd = new BufferedReader(new InputStreamReader(ip));
        String str = null;
        while ((str = rd.readLine()) != null)
        {
            out.println(str);
        }
        ip.close();
        rd.close();
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
