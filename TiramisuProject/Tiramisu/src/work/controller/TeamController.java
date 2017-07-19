package work.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import work.model.service.TeamService;

//import work.model.service.TeamService;

@WebServlet("/TeamController")
public class TeamController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TeamService service = TeamService.getInstance();
	// private TeamService service = TeamService.getInstance();
	@SuppressWarnings("unused")
	private static PrintWriter out;

	protected void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		System.out.println("Debug : Enter TeamController Process");
		switch (action) {
		case "makeTeam":
			makeTeam(request, response);
			break;
		case "setOpen":
			setOpen(request, response);
			break;
		default:
			break;
		}
	}

	
	protected void makeTeam(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String teamName = request.getParameter("teamTeamName");
		String subject = request.getParameter("teamSubject");
		Boolean open = service.stringMakeBoolean(request.getParameter("teamOpen"));

		HttpSession session = request.getSession(false);
		if (session != null && session.getAttribute("memberId") != null && session.getAttribute("isLogin") != null) {
			String nickname = (String) session.getAttribute("nickname");
			if (service.makeTeam(nickname, teamName, subject, open)) {
				((ArrayList<String>)session.getAttribute("teamArray")).add(teamName);
				RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
				dispatcher.forward(request, response);
			}
			System.out.println("Debug : make team success");
		} else {
			System.out.println("Debug : make team fail");
		}
	}
	
	protected void setOpen(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		Boolean open = service.stringMakeBoolean(request.getParameter("teamOpen"));
		if (session != null && session.getAttribute("memberId") != null && session.getAttribute("isLogin") != null){
			service.setOpen(open);
			System.out.println("Debug : make team's open success");
		}
		else{
			System.out.println("Debug : make team's open fail");
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

}