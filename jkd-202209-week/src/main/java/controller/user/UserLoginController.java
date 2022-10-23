/**
 * @Description
 * @author liyajun
 * @create 2022-10-22 13:48
 */

package controller.user;

import com.alibaba.fastjson.JSON;
import entity.ResultVo;
import entity.user;
import service.impl.userServiceImpl;
import service.userService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/user/loginToWeb")
public class UserLoginController extends HttpServlet {
    private service.userService userService = new userServiceImpl();

    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {


        String username = req.getParameter("username");
        String password = req.getParameter("password");
        resp.setContentType("text/json;charset=utf-8");
        user u = userService.findUser(username,password);
        ResultVo resultVo;
        if (u != null ){
            resultVo = new ResultVo("200","登录成功",null);
        }else {
            resultVo = new ResultVo("500","登录失败",null);
        }
        PrintWriter out = resp.getWriter();
        out.print(JSON.toJSONString(resultVo));

    }
}
