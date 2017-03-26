<%-- 
    Document   : index
    Created on : 26 Mar, 2017, 7:44:17 PM
    Author     : Anumey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="../../favicon.ico">

        <title>Index</title>

        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="css/bootstrap.min.css"/>

    </head>

    <body>
        <div class="container">
                <div class="row">
                    <div class="col-lg-3"></div>
                    <div class="col-lg-6">
                        <form action="Login" method="post">
                            <h2 class="text-center">Please sign in</h2>
                            <input type="text"  class="form-control" placeholder="Email address" required autofocus name="userId">
                            <input type="password"  class="form-control" placeholder="Password" required  name="password">
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox" value="remember-me"> Remember me
                                </label>
                            </div>
                            <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
                        </form>

                    </div>
                    <div class="col-lg-3"></div>
                </div>
        </div> <!-- /container -->
    </body>
</html>

