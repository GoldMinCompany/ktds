package method;

import java.util.Scanner;

public class HomeWork1 {
	
	public static double calculator (String operator, double firstNumber, double secondNumber) {
		
		double result = 0;
		
		if(operator.equals("+")) {
			result = firstNumber + secondNumber;
		}
		else if(operator.equals("-")) {
			result = firstNumber - secondNumber;
		}
		else if(operator.equals("*")) {
			result = firstNumber * secondNumber;
		}
		else if(operator.equals("/")) {
			result = firstNumber / secondNumber;
		}
		else {
			System.out.println("계산을 할 수 없습니다.");
		}
		
		return result;
		
		
	}
	
	public static void main(String[] args) {
		
		while(true) {
			
			Scanner keyboard = new Scanner(System.in);
			
			System.out.print("첫번째 숫자 입력 : ");
			double firstNumber = keyboard.nextInt();
			
			System.out.print("두번째 숫자 입력 : ");
			double secondNumber = keyboard.nextInt();
			
			keyboard.nextLine();
			System.out.print("연산자 입력 : ");
			String operator = keyboard.nextLine();
			
			if(operator.equals("exit")) {
				System.out.println("종료!");
				break;
			}
			else {
				double result = calculator(operator,firstNumber, secondNumber); 
				System.out.println("\n연산 결과 : " + result);
			}
			
			System.out.println();	
		}
		
	}

}
