<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
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
								Ƽ��̽��� ����� ������ ���� <strong>Ŭ���� �޽��� </strong> �Դϴ�.
							</p>
							<p>Ƽ��̽��� ���� �������� ��а� ȸ��, ������ �����غ�����!</p>
						</div>
					</div>
				</div>
				<div class="row">
					<!-- �α��� -->
					<div class="col-sm-5">
						<div class="form-box">
							<div class="form-top">
								<div class="form-top-left">
									<h3>Login</h3>
									<p>�̸��ϰ� ��й�ȣ�� �Է����ּ���</p>
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
									<button type="submit" class="btn">�α���!</button>
								</form>
							</div>
						</div>
						<div class="social-login">
							<h3>���̵� ��й�ȣ�� �������� �ʳ���?</h3>
							<div class="social-login-buttons">
								<a class="btn btn-link-2" href="#">���̵� ã��</a> <a
									class="btn btn-link-2" href="#"> ��й�ȣ ã��</a>
							</div>
						</div>
					</div>
					<div class="col-sm-1 middle-border"></div>
					<div class="col-sm-1"></div>
					<!-- ȸ������ -->
					<div class="col-sm-5">
						<div class="form-box">
							<div class="form-top">
								<div class="form-top-left">
									<h3>Sign up now</h3>
									<p>Ƽ��̽��� �Բ� ���ּ���</p>
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
											<option value="default" selected>���ϴ� ������ �����ϼ���</option>
											<option value="���� �¿����?">���� �¿����?</option>
											<option value="���� ��￡ ���� ��Ҵ�?">���� ��￡ ���� ��Ҵ�?</option>
											<option value="���� ���� ��1ȣ��?">���� ���� ��1ȣ��?</option>
											<option value="������ �������?">������ �������?</option>
											<option value="�츮�� �ֿϵ����� �̸���?">�츮�� �ֿϵ����� �̸���?</option>
											<option value="���� �뷡�� ��â����?">���� �뷡�� ��â����?</option>
											<option value="�����ϴ� ������ �� �̸���?">�����ϴ� ������ �� �̸���?</option>
											<option value="���� ��� �ʵ��б���?">���� ��� �ʵ��б���?</option>
											<option value="�λ� ���� ���� å �̸���?">�λ� ���� ���� å �̸���?</option>
											<option value="���� �������� ģ�� �̸���?">���� �������� ģ�� �̸���?</option>
										</select>
									</div>
									<div class="form-group">
										<input type="text" name="loginAnswer" placeholder="answer..."
											class="form-email form-control" id="form-email">
									</div>
									<button type="submit" class="btn">ȸ������!</button>
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
						<i class="fa fa-smile-o"></i> ������ ���ٿ� �̼��� ������ <i
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