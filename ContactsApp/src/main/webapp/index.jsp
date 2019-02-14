<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Contacts App</title>
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="bootstrap/css/custom.css" rel="stylesheet">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" 
              integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">

    </head>
    <body>

        <!-- Navigation--->
    <nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="container">
            <div class="navbar-header">
                <i class="fas fa-address-book fa-3x"> </i>

            </div>
            <div id="navbar" class="collapse navbar-collapse pull-center">
            </div><!--/.nav-collapse -->
        </div>
    </nav><!--END NAVIGATION-->

    <div class="container">
        <dir class="row">
            <div class="col-xs-2 col-sm-2 col-md-2 col-lg23"></div>
            <div class="col-xs-8 col-sm-8 col-md-8 col-lg-8">
                <h2 class="text-center">Contacts App</h2>



                <br>
                <br>
                <table class="table table-responsive table-striped">
                    <div class="row">
                        <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
                            <input type="text" class="form-control" placeholder="Type name here...">
                        </div>
                        <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
                            <button type="button" class="btn btn-default btn-block" data-toggle="modal" data-target="#addModal">Add New</button>
                        </div>

                    </div>
                    <br>
                    <br>

                    <thead>
                    <th>#</th>
                    <th>Name</th>
                    <th>Surname</th>
                    <th>Cell</th>
                    <th>Email</th>
                    <th></th>
                    <th></th>
                    </thead>
                    <tbody>
                        <tr>

                            <c:import url="/Contacts" />
                            <c:set var="myContacts" value="${requestScope.contactsList}" />
                            <c:forEach var="contact" items= "${myContacts}" varStatus="i">
                                <td>${contact.id}</td>
                                <td>${contact.name}</td>
                                <td>${contact.surname}</td>
                                <td>${contact.cell}</td>
                                <td>${contact.email}</td>
                        <form action="delete" method="post">
                            <input type="hidden" name="contact_id" value="${contact.id}">   
                            <td><button type="submit" class="btn btn-danger">Delete</button></td>
                        </form>

                        <td><i class="fas fa-trash-alt "> </i></td>

                        </tr>
                    </c:forEach>
                    </tbody>                    
                </table>
            </div>
            <div class="col-xs-2 col-sm-2 col-md-2 col-lg-2"></div>
    </div>


    <!--This is the add new contact modal-->
    <form action="AddNewContact" method="POST">
        <div class="modal fade" id="addModal">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title">Add new conatct</h4>
                    </div>
                    <div class="modal-body">
                        <input type="text" name="name" class="form-control" placeholder="Name">
                        <input type="text" name="surname" class="form-control" placeholder="Surname">
                        <input type="text" name="cell" class="form-control" placeholder="Cell">
                        <input type="email" name="email" class="form-control" placeholder="Email">
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>
                        <button type="submit" class="btn btn-primary">Save</button>
                    </div>
                </div>
            </div>
        </div>
    </form>
    <!--TEnd the add new contact modal-->

</div><!--end container-->



<!-- Bootstrap core JavaScript
    ================================================== -->
<script src="bootstrap/js/jquery.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
