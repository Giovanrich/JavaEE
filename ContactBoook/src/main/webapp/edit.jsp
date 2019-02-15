<%-- 
    Document   : user
    Created on : Feb 15, 2019, 10:02:37 AM
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
                    <form action="ContactController?action=update" method="POST" role="form">
                        <legend>Edit User</legend>
                        <table class="table">
                            <tbody><tr>
                                <div class="form-group">
                                    <td>
                                    ID
                                    </td>
                                    <td>
                                    <input type="text" class="form-control" name="id" readonly="readonly" value="<c:out value="${contact.id}" />"></td>
                                </div>
                                </tr>
                                <tr>
                                <div class="form-group">
                                    <td>
                                    Name
                                    </td>
                                    <td>
                                    <input type="text" class="form-control" name="name" placeholder="Name" value="<c:out value="${contact.fName}" />"></td>
                                </div>
                                </tr>
                                <tr>
                                <div class="form-group">
                                    <td>
                                    Surname
                                    </td>
                                    <td>
                                    <input type="text" class="form-control" name="surname" placeholder="Surname" value="<c:out value="${contact.lName}" />"></td>
                                </div>
                                </tr>
                                <tr>
                                <div class="form-group">
                                    <td>
                                    Email
                                    </td>
                                    <td>
                                    <input type="email" class="form-control" name="email" placeholder="Email" value="<c:out value="${contact.email}" />"></td>
                                </div>
                                </tr>
                                <tr>
                                <div class="form-group">
                                    <td>
                                    Phone
                                    </td>
                                    <td>
                                    <input type="phone" class="form-control" name="phone" placeholder="Phone" value="<c:out value="${contact.phone}" />"></td>
                                </div>
                                </tr>

                                <tr>
                                <div class="form-group">
                                    <td></td>
                                    <td>
                                        <div class="row">
                                            <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
                                                <button type="submit" class="btn btn-primary btn-block">Save</button>
                                            </div>
                                            <div class="col-xs-6 col-sm-6 col-md-3 col-lg-6">
                                                <a href="ContactController?action=home" class="btn btn-info btn-block">Cancel</a>
                                            </div>
                                        </div>
                                    </td>
                                </div>
                                </tr>
                                
                            </tbody>
                        </table>
                        
                    </form>

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