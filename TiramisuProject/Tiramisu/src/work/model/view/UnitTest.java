package work.model.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

public class UnitTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UnitTest() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("euc-kr");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		Context context;
		try {
			String sql = "select * from member";
			context = new InitialContext();
			DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/Oracle");
			Connection conn = ds.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			PrintWriter out = response.getWriter();
			while (rs.next()) {
				String memberId = rs.getString("member_id");
				String memberPw = rs.getString("member_pw");
				String question = rs.getString("question");
				String answer = rs.getString("answer");
				String nickname = rs.getString("nickname");
				out.println(memberId + ":" + memberPw + ":" + question + ":" + nickname);
			}

		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
