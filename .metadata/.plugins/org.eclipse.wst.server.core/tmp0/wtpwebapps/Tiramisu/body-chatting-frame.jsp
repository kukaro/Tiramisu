<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>

<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="text/javascript">
Date.prototype.format = function(f) {
    if (!this.valueOf()) return " ";
 
    var weekName = ["일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"];
    var d = this;
     
    return f.replace(/(yyyy|yy|MM|dd|E|hh|mm|ss|a\/p)/gi, function($1) {
        switch ($1) {
            case "yyyy": return d.getFullYear();
            case "yy": return (d.getFullYear() % 1000).zf(2);
            case "MM": return (d.getMonth() + 1).zf(2);
            case "dd": return d.getDate().zf(2);
            case "E": return weekName[d.getDay()];
            case "HH": return d.getHours().zf(2);
            case "hh": return ((h = d.getHours() % 12) ? h : 12).zf(2);
            case "mm": return d.getMinutes().zf(2);
            case "ss": return d.getSeconds().zf(2);
            case "a/p": return d.getHours() < 12 ? "AM" : "PM";
            default: return $1;
        }
    });
};
 
String.prototype.string = function(len){var s = '', i = 0; while (i++ < len) { s += this; } return s;};
String.prototype.zf = function(len){return "0".string(len - this.length) + this;};
Number.prototype.zf = function(len){return this.toString().zf(len);};

	var textarea = document.getElementById("chat");
	var webSocket = new WebSocket('ws://localhost:8070/Tiramisu/broadcasting');
	var inputMessage = document.getElementById('dialogInput');
	var nickname = null;
	var time = null;
	var content = null;
	webSocket.onerror = function(event) {
		onError(event)
	};
	webSocket.onopen = function(event) {
		onOpen(event)
	};
	webSocket.onmessage = function(event) {
		onMessage(event)
	};
	function onMessage(event) {
		var recMessage = event.data;
		console.log(recMessage);
		recMessage = recMessage.split('`');
		console.log(recMessage[0]);
		console.log(recMessage[1]);
		console.log(recMessage[2]);
		console.log(recMessage[3]);
		console.log(recMessage[4]);
		textarea.innerHTML += '<li class="left clearfix"><span class="chat-img pull-left">\
			<img src="images/tirami.PNG" alt="User Avatar">\
		</span>\
			<div class="chat-body clearfix">\
				<div class="header">\
					<strong class="primary-font">'+ recMessage[2] +'</strong> <small\
						class="pull-right text-muted"><i class="fa fa-clock-o"></i> '+ recMessage[3] +'</small>\
				</div>\
				<p>'+ recMessage[4] +'</p>\
			</div></li>';
		//textarea.value += "상대 : " + event.data + "\n";
	}
	function onOpen(event) {
		console.log("연결 성공\n");
	}
	function onError(event) {
		alert(event.data);
	}
	function send() {
		teamName = "<%=session.getAttribute("teamName")%>";
		channelName = "<%=session.getAttribute("channelName")%>";
		content = document.getElementById("dialogInput").value;
		time = new Date().format("yyyy-MM-dd a/p hh:mm:ss");
		nickname = "<%=session.getAttribute("nickname")%>";
		textarea.innerHTML += '<li class="right clearfix"><span class="chat-img pull-right">\
			<img src="images/me.jpg" alt="User Avatar">\
		</span>\
			<div class="chat-body clearfix">\
				<div class="header">\
					<strong class="primary-font">'+ nickname +'</strong> <small\
						class="pull-right text-muted"><i class="fa fa-clock-o"></i> '+ time +'</small>\
				</div>\
				<p>'+ content +'</p>\
			</div></li>';
		sendMessage = teamName+"`"+channelName+"`"+nickname+"`"+time+"`"+content;
		console.log(sendMessage);
		webSocket.send(sendMessage);
		inputMessage.value = "";
	}
	/*Debug function*/
	function dialogSubmit(){
		content = document.getElementById("dialogInput").value;
		time = new Date();
		nickname = "<%=session.getAttribute("nickname")%>";
		/*document.writeln(content);
		document.writeln(time);
		document.writeln(nickname);*/
	}
</script>
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
			<div style="overflow-y: scroll; height: 700px;">
				<div class="chat-message">
					<ul class="chat" id="chat">
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
			</div>
			<div class="chat-box bg-white">
				<div class="input-group">
					<input class="form-control border no-shadow no-rounded"
						placeholder="Type your message here" id="dialogInput"> <span
						class="input-group-btn">
						<button class="btn btn-success no-rounded" type="button"
							onclick="send()">Send</button>
					</span>
				</div>
				<!-- /input-group -->
			</div>

		</div>
		<!--오른쪽 면 -->
		<div class="col-md-4 bg-white ">
			<div style="overflow-y: scroll; height: 700px;">
				<div class="chat-message">
					<ul class="chat">
						<li class="left clearfix"><span class="chat-img pull-left">
								<img src="images/tirami.PNG">
						</span> <b class="primary-font" style="font-size: 20px; color: #53270E">&nbsp;&nbsp;변다영님의
								과거 대화</b></li>
						<br>

						<li class="left clearfix">
							<div class="chat-body clearfix" style="margin-left: 0px">
								<div class="header">
									<strong class="primary-font">변다영</strong> <small
										class="pull-right text-muted"><i class="fa fa-clock-o"></i>
										2017-07-18 AM 05:50</small>
								</div>
								<p>보쌈은 동맥경화증, 고혈압 등의 성인병을 막는 효능을 하기 때문에 저는 회식을 갈비로 하는 것에
									반대합니다</p>
							</div>
						</li>
						<li class="left clearfix">
							<div class="chat-body clearfix" style="margin-left: 0px">
								<div class="header">
									<strong class="primary-font">변다영</strong> <small
										class="pull-right text-muted"><i class="fa fa-clock-o"></i>
										2017-07-18 AM 05:50</small>
								</div>
								<p>맥북은 에어보다 프로죠.</p>
							</div>
						</li>
						<li class="left clearfix">
							<div class="chat-body clearfix" style="margin-left: 0px">
								<div class="header">
									<strong class="primary-font">변다영</strong> <small
										class="pull-right text-muted"><i class="fa fa-clock-o"></i>
										2017-07-18 AM 05:50</small>
								</div>
								<p>저희 스터디 어떻게 할까요?</p>
							</div>
						</li>
						<li class="left clearfix">
							<div class="chat-body clearfix" style="margin-left: 0px">
								<div class="header">
									<strong class="primary-font">변다영</strong> <small
										class="pull-right text-muted"><i class="fa fa-clock-o"></i>
										2017-07-18 AM 05:50</small>
								</div>
								<p>오늘 점심은 KFC입니다. KFC 할아버지가 세상에서 제일 좋아</p>
							</div>
						</li>
						<li class="left clearfix">
							<div class="chat-body clearfix" style="margin-left: 0px">
								<div class="header">
									<strong class="primary-font">변다영</strong> <small
										class="pull-right text-muted"><i class="fa fa-clock-o"></i>
										2017-07-18 AM 05:50</small>
								</div>
								<p>web.xml도 안보고 삽질을 하다니! 나는 바보다!</p>
							</div>
						</li>
						<li class="left clearfix">
							<div class="chat-body clearfix" style="margin-left: 0px">
								<div class="header">
									<strong class="primary-font">변다영</strong> <small
										class="pull-right text-muted"><i class="fa fa-clock-o"></i>
										2017-07-18 AM 05:50</small>
								</div>
								<p>배고프다</p>
							</div>
						</li>
						<li class="left clearfix">
							<div class="chat-body clearfix" style="margin-left: 0px">
								<div class="header">
									<strong class="primary-font">변다영</strong> <small
										class="pull-right text-muted"><i class="fa fa-clock-o"></i>
										2017-07-18 AM 05:50</small>
								</div>
								<p>스크롤바 성공</p>
							</div>
						</li>
						<li class="left clearfix">
							<div class="chat-body clearfix" style="margin-left: 0px">
								<div class="header">
									<strong class="primary-font">변다영</strong> <small
										class="pull-right text-muted"><i class="fa fa-clock-o"></i>
										2017-07-18 AM 05:50</small>
								</div>
								<p>초코칩 쿠키 굳</p>
							</div>
						</li>

					</ul>
				</div>
			</div>
		</div>

	</div>
</div>

<%
	//This scritp was occured error.
%>
<!--  <script src="http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>-->
<script type="text/javascript">
	
</script>