<%@page import="java.util.ArrayList"%>
<%@page import="work.model.service.TeamService"%>
<%@ page language="java" contentType="text/html; charset=euc-kr"
	pageEncoding="euc-kr"%>
<meta charset="euc-kr">
<%
	request.setCharacterEncoding("utf-8");
	String teamName = request.getParameter("teamName");
	TeamService service = TeamService.getInstance();
	ArrayList<String> channelNameArray = service.teamHasChannel(teamName);
	if (channelNameArray != null) {
		for (String str : channelNameArray) {
			System.out.println("team.jsp : " + str);
		}
	}
	System.out.println(channelNameArray.size());
%>
<li><a href="#"><img src="images/plus_white.png"
		style="width: 15px; height: 15px;"><span style="font-size: 15px">
			<%=teamName%></span></a>
	<ul>
		<li><a href="chatting.html"><img src="images/chat.png"
				style="width: 19px; height: 19px;"> General chat</a></li>
		<%
			for (int i = 0; i < channelNameArray.size(); i++) {
		%>
		<li><a href="chatting.html"><img src="images/chat.png"
				style="width: 19px; height: 19px;"> <%=channelNameArray.get(i) %></a></li>
		<%
			}
		%>
		<li><a href="#"><img src="images/files.png"
				style="width: 17px; height: 17px;"> data file</a></li>
		<li><a href="#"><img src="images/chart.png"
				style="width: 17px; height: 17px;"> charts</a></li>
	</ul></li>