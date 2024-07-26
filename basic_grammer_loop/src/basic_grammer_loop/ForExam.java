package basic_grammer_loop;

import java.util.Scanner;

public class ForExam {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int x = keyboard.nextInt();
		int y = keyboard.nextInt();
		
		for(int i=1; i<y+1; i++) {
			
			System.out.println(x + " X " + i + " = " + x*i);
			
		}
		
		// Java 출력 방법
		// 1. System.out.println(); // ln : line의미, 출력한 뒤에 개행(엔터)
		// 2. System.out.print(); // 출력한 뒤 개행 x 
		
	}

}
