<%-- 
    Document   : companyDetails
    Created on : 26 Mar, 2017, 7:58:15 PM
    Author     : Anumey
--%>

<%@page import="com.company.dto.Members"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="../../favicon.ico">

        <title>company Details</title>

        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="css/bootstrap.min.css"/>

    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-lg-2"></div>
                <div class="col-lg-8">
                    <table class="table table-hover">
                        <tr>
                            <th>S.No </th>
                            <th> Name </th> 
                            <th> City </th>
                            <th> Country </th>
                        </tr>
                        <%
                            ArrayList<Members> memberList = (ArrayList<Members>) request.getAttribute("memberList");
                        %>
                        <% for (Members member : memberList) {%>
                        <tr>
                            <td><%=member.getId()%></td>
                            <td ><%=member.getName()%></td>
                            <td ><%=member.getCity()%></td>
                            <td ><%=member.getCountry()%></td>
                            <td></td>
                        </tr>
                        <%}%>
                    </table>
                </div>
                <div class="col-lg-2"></div>
            </div>
        </div> <!-- /container -->
    </body>
</html>
