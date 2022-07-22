<%@ page import="java.util.ArrayList" %>
<%@ page import="kz.bitlab.bootcamp.db.News" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
        <%@include file="head.jsp"%>
</head>
<body>
        <%@include file="navbar.jsp"%>
        <div class="container" style="min-height: 800px;">
            <div class="row mt-3">
                <div class="col-12">
                    <%
                        ArrayList<News> newsList = (ArrayList<News>) request.getAttribute(  "news");
                        if(newsList != null){
                            for(News news: newsList){
                    %>
                        <h3>
                            <%=news.getTitle()%>
                        </h3>
                        <p>
                            <%=news.getContent()%>
                        </p>
                        <p>
                            Posted by <strong><%=news.getAuthor()%></strong>
                        </p>
                    <%
                            }
                        }
                    %>
                </div>
            </div>
        </div>
</body>
</html>
