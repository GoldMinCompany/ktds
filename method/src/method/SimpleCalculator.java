package method;

import java.util.Scanner;

/**
 * document 주석
 * 
 * <pre>
 * 사칙연산을 지원하는 계산기
 * 1. 덧셈 연산 가능 : 두 숫자를 파라미터로 받아서 두 수의 합을 출력
 * 2. 빼기 연산 가능 :  두 숫자를 파라미터로 받아서 두 수의 차를 출력
 * 3. 곱하기 연산 가능 : 두 숫자를 파라미터로 받아서 두 수의 곱을 출력
 * 4. 나누기 연산 가능 :  두 숫자를 파라미터로 받아서 두 수의 나눈 몫을 출력
 * 
 * </pre>
 */
public class SimpleCalculator {

	public static int getplus(int x, int y) {

		return x + y;
	}

	public static int getminus(int x, int y) {

		return x - y;
	}

	public static int getmultiple(int x, int y) {

		return x * y;
	}

	public static int getdivide(int x, int y) {

		return x / y;
	}

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		System.out.print("첫번째 수 입력 : ");
		int firstNumber = keyboard.nextInt();

		System.out.print("두번째 수 입력 : ");
		int secondNumber = keyboard.nextInt();
		
		System.out.println();
		System.out.println("덧셈 : " + getplus(firstNumber, secondNumber));
		System.out.println("뺄셈 : " + getminus(firstNumber, secondNumber));
		System.out.println("곱하기 : " + getmultiple(firstNumber, secondNumber));
		System.out.println("나누기 : " + getdivide(firstNumber, secondNumber));
	}

}
