/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-10-14 08:50:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/user/../common/reg.jsp", Long.valueOf(1665733625197L));
    _jspx_dependants.put("/WEB-INF/user/../common/nav.jsp", Long.valueOf(1665736974430L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title></title>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/dev/plugins/bootstrap/css/bootstrap.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/dev/css/common/nav.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/dev/css/common/Carousel.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <nav class=\"navbar navbar-inverse\" role=\"navigation\">\r\n");
      out.write("            <div class=\"container-fluid\">\r\n");
      out.write("                <div class=\"navbar-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("                            data-target=\"#example-navbar-collapse\">\r\n");
      out.write("                        <span class=\"sr-only\">切换导航</span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                        <span class=\"icon-bar\"></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">华米商城</a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"example-navbar-collapse\">\r\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                        <li class=\"active\"><a href=\"/dev/user/index\">首页</a></li>\r\n");
      out.write("                        <li><a href=\"#\">我的购物车</a></li>\r\n");
      out.write("                        <li><a href=\"#\">我的订单</a></li>\r\n");
      out.write("                        <li><a href=\"/dev/user/register\">登录</a></li>\r\n");
      out.write("                        <li><a href=\"#\">安全退出</a></li>\r\n");
      out.write("                        <li><img id=\"head_img\" src=\"../imgs/girl.png\"></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>登录</title>\r\n");
      out.write("    <!-- 引入Boostarp 和 jQuery -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\" integrity=\"sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu\" crossorigin=\"anonymous\">\r\n");
      out.write("    <script src=\"https://cdn.bootcdn.net/ajax/libs/jquery/3.6.0/jquery.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/dev/css/common/register.css\">\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("        .login {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            opacity: 0.8;     /* 设置透明度*/\r\n");
      out.write("        }\r\n");
      out.write("        body {\r\n");
      out.write("            background-repeat: no-repeat;\r\n");
      out.write("            /* 背景图来自百度 */\r\n");
      out.write("            background-position: center 0;\r\n");
      out.write("            background-attachment: fixed;\r\n");
      out.write("            background-size: cover;\r\n");
      out.write("            -webkit-background-size: cover;\r\n");
      out.write("            -o-background-size: cover;\r\n");
      out.write("            -moz-background-size: cover;\r\n");
      out.write("            -ms-background-size: cover;\r\n");
      out.write("\r\n");
      out.write("            /*background-image: url(\"https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F3%2F59914c437c099.jpg%3Fdown&refer=http%3A%2F%2Fpic1.win4000.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1668248067&t=346c816f2c2aed346b4b6b00aa218288\");*/\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"login vertical-center\">\r\n");
      out.write("    <div class=\"modal-dialog\">\r\n");
      out.write("        <form method=\"POST\" method=\".\"> <!-- 表单 -->\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    <!-- 登录面板标题 -->\r\n");
      out.write("                    <h3 class=\"modal-title text-center\" id=\"myModalLabel\">登录账户</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-body\" id=\"model-body\">\r\n");
      out.write("                    <!-- 错误信息可以在这个p标签中输出 -->\r\n");
      out.write("                    <p style=\"color: red;\" class=\"error\"></p>\r\n");
      out.write("                    <div class=\"form-group has-feedback\">\r\n");
      out.write("                        <input type=\"text\" id=\"username\" class=\"form-control\" placeholder=\"用户名\" autocomplete=\"off\">\r\n");
      out.write("                        <span class=\"glyphicon glyphicon-user form-control-feedback\"></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"form-group has-feedback\">\r\n");
      out.write("                        <input type=\"password\" id=\"password\" class=\"form-control\" placeholder=\"密码\" autocomplete=\"off\">\r\n");
      out.write("                        <span class=\"glyphicon glyphicon-lock form-control-feedback\"></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <p>登录完成后，您就可以享受用户基本的权益了。</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-footer\">\r\n");
      out.write("                    <!-- 操作按钮 -->\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-primary\">登录</button>\r\n");
      out.write("                        <a class=\"btn btn-default\" href=\"#\">注册</a>\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-danger\" onclick=\"window.location.href='/'; return false;\">取消</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("    var li=document.getElementsByTagName(\"li\");\r\n");
      out.write("    console.log(li);\r\n");
      out.write("    for(var i=0;i<li.length;i++) {li[i].className=\"\";}\r\n");
      out.write("    li[3].className=\"active\";\r\n");
      out.write("    console.log(li);\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"/dev/plugins/jquery/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"/dev/plugins/bootstrap/js/bootstrap.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
