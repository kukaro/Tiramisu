package work.model.service;

public class TeamService {
	public static TeamService instance = new TeamService();

	private TeamService() {

	}

	public static TeamService getInstance() {
		return instance;
	}

	public Boolean stringMakeBoolean(String bool) {
		if (bool.equalsIgnoreCase("TRUE")) {
			return true;
		} else if (bool.equalsIgnoreCase("FALSE")) {
			return false;
		}
		return null;
	}

	// 이미 팀 이름이 있는지 유효성 검사해야함.
	public boolean makeTeam(String nickname, String teamName, String subject, Boolean open) {
		return true;
	}

	public boolean setOpen(Boolean open) {
		return true;
	}

	//작성자가 수신자에게 메시지를 보냄
	public void makeMessage(String writer, String receiver, String content) {
		
		
	}

	//사용자한테 닉네임, 경향명, 내용을 받아서 만들면됩니다.
	public boolean makeOpinion(String nickname, String voteName, String biasName, String content) {
		return true;
	}

	//사용자에게 닉네임과 경향명,투표명,팀명을 받아서 의견을 삭제합니다.
	public boolean deleteOpinion(String nickname, String biasName, String voteName, String reamName) {
		return true;
	}

	/**
	 * <pre>	
	 * 사용자에게서 작성자와 작성일을 받아서 다이얼로그의 id를 특정화 시킨 후 그걸 바탕으로 좋아요를 찾아내서 그 좋아요가 만약 만들어져있지 않다면
	 * 좋아요를 새로만들고 있다면 없애버린다. 없애면 false를 반환하고 생성시켰다면 true를 반환한다.
	 * </pre>
	 * @param writer
	 * @param writeDate
	 * @param liker
	 */
	public boolean likesOpinion(String writer, String writeDate, String liker) {
		return true;
	}

	/**
	 * <pre>
	 * 사용자에게 경향명,투표명,팀명을 받아서 경향하나를 특정화시켜서 경향 ID를 받고 이 값과 닉네임을 이용해서 의견을 특정화시킨다.
	 * 그렇게 특정화 시켜서 내용을 수정함.
	 * </pre>
	 * @param nickname
	 * @param biasName
	 * @param voteName
	 * @param teamName
	 * @param content
	 */
	public boolean editOpinion(String nickname, String biasName, String voteName, String teamName, String content) {
		return true;
	}

	/**
	 * <pre>
	 * 사용자에게 id와 team이름을 받아서 사용자가 team에서 탈퇴함.
	 * </pre>
	 * @param memberId
	 * @param teamName
	 * @return
	 */
	public boolean dropTeam(String memberId, String teamName) {
		return true;
	}
}