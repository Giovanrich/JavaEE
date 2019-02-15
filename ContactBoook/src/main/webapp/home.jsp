<%-- 
    Document   : home
    Created on : Feb 14, 2019, 11:16:26 AM
    Author     : chiraran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>ContactBook App</title>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="bootstrap/css/custom.css" rel="stylesheet">

    </head>
    <body>

        <!-- Navigation--->
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                </div>
            </div>
        </nav><!--END NAVIGATION-->

        <div class="container"><!--Start main container-->
            <div class="row">
                <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3"></div>
                <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
                    <div class="row"><h2 class="text-center">All your Contacts</h2></div>
                    <br>
                    <a href="ContactController?action=new" class="btn btn-info">Add Contact</a>
                    <a href="ContactController?action=logout" class="btn btn-info">Logout</a>
                    <br>
                    <br>
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Name</th>
                                <th>Surname</th>
                                <th>Email</th>
                                <th>Phone</th>
                                <th>Action</th>
                                <th></th>
                            </tr>
                        </thead>

                        <tbody>
                            <c:forEach items="${contacts}" var="contacts">
                                <tr>
                                    <td><c:out value="${contacts.id}"/></td>
                                    <td><c:out value="${contacts.fName}"/></td>
                                    <td><c:out value="${contacts.lName}"/></td>
                                    <td><c:out value="${contacts.email}"/></td>
                                    <td><c:out value="${contacts.phone}"/></td>
                                    <td><a href="ContactController?action=edit&contactId=<c:out value="${contacts.id}"/>">Edit</a></td>
                                    <td><a href="ContactController?action=delete&contactId=<c:out value="${contacts.id}"/> ">Delete</a></td>
                                </tr>                        
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
                <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3"></div>
            </div>

        </div><!--End main container-->


        <!-- Bootstrap core JavaScript
            ================================================== -->
        <script src="bootstrap/js/jquery.min.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>
        <script type="text/javascript">
            $(document).on('click', '.navbar-collapse.in', function (e) {
                if ($(e.target).is('a:not(".dropdown-toggle")')) {
                    $(this).collapse('hide');
                }
            });
        </script>
    </body>
</html>
