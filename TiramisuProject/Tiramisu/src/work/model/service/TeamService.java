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
}