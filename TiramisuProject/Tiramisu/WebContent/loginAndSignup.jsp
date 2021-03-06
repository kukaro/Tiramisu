<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
	<%
		response.setCharacterEncoding("EUC-KR");
	%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Tiramisu Login &amp; Sign Up</title>
<!-- CSS -->
<link rel="stylesheet"
	href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
<link rel="stylesheet"
	href="loginSignup/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet"
	href="loginSignup/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" href="loginSignup/css/form-elements.css">
<link rel="stylesheet" href="loginSignup/css/style.css">
<!-- Favicon and touch icons -->
<link rel="shortcut icon" href="loginSignup/ico/favicon.png">
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="loginSignup/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="loginSignup/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="loginSignup/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="loginSignup/ico/apple-touch-icon-57-precomposed.png">
</head>
<body background="loginSignup/img/backgrounds/brown.png">
	<!-- Top content -->
	<div class="top-content">
		<div class="inner-bg">
			<div class="container">
				<div class="row">
					<div class="col-sm-8 col-sm-offset-2 text">
						<h1>
							<strong>Tiramisu</strong> Login &amp; Sign Up
						</h1>
						<div class="description">
							<p>
								티라미슈는 당신의 협업을 돕는 <strong>클라우드 메신저 </strong> 입니다.
							</p>
							<p>티라미슈를 통해 혁명적인 토론과 회의, 모임을 경험해보세요!</p>
						</div>
					</div>
				</div>
				<div class="row">
					<!-- 로그인 -->
					<div class="col-sm-5">
						<div class="form-box">
							<div class="form-top">
								<div class="form-top-left">
									<h3>Login</h3>
									<p>이메일과 비밀번호를 입력해주세요</p>
								</div>
								<div class="form-top-right">
									<i class="fa fa-lock"></i>
								</div>
							</div>
							<div class="form-bottom">
								<form role="form" action="MemberController?action=login"
									method="post" class="login-form">
									<div class="form-group">
										<input type="text" name="loginMemberId"
											placeholder="Your email..."
											class="form-username form-control" id="form-username">
									</div>
									<div class="form-group">
										<input type="password" name="loginMemberPw"
											placeholder="Password..." class="form-password form-control"
											id="form-password">
									</div>
									<button type="submit" class="btn">로그인!</button>
								</form>
							</div>
						</div>
						<div class="social-login">
							<h3>아이디나 비밀번호가 생각나지 않나요?</h3>
							<div class="social-login-buttons">
								<a class="btn btn-link-2" href="#">아이디 찾기</a> <a
									class="btn btn-link-2" href="#"> 비밀번호 찾기</a>
							</div>
						</div>
					</div>
					<div class="col-sm-1 middle-border"></div>
					<div class="col-sm-1"></div>
					<!-- 회원가입 -->
					<div class="col-sm-5">
						<div class="form-box">
							<div class="form-top">
								<div class="form-top-left">
									<h3>Sign up now</h3>
									<p>티라미슈와 함께 해주세요</p>
								</div>
								<div class="form-top-right">
									<i class="fa fa-pencil"></i>
								</div>
							</div>
							<div class="form-bottom">
								<form role="form" action="MemberController?action=signUp" method="post"
									class="registration-form">
									<div class="form-group">
										<input type="text" name="loginMemberId" placeholder="email..."
											class="form-first-name form-control" id="form-first-name">
									</div>
									<div class="form-group">
										<input type="password" name="loginMemberPw" placeholder="password..."
											class="form-last-name form-control" id="form-last-name">
									</div>
									<div class="form-group">
										<input type="password" name="loginMemberPwV" placeholder="password..."
											class="form-last-name form-control" id="form-last-name">
									</div>
									<div class="form-group">
										<input type="text" name="loginNickname" placeholder="nickname..."
											class="form-email form-control" id="form-email">
									</div>
									<div class="form-group">
										<select name="loginQuestion">
											<option value="default" selected>원하는 질문을 선택하세요</option>
											<option value="나의 좌우명은?">나의 좌우명은?</option>
											<option value="가장 기억에 남는 장소는?">가장 기억에 남는 장소는?</option>
											<option value="나의 보물 제1호는?">나의 보물 제1호는?</option>
											<option value="본인의 출생지는?">본인의 출생지는?</option>
											<option value="우리집 애완동물의 이름은?">우리집 애완동물의 이름은?</option>
											<option value="나의 노래방 애창곡은?">나의 노래방 애창곡은?</option>
											<option value="좋아하는 스포츠 팀 이름은?">좋아하는 스포츠 팀 이름은?</option>
											<option value="나의 출신 초등학교는?">나의 출신 초등학교는?</option>
											<option value="인상 깊게 읽은 책 이름은?">인상 깊게 읽은 책 이름은?</option>
											<option value="가장 생각나는 친구 이름은?">가장 생각나는 친구 이름은?</option>
										</select>
									</div>
									<div class="form-group">
										<input type="text" name="loginAnswer" placeholder="answer..."
											class="form-email form-control" id="form-email">
									</div>
									<button type="submit" class="btn">회원가입!</button>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Footer -->
	<footer>
		<div class="container">
			<div class="row">
				<div class="col-sm-8 col-sm-offset-2">
					<div class="footer-border"></div>
					<p>
						 2017 Tiramisu. | <a
							href="http://www.dbguide.net/academy.db?cmd=intro1"
							target="_blank"><strong>Bigdata Edu. Project</strong></a>
					</p>
					<p>
						<i class="fa fa-smile-o"></i> 김태정 변다영 이성민 이형건 <i
							class="fa fa-smile-o"></i>
					</p>
				</div>
			</div>
		</div>
	</footer>
	<!-- Javascript -->
	<script src="loginSignup/js/jquery-1.11.1.min.js"></script>
	<script src="loginSignup/bootstrap/js/bootstrap.min.js"></script>
	<script src="loginSignup/js/jquery.backstretch.min.js"></script>
	<script src="loginSignup/js/scripts.js"></script>
	
</body>
</html>