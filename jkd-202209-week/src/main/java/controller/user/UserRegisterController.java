/**
 * @Description
 * @author liyajun
 * @create 2022-10-22 15:26
 */

package controller.user;

import com.alibaba.fastjson.JSON;
import entity.ResultVo;
import entity.user;
import service.impl.userServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/user/registerToWeb")
public class UserRegisterController extends HttpServlet {

    private service.userService userService = new userServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/json;charset=utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        ResultVo res;
        user user = userService.findUser(username, password);
        if (user != null){
            res = new ResultVo("500","用户已存在",null);
        }
        else {
            user addUser = new user();
            addUser.setUsername(username);
            addUser.setPassword(password);
            addUser.setPower(1);
            userService.insertUser(addUser);
            res = new ResultVo("200","注册成功",null);
        }
        PrintWriter pw = resp.getWriter();
        pw.print(JSON.toJSONString(res));



    }
}
