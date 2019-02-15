<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">

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

<!--Start the main contaciner-->
<div class="container">
	<div class="row">
		<h2 class="text-center">ContactBook App</h2>
		<br>
	</div>
	<div class="row">
		<div class="col-xs-3 col-sm-3 col-md-3 col-lg-3"></div>
		<div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
			<form action="ContactController?action=login" method="POST" role="form">
				<legend>Login</legend>
				<!--Username-->			
				<div class="form-group">
					<input type="text" class="form-control" name="username" placeholder="Enter Username">
				</div>

				<!--Password-->			
				<div class="form-group">
					<input type="password" class="form-control" name="password" placeholder="Enter Password">
				</div>	
			
				<button type="submit" class="btn btn-primary">Login</button>
			</form>
		</div>
		<div class="col-xs-3 col-sm-3 col-md-3 col-lg-3"></div>
	</div>
</div>
<!--End the main container-->




<!-- Bootstrap core JavaScript
	================================================== -->
	<script src="bootstrap/js/jquery.min.js"></script>
	<script src="bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript">		
		$(document).on('click','.navbar-collapse.in',function(e) {
			if( $(e.target).is('a:not(".dropdown-toggle")') ) {
				$(this).collapse('hide');
			}
		});
	</script>
</body>
</html>
