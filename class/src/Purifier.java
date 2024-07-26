
public class Purifier {
	
	/**
	 * 정수기의 남은 물의 양 (단위 liter)
	 */
	double remainWater;
	

	
	/**
	 * 냉수, 온수 선택 버튼(냉수/온수 여부)
	 * 0 : 냉수
	 * 1 : 온수
	 */
	int temperature;
	
	/**
	 * 정수기에 남아있는 얼음의 양(단위 :개)
	 */
	double remainIceBlock;
	
	
	/**
	 * 정수 필터
	 * 값이 100이라면 새 필터
	 * 값이 0이라면 교체해야하는 필터 
	 */
	int filter;
	
	/**
	 * 물 배출 기능 ---> 물 배출 버튼을 누른 행위
	 */
	public void waterExhaust() {
		// 물 배출 버튼을 누르면, 정수 물통의 양이 줄어든다.
		
		if(remainWater > 0) {
			remainWater--;
		}
		
		
		// 남아 있는 물의 양이 0 일 때, 물통의 양이 더 이상 줄어들 수 없다.
		
	}
	/**
	 * 온도 조절
	 */
	
	public void chooseTemperature() {
		//온도 조절 버튼을 누를 때 마다 냉수, 온수가 전환된다.
		
		if(temperature == 0) {
			temperature = 1; // 냉수 일때, 온수 변환
		}
		else {
			temperature = 0; // 온수 일때, 냉수 변환
		}
		
		
	}
	/**
	 * 얼음 만드는 기능
	 */
	public void makeIce() {
		// 정수기에 보관할 수 있는 최대 얼음의 갯수가 100개.
		// 만약, 남아 잇는 얼음의 갯수가 100개 라면 얼음을 생성하지 않는다.
		if(remainIceBlock < 100) {
			remainIceBlock ++;
		}
	}
	/**
	 * 물통에 물을 채운다.
	 */
	public void fillWater() {
		
		//1. 물통에 물을 채운다. 물통의 최대 저장용량 30L로 가정
		//2. 물은 필터를 통해 걸러진다. ---> 필터의 사용량이 줄어든다. 
		
		if(remainWater < 30) {
			remainWater ++;
			
			//2. 물은 필터를 통해 걸러진다. ---> 필터의 사용량이 줄어든다.
			//필터의 사용량이 0이 된다면, 필터는 정상기능을 수행할 수 없다. 
			filter--;
		}
		
	}
	
	/**
	 * 얼음 배출
	 */
	public void iceExhaust() {
		//남아있는 얼음의 갯수가 0보다 클 때만 얼음을 배출한다.
		if(remainIceBlock > 0) {
			remainIceBlock--;
		}
		
		
	}
	
}
