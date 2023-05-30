<%-- 
    Document   : error_page
    Created on : Feb 2, 2023, 6:15:29 PM
    Author     : Amisha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sorry! Something went wrong..</title>
         <!<!-- css -->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/mycss.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
      .banner-background{
       clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 95%, 65% 93%, 32% 96%, 0 92%, 0 0);
      }
        </style>
    </head>
    <body>
        <div class="container text-center">
            <img src="image/error.png" class="img-fluid">
            <h3 class="display-6">Sorry! Something went wrong...</h3>
            
            <a href="index.jsp" class="primary-background btn btn-lg text-white mt-3">Home</a>
        </div>
    </body>
</html>
