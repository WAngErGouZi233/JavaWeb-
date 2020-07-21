package servlet;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.UserDao;
import dao.UserDaoImplement;
import entity.MyUser;

public class showAllServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");
        UserDao ud = new UserDaoImplement();
        List<MyUser> userAll = ud.getUserAll();
        request.setAttribute("all", userAll);
        request.getRequestDispatcher("showAll.jsp").forward(request, response);
    }
}
