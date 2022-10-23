/**
 * @Description
 * @author liyajun
 * @create 2022-10-22 15:20
 */

package controller.user;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/user/login")
public class UserLoginViewer extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

        req.getRequestDispatcher("/WEB-INF/user/login.jsp").forward(req, resp);
    }
}
