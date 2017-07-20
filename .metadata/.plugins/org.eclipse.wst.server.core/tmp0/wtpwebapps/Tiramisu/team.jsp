<%@page import="java.util.ArrayList"%>
<%@page import="work.model.service.TeamService"%>
<%@ page language="java" contentType="text/html; charset=euc-kr"
	pageEncoding="euc-kr"%>
<meta charset="euc-kr">
<script>
function page_move(team,channel){
    var f=document.paging; //폼 name
    f.teamName.value = team; //POST방식으로 넘기고 싶은 값
    f.channelName.value = channel;//POST방식으로 넘기고 싶은 값
    f.action="index.jsp";//이동할 페이지
    f.method="post";//POST방식
    f.submit();
    console.log('enter');
}
</script>
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
<form name="paging">
      <input type="hidden" name="teamName"/>
      <input type="hidden" name="channelName"/>
</form>
<li><a href="#"><img src="images/plus_white.png"
		style="width: 15px; height: 15px;"><span style="font-size: 15px">
			<%=teamName%></span></a>
	<ul>
		<!-- <li><a href="#" id="General"><img src="images/chat.png"
				style="width: 19px; height: 19px;"> General chat</a></li> -->
		<%
			for (int i = 0; i < channelNameArray.size(); i++) {
		%>

		<li><a href="index.jsp?teamName=<%=teamName %>&channelName=<%=channelNameArray.get(i) %>" id="channelSelect"><img src="images/chat.png"
				style="width: 19px; height: 19px;"> <%=channelNameArray.get(i) %></a></li>
		<%
			}
		%>
		<li><a href="#"><img src="images/files.png"
				style="width: 17px; height: 17px;"> data file</a></li>
		<li><a href="#"><img src="images/chart.png"
				style="width: 17px; height: 17px;"> charts</a></li>
	</ul></li>