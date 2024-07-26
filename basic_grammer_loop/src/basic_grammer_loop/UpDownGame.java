package basic_grammer_loop;

import java.util.Random;
import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {
		
		System.out.println("맞출때까지 반복되는 Up Down 게임!");
		
		/*
		 * Random random = new Random(); 
		 * Scanner keyboard = new Scanner(System.in);
		 */
		
		double randomFloatingPoint = Math.random(); // 부동소수점 형태의 난수 생성
		int correctNumber = (int) (randomFloatingPoint * 100);
		
		System.out.println("correctNumber :" + correctNumber);
		
		Scanner keyboard = new Scanner(System.in);
		
		
		while(true) {
			
			System.out.println("숫자를 입력하세요 : ");
			int answer = keyboard.nextInt();
			
			if(correctNumber == answer) {
				System.out.println("정답!");
				break; //반복문 끝, 현재흐름을 중단시키는 keyword! 
			}
			else if(correctNumber > answer) {
				System.out.println("Up!");
			}
			else {
				System.out.println("Down!");
			}
			
		}
		

	}

}
