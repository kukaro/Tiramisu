package work.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import work.model.dto.*;

/**
 * MemberDao 
 * @author henry!
 *
 */
public class MemberDao {

	private FactoryDao factory = FactoryDao.getInstance();
	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	
	public Connection getConnection() {
		return factory.getConnection();
	}
	
	public int insert(Member dto) {
		String sql = "insert into MEMBER values(?,?,?,?,?,?)";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getMemberId());
			pstmt.setString(2, dto.getMemberPw());
			pstmt.setString(3, dto.getQuestion());
			pstmt.setString(4, dto.getAnswer());
			pstmt.setString(5, dto.getNickname());
			pstmt.setString(6, dto.getImage());
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Member Insert Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	
	public int delete(String memberId) {
		String sql = "delete MEMBER where member_id=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Member Delete Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return 0;
	}
	
	public Member selectOne(String memberId) {
		String sql = "select * from MEMBER where member_id=?";
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, memberId);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				memberId = rs.getString("member_id");
				String memberPw = rs.getString("member_pw");
				String question = rs.getString("question");
				String answer = rs.getString("answer");
				String nickname = rs.getString("nickname");
				String image = rs.getString("image");
				
				return new Member(memberId, memberPw, question, answer, nickname, image);	
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Member SelectOne Error: " + e.getMessage());
		} finally {
			factory.close(rs, pstmt, conn);
		}
		return null;
	}
	
	public ArrayList<Member> selectAll() {
		ArrayList<Member> list = new ArrayList<Member>();
		String sql = "select * from MEMBER";
		conn = getConnection();
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			Member dto = null;
			
			while(rs.next()) {
				String memberId = rs.getString("member_id");
				String memberPw = rs.getString("member_pw");
				String question = rs.getString("question");
				String answer = rs.getString("answer");
				String nickname = rs.getString("nickname");
				String image = rs.getString("image");
				
				dto = new Member(memberId, memberPw, question, answer, nickname, image);
				list.add(dto);	
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Debug(Member SelectAll() Error: " + e.getMessage());
		} finally {
			factory.close(rs, stmt, conn);
		}
		return list;
	}
	

}
