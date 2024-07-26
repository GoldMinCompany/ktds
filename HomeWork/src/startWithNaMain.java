

import java.util.Scanner;

public class startWithNaMain {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		startWithNa gameInfo = new startWithNa("나");
		
		System.out.println("시작 단어는 \"나\" 입니다.");
		
		while (true) {
			String nextWord = keyboard.nextLine();
			gameInfo.inputNextWord(nextWord);
			
			boolean isEnoughLength = gameInfo.isEnoughLength();
			if (!isEnoughLength) {
				break;
			}
			
			boolean isStartLetter = gameInfo.isStartLetter();
			if(!isStartLetter) {
				break;
			}
			
			gameInfo.addCount();
			gameInfo.changeCurrentWord();
		}
		
		gameInfo.gameOver();

	}

}
