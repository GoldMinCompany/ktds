import java.util.Random;

public class ClawMachine {
	
	boolean isInsertCoin;
	int dolls;
	
	public void insertCoin() {
		
		if(dolls > 0) {
			
			isInsertCoin = true;
		}
		else {
			isInsertCoin = false;
		}
		
		if(isInsertCoin) {
			
			System.out.println("게임 시작!");
			System.out.println("남은 인형의 갯수 : " + dolls);
			doGame();
			
		}
		else {
			
			System.out.println("동전을 넣어라!");
		}		
		
	}
	
	public int doGame() {
		
		if(!isInsertCoin) {
			
			return 0;
		}
			
		Random random = new Random();
		int result = random.nextInt(2);
		System.out.println("뽑은 인형의 갯수 : " + result);
		
		if(result == 1) {
			
			dolls -= result;
			isInsertCoin = false;
			
			System.out.println("남은 인형의 갯수 : " + dolls);
			
			return result;
		}
		else {
			
			return result;
			
			
		}
		
	}
}
