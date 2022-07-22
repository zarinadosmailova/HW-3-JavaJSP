package kz.bitlab.bootcamp.db;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DBNews {
    private static ArrayList<News> allNews = new ArrayList<>();

    static{
        allNews.add(new News(1L, "Sport News 1","Sport News Content 1","Adam Holmes","sport"));
        allNews.add(new News(2L, "Sport News 2","Sport News Content 1","Adam Holmes","sport"));
        allNews.add(new News(3L, "Culture News 1","Culture News Content 1","Adam Holmes","culture"));
        allNews.add(new News(4L, "Culture News 2","Culture News Content 1","Adam Holmes","culture"));
        allNews.add(new News(5L, "Cinema News 1","Cinema News Content 1","Adam Holmes","cinema"));
        allNews.add(new News(6L, "Cinema News 1","Cinema News Content 1","Adam Holmes","cinema"));
        allNews.add(new News(7L, "Cinema News 3","Cinema News Content 1","Adam Holmes","cinema"));
        allNews.add(new News(8L, "Culture News 3","Culture News Content 1","Adam Holmes","culture"));
        allNews.add(new News(9L, "Sport News 3","Sport News Content 1","Adam Holmes","sport"));
    }

    private static long id = 10L;

    public static ArrayList<News> getAllNews(){
        return allNews;
    }

    public static List<News> getNewsByCategory(String category){
        return allNews.stream().filter(news -> news.getCategory().equals(category)).collect(Collectors.toList());
    }

    public static void addNews(News news){
        news.setId(id);
        allNews.add(news);
        id++;
    }
}