
public class Phone {
	/**
	 * 이름
	 */
	String name;
	/**
	 * 별칭
	 */
	String nickname;
	
	/**
	 * 휴대번호
	 */
	String phoneNumber;
	/**
	 * 이메일
	 */
	String email;
	
	/**
	 * 그룹
	 */
	String group;
	
	/**
	 * 주소
	 */
	String address;
	
	
	/**
	 * 통화 버튼
	 */
	
	int callButton; // 1을 입력할 경우, 통화
	int messageButton; // 1을 입력할 경우, 메세지 전송
	int videoCallButton; // 1을 입력할 경우, 영상통화
	int settings; // 1을 입력할 경우 설정창으로 이동
	
	public void callButton() {
		
		if(callButton == 1) {
			System.out.println("통화");
		}
		
	}
	
	/**
	 * 메세지 버튼
	 */
	
	public void messageButton(){
		
		if(messageButton == 1) {
			System.out.println("메세지 전송");
		}
	}
	
	/**
	 * 영상통화 버튼
	 */
	
	public void videoCallButton() {
		if(videoCallButton == 1) {
			System.out.println("영상통화");
		}
		
	}
	/**
	 * 환경설정버튼
	 */
	public void settings() {
		if(settings == 1) {
			System.out.println("설정창으로 이동");
		}
		
	}
}
