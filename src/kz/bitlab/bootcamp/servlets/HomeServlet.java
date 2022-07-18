package kz.bitlab.bootcamp.servlets;

import kz.bitlab.bootcamp.db.User;
import kz.bitlab.bootcamp.db.DBManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(value = "/indexpage")

public class HomeServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        ArrayList<User>users = DBManager.getUsers();
;
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Home Work 2</title>");

        out.print("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">");
        out.print("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>");

        out.print("</head>");
        out.print("<div class = 'container mt-5>");
        out.print("<div class = 'row mt-3'>");
        out.print("<div class = 'col-10 mx-auto'>");

        out.print("<div class = 'container mt-5'>");
        out.print("<table class = 'table table-striped table-hover'>");
        out.print("<thead>");
        out.print("<tr>");
        out.print("<th>NAME</th>");
        out.print("<th>SURNAME</th>");
        out.print("<th>DEPARTMENT</th>");
        out.print("<th>SALARY</th>");
        out.print("</tr>");
        out.print("</thead>");

        out.print("<tbody>");
        for(User us: users){
            out.print("<tr>");
            out.print("<td>" + us.getName() + "</td>");
            out.print("<td>" + us.getSurname() + "</td>");
            out.print("<td>" + us.getDepartment() + "</td>");
            out.print("<td>" + us.getSalary() + "</td>");
            out.print("</tr>");
        }
        out.print("</div>");
        out.print("</div>");
        out.print("</div>");
        out.print("</tbody>");
        out.print("</html>");
    }
}
