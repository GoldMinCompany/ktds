package com.ktdsuniversity.edu.interfaceexam;


/**
 * 인터페이스의 특징
 * 
 * - 메소드만 정의 - 추상 메소드
 * 		- 어떻게 동작하는지는 관심이 없다
 * 		- 인터페이스가 정해놓은 기능만 구현한다.
 * 		- 인터페이스는 추상메소드만 정의한다.  
 * 		- abstract는 기본적으로 생략 가능하다.
 */

public interface Calculator {

	
	
	public int add(int a, int b);
	
	public int sub(int a, int b);
	
	public double div(int a, int b);
	
	public  int mul(int a, int b);

}
