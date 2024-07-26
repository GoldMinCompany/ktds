
public class LapTopExam {

	public static void main(String[] args) {
	
	LapTop samsung = new LapTop();
	
	samsung.display = 1; //display 값이 1이면 Turn On, 0이면 Turn Off
	
	samsung.touchpad = 2;// touchpad 값이 2이면 아래로 움직인다. 
	samsung.usbPorts = 1;// usbPorts값이 1이면 키보드와 연결된 상태이다.
	samsung.battery = 95;// 배터리가 최대 충전량이하면 배터리 값이 줄어든다. 
	samsung.WiFiModule = 0; // wiFiMondul값이 0이면 연결 끊김, 1이면 연결
	samsung.speakers = 81; // speakers값이 80이상이면 "소리가 너무 큽니다" 출력 후 불륨 값을 조정한다. 
	samsung.camera = 3; // camera값이 3이면 "사진 촬영 중" 출력한다.
	
	
	samsung.disPlay();
	samsung.touchPad();
	samsung.usbPorts();
	samsung.battery();
	samsung.wiFiModule();
	samsung.speakers();
	samsung.camera();
	samsung.keyBoard();
	
	
	
	}
}
