<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>티라미슈~~</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Shoppy Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript">
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 
</script>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css"
	media="all">
<!-- Custom Theme files -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!--js-->
<script src="js/jquery-2.1.1.min.js"></script>
<!--icons-css-->
<link href="css/font-awesome.css" rel="stylesheet">
<!--Google Fonts-->
<link href='//fonts.googleapis.com/css?family=Carrois+Gothic'
	rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Work+Sans:400,500,600'
	rel='stylesheet' type='text/css'>
<link href='css/search.css' rel='stylesheet' type='text/css'>
<!--static chart-->
<script src="js/Chart.min.js"></script>
<!--//charts-->
<!-- geo chart -->
<script src="//cdn.jsdelivr.net/modernizr/2.8.3/modernizr.min.js"
	type="text/javascript"></script>
<script>
	window.modernizr
			|| document
					.write('<script src="lib/modernizr/modernizr-custom.js"><\/script>')
</script>
<!--<script src="lib/html5shiv/html5shiv.js"></script>-->
<!-- Chartinator  -->
<script src="js/chartinator.js"></script>
<script type="text/javascript">
<%
	boolean isLogin = (session != null 
		&& session.getAttribute("memberId") != null ?true:false);
		System.out.println("Debug index.jsp : "+session.getAttribute("memberId"));
	if(isLogin){%>
		$(document).ready(function(){
			   $("#header-frame").load("header-login-frame.html");
		});
	<%}
	else{%>
		$(document).ready(function(){
			   $("#header-frame").load("header-logout-frame.html");
		});
	<%}
%>
	
	$(document).ready(function(){
		   $("#left-frame").load("left-frame.html");
	});
</script>
<!--geo chart-->

<!--skycons-icons-->
<script src="js/skycons.js"></script>
<!--//skycons-icons-->
</head>
<body>
	<div class="page-container">
		<div class="left-content">
			<div class="mother-grid-inner">
			<div id="header-frame"></div>
			<!-- <div id="header-login-frame"></div> -->
				<!-- script-for sticky-nav -->
				<script>
					$(document).ready(function() {
						var navoffeset = $(".header-main").offset().top;
						$(window).scroll(function() {
							var scrollpos = $(window).scrollTop();
							if (scrollpos >= navoffeset) {
								$(".header-main").addClass("fixed");
							} else {
								$(".header-main").removeClass("fixed");
							}
						});

					});
				</script>
				<!-- /script-for sticky-nav -->
				<!--inner block start here-->
				<div style="width: 100%; height: 500px; position:relative;">
					<section id="wrapper" style="align:center; margin: 350px;">
						<div id="main_search" >
							<form>
								<input type="text" id="search_space"> <input
									type="submit" class="solid" value="Search">
							</form>
						</div>
						<!--main-->
					</section>
					<!--wrapper-->
				</div>
				<!--inner block end here-->
				<!--copy rights start here-->
				<div class="copyrights">
					<p>© 2017 Tiramisu. | 부산대학교 자연대연구실험동 301호</p>
					<p>
						<b>김태정 변다영 이성민 이형건 </b>
					</p>
				</div>
				<!--COPY rights end here-->
			</div>
		</div>
		<div id="left-frame"></div>
		<div class="clearfix"></div>
	</div>

	<!--scrolling js-->
	<script src="js/jquery.nicescroll.js"></script>
	<script src="js/scripts.js"></script>
	<!--//scrolling js-->
	<script src="js/bootstrap.js">
		
	</script>
	<!-- mother grid end here-->
</body>
</html>

