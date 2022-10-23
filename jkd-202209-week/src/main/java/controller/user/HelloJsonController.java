/**
 * @Description
 * @author liyajun
 * @create 2022-10-22 14:19
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

@WebServlet(urlPatterns = "/json")
public class HelloJsonController extends HttpServlet {
    private userService userService = new userServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        user user = userService.findById(1);
        ResultVo res = new ResultVo("200","by id",user);
        resp.setContentType("text/json;charset=utf-8");
        PrintWriter out = resp.getWriter();
        out.print(JSON.toJSONString(res));
    }
}
