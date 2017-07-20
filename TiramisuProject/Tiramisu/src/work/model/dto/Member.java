package work.model.dto;

/**
 * ȸ�� ���̵� : ���� �̸��� + �����̸Ӹ� �н����� : ������ + ���� (8�� �̻� ~ 20�� ����) ���� : ������ ���ڿ� (���߿�
 * ����) �亯 : 1(3����Ʈ)�� �̻� 20�� ����+ �г��� : 1(3����Ʈ)�� �̻� 20�� ���� + ����ũ ������ : ���� �����̼��� ID
 * ���۷��� + null���
 * 
 * @author cse
 *
 */
public class Member {
	private String memberId;
	
	private String memberPw;
	
	private String question;
	
	private String answer;
	
	private String nickname;
	
	private Integer image;

	/**
	 * Member �⺻������
	 */
	public Member() {
		super();
	}
	
	/**
	 * Member �ʼ�������(not null) ������
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
	 * Member ��絥���� ������
	 * @param memberId
	 * @param memberPw
	 * @param question
	 * @param answer
	 * @param nickname
	 * @param image
	 */
	public Member(String memberId, String memberPw, String question, String answer, String nickname, Integer image) {
		super();
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.question = question;
		this.answer = answer;
		this.nickname = nickname;
		this.image = image;
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
	public Integer getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(Integer image) {
		this.image = image;
	}
	
	
	/* (non-Javadoc)
	 * Pw, answer ���� �亯�� �ϴ� ���̰� �ϰ� ���ֿ� ���� ���� or ���ܿ��� ����
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
		builder.append(image);
		return builder.toString();
	}
	

}