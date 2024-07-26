import java.util.Scanner;

public class LapTop {
	/**
	 * 디스플레이 : 시각적 정보를 사용자에게 제공
	 */
	int display;
	
	/**
	 * 텍스트 입력 및 명령어 입력
	 */
	String keyboard;
	
	/**
	 * 마우스 대체 장치로 포인터 이동 및 클릭
	 */
	int touchpad;
	
	/**
	 * 외부장치 연결
	 */
	int usbPorts;
	
	/**
	 * 전력공급
	 */
	int battery;
	
	/**
	 * 무선 인터넷 연결
	 */
	int WiFiModule;
	
	/**
	 * 오디오 출력
	 */
	int speakers;
	/**
	 * 영상 촬영 및 비디오 통화
	 */
	int camera;
	
	/**
	 * 화면을 통해 텍스트, 이미지, 동영상 등 데이터를 시각적으로 확인
	 */
	public void disPlay() {
		
		if(display == 1)
			System.out.println("TV turnOn");
		else {
			System.out.println("TV turnOff");
		}
	}
	/**
	 * 사용자가 문서 작성, 명령 입력 등을 할 수 있도록 도와준다.
	 */
	public void keyBoard() {
		
		
		Scanner console = new Scanner(System.in);
		System.out.print("키보드 입력 : ");
		keyboard = console.nextLine();
		
		System.out.println("키보드 출력 : " + keyboard);
		
	}
	/**
	 * 사용자에게 마우스 없이도 포인터를 움직이고 클릭할 수 있도록 인터페이스 제공
	 */
	public void touchPad() {
		
		if(touchpad == 1) {
			System.out.println("왼쪽으로 움직인다.");
		}
		else if(touchpad == 2) {
			System.out.println("아래로 움직인다.");
		}
		else if(touchpad == 3) {
			System.out.println("오른쪽으로 움직인다.");
		}
		else if(touchpad == 4) {
			System.out.println("위로 움직인다. ");
		}
		
	}
	/**
	 * 키보드, 마우스, USB driver 등 다양한 외부 장치 연결 
	 */
	public void usbPorts() {
		
		if(usbPorts == 1) {
			System.out.println("키보드 연결");
		}
		else if(usbPorts == 2) {
			System.out.println("마우스 연결");
		}
	}
	
	/**
	 * 전원 공급이 없는 상태에서도 노트북을 일정 시간 동안 사용할 수 있도록 한다.
	 */
	public void battery() {
		
		if(battery < 101) {
			
			battery -- ;
			System.out.println("배터리 : " + battery);
			
		}else if(battery < 15) {
			
			battery ++ ;
			System.out.println("배터리 : " + battery);
			
		}
	
	}
	
	/**
	 * 사용자가 무선 네트워크를 통해 인터넷에 접속할 수 있도록 한다.
	 */
	public void wiFiModule() {
		
		if(WiFiModule == 1) {
			System.out.println("WiFi 연결");
		}else if(WiFiModule == 0) {
			System.out.println("WiFi 연걸 끊김");
		}
		
	}
	
	/**
	 * 음악, 비디오 등의 소리를 사용자에게 전달
	 */
	public void speakers() {
		
		if(speakers < 101 && speakers > 80) {
			
			System.out.println("소리가 너무 큽니다.");
			speakers --;
		}
		
	}
	
	/**
	 * 화상회의, 비디오 통화, 사진 촬영
	 */
	public void camera() {
		
		if(camera == 1) {
			System.out.println("화상 회의 중");
		}else if(camera == 2) {
			System.out.println("비디오 통화 중");
		}else if(camera == 3) {
			System.out.println("사진 촬영 중");
		}
		
		
	}
}
