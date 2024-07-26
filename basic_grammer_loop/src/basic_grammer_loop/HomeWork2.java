package basic_grammer_loop;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		while(true) {
			System.out.print("단을 입력하세요 : ");
			int number = keyboard.nextInt();
			
			if(number > 0) {
				for(int i=1; i<10; i++) {
					
					System.out.println(number + " X " + i + " = "+ number*i);
					
				}
			}else {
				System.out.println("구구단 출력 프로그램 종료");
				break;
			}
			
			
			
		}

	}

}
