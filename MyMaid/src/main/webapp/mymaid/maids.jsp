<%-- 
    Document   : maids
    Created on : Nov 28, 2018, 1:08:24 PM
    Author     : chiraran
    --%>

    <%@page contentType="text/html" pageEncoding="UTF-8"%>
    <%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


    <html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>MyMaid: Home</title>
        <link href="./css/bootstrap.min.css" rel="stylesheet">
        <link href="./css/custom.css" rel="stylesheet">


    </head>
    <body>

        <!-- Navigation--->
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">MyMaid</a>
                </div>
                <div id="navbar" class="collapse navbar-collapse pull-right">
                    <ul class="nav navbar-nav">
                        <li ><a href="./index.html">Home</a></li>
                        <li class="active"><a href="maids">Maids</a></li>
                        <li><a href="mymaid/login.html">Login</a></li>
                        <li><a href="about.html">About</a></li>
                        <li><a href="contact.html">Contact</a></li>
                    </ul>
                </div><!--/.nav-collapse -->
            </div>
        </nav><!--END NAVIGATION-->

        <br>
        <br>
        <br>
        <div class="container">
            <div class="row">
                <div class="col-xs-2  col-sm-2  col-md-2 col-lg-2 "></div>
                <div class="col-xs-8 col-sm-8 col-md-8 col-lg-8">

                    <table class="table table-hover table-bordered table-responsive">
                        <c:forEach items="${maids}" var="maids">
                        <tr>
                            <td>
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        Name of Miad: ${maids.name}
                                    </div>
                                    <div class="panel-body">
                                        <div class="row">
                                            <div class="col-xs-4  col-sm-4  col-md-4 col-lg-4 ">
                                                <a href="#" class="thumbnial">
                                                    <img src="./img/3.jpg" class="img-responsive" height="185">
                                                </a>
                                            </div>
                                            <div class="col-xs-8  col-sm-8  col-md-8 col-lg-8 "></div>
                                        </div>
                                    </div>                                    
                                </div>
                            </td>
                        </tr>
                    </c:forEach>                        
                </table>
            </div>
            <div class="col-xs-2  col-sm-2  col-md-2  col-lg-2 "></div>
        </div>
    </div>


    <footer class="footer">
        <div class="container">
            <h4>Footer</h4>
        </div>
    </footer>

    <!--Include files-->
    <script src="./js/jquery.min.js"></script>
    <script src="./js/bootstrap.min.js"></script>
    <script type="text/javascript">
        $(document).on('click', '.navbar-collapse.in', function (e) {
            if ($(e.target).is('a:not(".dropdown-toggle")')) {
                $(this).collapse('hide');
            }
        });
    </script>
</body>
</html>
