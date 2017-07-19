<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<link
	href="http://netdna.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css"
	rel="stylesheet">
<link href="css/chatting.css" rel="stylesheet">
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css"
	rel="stylesheet">


<div class="container bootstrap snippet">
	<div class="row">

		<!--=========================================================-->
		<!-- selected chat -->
		<div class="col-md-8 bg-white ">
			<div class="chat-message">
				<ul class="chat">
					<jsp:include page="/chatting-left-clearfix.jsp" flush="false">
						<jsp:param name="chatNickname" value="이형건"></jsp:param>
						<jsp:param name="chatTime" value="2017-07-18 AM 05:45"></jsp:param>
						<jsp:param name="chatContent" value="오늘 11시까지인데 밥언제 먹나요...:("></jsp:param>
					</jsp:include>
					<jsp:include page="/chatting-right-clearfix.jsp" flush="false">
						<jsp:param name="chatNickname" value="변다영"></jsp:param>
						<jsp:param name="chatTime" value="2017-07-18 AM 05:46"></jsp:param>
						<jsp:param name="chatContent" value="지금 당장 먹어도 시원찮습니다"></jsp:param>
					</jsp:include>
					<li class="left clearfix"><span class="chat-img pull-left">
							<img src="images/tirami.PNG" alt="User Avatar">
					</span>
						<div class="chat-body clearfix">
							<div class="header">
								<strong class="primary-font">이성민</strong> <small
									class="pull-right text-muted"><i class="fa fa-clock-o"></i>
									2017-07-18 AM 05:47</small>
							</div>
							<p>나도 머글랭</p>
						</div></li>
					<li class="right clearfix"><span class="chat-img pull-right">
							<img src="images/me.jpg" alt="User Avatar">
					</span>
						<div class="chat-body clearfix">
							<div class="header">
								<strong class="primary-font">변다영</strong> <small
									class="pull-right text-muted"><i class="fa fa-clock-o"></i>
									2017-07-18 AM 05:49</small>
							</div>
							<p>오빠도 먹죠</p>
						</div></li>
					<li class="left clearfix"><span class="chat-img pull-left">
							<img src="images/tirami.PNG" alt="User Avatar">
					</span>
						<div class="chat-body clearfix">
							<div class="header">
								<strong class="primary-font">김태정</strong> <small
									class="pull-right text-muted"><i class="fa fa-clock-o"></i>
									2017-07-18 AM 05:50</small>
							</div>
							<p>나는 아무거나 괜찮아요.</p>
						</div></li>
					<li class="right clearfix"><span class="chat-img pull-right">
							<img src="images/me.jpg" alt="User Avatar">
					</span>
						<div class="chat-body clearfix">
							<div class="header">
								<strong class="primary-font">변다영</strong> <small
									class="pull-right text-muted"><i class="fa fa-clock-o"></i>
									2017-07-18 AM 05:50</small>
							</div>
							<p>그 놈의 아무거나</p>
						</div></li>
					<li class="right clearfix"><span class="chat-img pull-right">
							<img src="images/me.jpg" alt="User Avatar">
					</span>
						<div class="chat-body clearfix">
							<div class="header">
								<strong class="primary-font">변다영</strong> <small
									class="pull-right text-muted"><i class="fa fa-clock-o"></i>
									2017-07-18 AM 05:51</small>
							</div>
							<p>아악!</p>
						</div></li>
				</ul>
			</div>
			<div class="chat-box bg-white">
				<div class="input-group">
					<input class="form-control border no-shadow no-rounded"
						placeholder="Type your message here"> <span
						class="input-group-btn">
						<button class="btn btn-success no-rounded" type="button">Send</button>
					</span>
				</div>
				<!-- /input-group -->
			</div>
		</div>

		<!--오른쪽 면 -->
		<div class="col-md-4 bg-white ">
			<div class=" row border-bottom padding-sm" style="height: 60px;">
			</div>

			<!-- =============================================================== -->
			<!-- member list -->
			<ul class="friend-list">
				<li class="active bounceInDown"><a href="#" class="clearfix">
						<img src="https://bootdey.com/img/Content/user_1.jpg" alt=""
						class="img-circle">
						<div class="friend-name">
							<strong>John Doe</strong>
						</div>
						<div class="last-message text-muted">Hello, Are you there?</div> <small
						class="time text-muted">Just now</small> <small
						class="chat-alert label label-danger">1</small>
				</a></li>
				<li><a href="#" class="clearfix"> <img
						src="https://bootdey.com/img/Content/user_2.jpg" alt=""
						class="img-circle">
						<div class="friend-name">
							<strong>Jane Doe</strong>
						</div>
						<div class="last-message text-muted">Lorem ipsum dolor sit
							amet.</div> <small class="time text-muted">5 mins ago</small> <small
						class="chat-alert text-muted"><i class="fa fa-check"></i></small>
				</a></li>
				<li><a href="#" class="clearfix"> <img
						src="https://bootdey.com/img/Content/user_3.jpg" alt=""
						class="img-circle">
						<div class="friend-name">
							<strong>Kate</strong>
						</div>
						<div class="last-message text-muted">Lorem ipsum dolor sit
							amet.</div> <small class="time text-muted">Yesterday</small> <small
						class="chat-alert text-muted"><i class="fa fa-reply"></i></small>
				</a></li>
				<li><a href="#" class="clearfix"> <img
						src="https://bootdey.com/img/Content/user_1.jpg" alt=""
						class="img-circle">
						<div class="friend-name">
							<strong>Kate</strong>
						</div>
						<div class="last-message text-muted">Lorem ipsum dolor sit
							amet.</div> <small class="time text-muted">Yesterday</small> <small
						class="chat-alert text-muted"><i class="fa fa-reply"></i></small>
				</a></li>
				<li><a href="#" class="clearfix"> <img
						src="https://bootdey.com/img/Content/user_2.jpg" alt=""
						class="img-circle">
						<div class="friend-name">
							<strong>Kate</strong>
						</div>
						<div class="last-message text-muted">Lorem ipsum dolor sit
							amet.</div> <small class="time text-muted">Yesterday</small> <small
						class="chat-alert text-muted"><i class="fa fa-reply"></i></small>
				</a></li>
				<li><a href="#" class="clearfix"> <img
						src="https://bootdey.com/img/Content/user_6.jpg" alt=""
						class="img-circle">
						<div class="friend-name">
							<strong>Kate</strong>
						</div>
						<div class="last-message text-muted">Lorem ipsum dolor sit
							amet.</div> <small class="time text-muted">Yesterday</small> <small
						class="chat-alert text-muted"><i class="fa fa-reply"></i></small>
				</a></li>
				<li><a href="#" class="clearfix"> <img
						src="https://bootdey.com/img/Content/user_5.jpg" alt=""
						class="img-circle">
						<div class="friend-name">
							<strong>Kate</strong>
						</div>
						<div class="last-message text-muted">Lorem ipsum dolor sit
							amet.</div> <small class="time text-muted">Yesterday</small> <small
						class="chat-alert text-muted"><i class="fa fa-reply"></i></small>
				</a></li>
				<li><a href="#" class="clearfix"> <img
						src="https://bootdey.com/img/Content/user_2.jpg" alt=""
						class="img-circle">
						<div class="friend-name">
							<strong>Jane Doe</strong>
						</div>
						<div class="last-message text-muted">Lorem ipsum dolor sit
							amet.</div> <small class="time text-muted">5 mins ago</small> <small
						class="chat-alert text-muted"><i class="fa fa-check"></i></small>
				</a></li>
			</ul>
		</div>

	</div>
</div>

<%
	//This scritp was occured error.
%>
<!--  <script src="http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>-->
<script type="text/javascript">
	
</script>