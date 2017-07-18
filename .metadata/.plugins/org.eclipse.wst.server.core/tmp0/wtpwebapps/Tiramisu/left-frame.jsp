<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<div class="sidebar-menu">
	<div class="menu">
		<ul id="menu">
			<li id="menu-home"><a href="index.jsp"><img alt="Logo" src="images/Tiramisu.png" style="width: 75px; height: 75px;"><p style="font-size:20px">TIRAMISU</p></a></li>
			<br>
			<jsp:include page="/team.jsp" flush="false">
                       <jsp:param name="teamName" value="WebProject"></jsp:param>
               </jsp:include>
			<li><a href="#"><img src="images/plus_white.png" style="width: 15px; height: 15px;"><span style="font-size:15px"> 공공데이터 공모전</span></a>
				<ul>
					<li><a href="chatting.html"><img src="images/chat.png" style="width: 19px; height: 19px;"> General chat</a></li>
					<li><a href="#"><img src="images/files.png" style="width: 17px; height: 17px;"> data file</a></li>
					<li><a href="#"><img src="images/chart.png" style="width: 17px; height: 17px;"> charts</a></li>
				</ul></li>
			<li><a href="#"><img src="images/plus_white.png" style="width: 15px; height: 15px;"><span style="font-size:15px"> 보쌈부서</span></a>
				<ul>
					<li><a href="chatting.html"><img src="images/chat.png" style="width: 19px; height: 19px;"> General chat</a></li>
					<li><a href="#"><img src="images/files.png" style="width: 17px; height: 17px;"> data file</a></li>
					<li><a href="#"><img src="images/chart.png" style="width: 17px; height: 17px;"> charts</a></li>
				</ul></li>
			<li style="padding: 350px 0px 0px 0px;"><a href="#"><i class="fa fa-cogs"></i><span style="font-size:15px">Setting</span></a></li>
		</ul>
	</div>
</div>