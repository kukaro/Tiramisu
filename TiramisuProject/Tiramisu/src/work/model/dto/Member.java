package work.model.dto;

/**
 * 회원
 * 아이디 : 형식 이메일 + 프라이머리
 * 패스워드 : 영문자 + 숫자 (8자 이상 ~ 20자 이하)
 * 질문 : 정해진 문자열 (나중에 조사)
 * 답변 : 1(3바이트)자 이상 20자 이하+
 * 닉네임 : 1(3바이트)자 이상 20자 이하 + 유니크
 * 사진명 : 사진 릴레이션의 ID 레퍼런스 + null허용
 * @author cse
 *
 */
public class Member {
	private String memberId;
	
	private String memberPw;
	
	private String question;
	
	private String answer;
	
	private String nickname;
	
	private int imagePath;

	/**
	 * Member 기본생성자
	 */
	public Member() {
		super();
	}
	
	/**
	 * Member 필수데이터(not null) 생성자
	 * @param memberId
	 * @param memberPw
	 * @param question
	 * @param answer
	 * @param nickname
	 */
	public Member(String memberId, String memberPw, String question, String answer, String nickname) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.question = question;
		this.answer = answer;
		this.nickname = nickname;
	}

	/**
	 * Member 모든데이터 생성자
	 * @param memberId
	 * @param memberPw
	 * @param question
	 * @param answer
	 * @param nickname
	 * @param image
	 */
	public Member(String memberId, String memberPw, String question, String answer, String nickname, int imagePath) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.question = question;
		this.answer = answer;
		this.nickname = nickname;
		this.imagePath = imagePath;
	}

	/**
	 * @return the memberId
	 */
	public String getMemberId() {
		return memberId;
	}

	/**
	 * @param memberId the memberId to set
	 */
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	/**
	 * @return the memberPw
	 */
	public String getMemberPw() {
		return memberPw;
	}

	/**
	 * @param memberPw the memberPw to set
	 */
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

	/**
	 * @return the answer
	 */
	public String getAnswer() {
		return answer;
	}

	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}

	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * @return the image
	 */
	public int getImagePath() {
		return imagePath;
	}

	/**
	 * @param image the image to set
	 */
	public void setImagePath(int imagePath) {
		this.imagePath = imagePath;
	}

	/* (non-Javadoc)
	 * Pw, answer 에서 답변이 일단 보이게 하고 나주에 차후 수정 or 윗단에서 수정
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(memberId);
		builder.append(", ");
		builder.append(memberPw);
		builder.append(", ");
		builder.append(question);
		builder.append(", ");
		builder.append(answer);
		builder.append(", ");
		builder.append(nickname);
		builder.append(", ");
		builder.append(imagePath);
		return builder.toString();
	}
	
	
	
	
}
