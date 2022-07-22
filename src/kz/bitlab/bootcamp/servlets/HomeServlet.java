package kz.bitlab.bootcamp.servlets;

import kz.bitlab.bootcamp.db.DBNews;
import kz.bitlab.bootcamp.db.News;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/allNews")
public class HomeServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String category = request.getParameter("category");

        if(category != null){
            ArrayList<News> newsList = (ArrayList<News>) DBNews.getNewsByCategory(category);
            request.setAttribute("news", newsList);
        }else{
            ArrayList<News> newsList = DBNews.getAllNews();
            request.setAttribute("news", newsList);
        }
        request.getRequestDispatcher("/news.jsp").forward(request,response);
    }
}

