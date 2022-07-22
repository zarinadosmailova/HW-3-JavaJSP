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
            <form action="/addnews" method="post">
                <div class="row">
                    <div class="col-6 mx-auto">
                       <label>Title : </label>
                    </div>
                </div>
                <div class="row mt-2">
                    <div class="col-6 mx-auto">
                        <input type="text" name="title" placeholder="Insert title" class="form-control">
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col-6 mx-auto">
                        <label>Content : </label>
                    </div>
                </div>
                <div class="row mt-2">
                    <div class="col-6 mx-auto">
                        <input type="text" name="content" placeholder="Insert content" class="form-control">
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col-6 mx-auto">
                        <label>Author : </label>
                    </div>
                </div>
                <div class="row mt-2">
                    <div class="col-6 mx-auto">
                        <input type="text" name="author" placeholder="Insert author" class="form-control">
                    </div>
                </div>
                <div class="row mt-3">
                    <div class="col-6 mx-auto">
                        <label>Category : </label>
                    </div>
                </div>
                <div class="row mt-2">
                    <div class="col-6 mx-auto">
                        <select class="form-select" name="category">
                            <option value="cinema">Cinema News</option>
                            <option value="culture">Culture News</option>
                            <option value="sport">Sport News</option>
                        </select>
                    </div>
                </div>
                <div class="row mt-4">
                    <div class="col-6 mx-auto">
                        <div class="button">
                            <button class="btn btn-success">Add News</button>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>

