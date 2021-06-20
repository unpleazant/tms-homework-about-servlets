package by.tms.servlet.registration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static by.tms.servlet.registration.UserStorage.*;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        User user = createUser(name, login, password);

        if (isUserPresent(user)) {
            response.getWriter().println(user + " is already exists");
        } else {
            addUser(user);
            response.getWriter().println("User has successfully created");
        }
    }
}
