package servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.UserDao;
import dao.UserDaoImplement;

public class deleteServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String id = request.getParameter("id");

        UserDao ud = new UserDaoImplement();

        if (ud.delete(id)) {
            request.getRequestDispatcher("addUpdateDeleteSuccess.jsp").forward(request, response);
        } else {
            response.sendRedirect("addUpdateDeleteFail.jsp");
        }
    }
}
