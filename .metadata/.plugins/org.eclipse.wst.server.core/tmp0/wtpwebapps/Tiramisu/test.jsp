<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "work.model.dto.*" %>
<%@ page import = "work.model.dao.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<%
	BiasDao biasDao = new BiasDao();
	ChannelDao channelDao = new ChannelDao();
	DialogDao dialogDao = new DialogDao();
	FilesDao filesDao = new FilesDao();
	ImageDao imageDao = new ImageDao();
	LikesDao likesDao = new LikesDao();
	MemberDao memberDao = new MemberDao();
	MessageDao messageDao = new MessageDao();
	NotificationDao notificationDao = new NotificationDao();
	OpinionDao opinionDao = new OpinionDao();
	TeamDao teamDao = new TeamDao();
	TeamMemberDao teamMemberDao = new TeamMemberDao();
	VoteDao voteDao = new VoteDao();
%>	


<%
	out.println("SelctONe : ");
	Member dto = memberDao.selectOne("user02");
	out.println(dto);
%><br><br>
<% 
	out.println("selectAll : ");
	ArrayList<Member> members = memberDao.selectAll();
	
	for ( int i = 0 ; i < members.size() ; i ++) {
		out.println(members.get(i)+"\n");
	}
%><br><br>



</body>
</html>