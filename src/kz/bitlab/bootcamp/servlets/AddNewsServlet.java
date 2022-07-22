package kz.bitlab.bootcamp.servlets;

import kz.bitlab.bootcamp.db.DBNews;
import kz.bitlab.bootcamp.db.News;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/addnews")
public class AddNewsServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        request.getRequestDispatcher("/addNews.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        String content = req.getParameter("content");
        String author = req.getParameter("author");
        String category = req.getParameter("category");

        News news = new News();
        news.setTitle(title);
        news.setContent(content);
        news.setAuthor(author);
        news.setCategory(category);
        DBNews.addNews(news);

        resp.sendRedirect("/addnews");

    }
}