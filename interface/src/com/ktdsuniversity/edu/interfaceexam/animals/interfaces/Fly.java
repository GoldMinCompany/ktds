package com.ktdsuniversity.edu.interfaceexam.animals.interfaces;

public interface Fly {
	/**
	 * Default Abstract Method
	 * Default method : 추상 메소드가 기본적으로 하는 일을 미리 만들어 주는 것
	 */
	public default void fly() {
		//여기서는 변수를 사용할 수 없다.
		System.out.println("날아 다닙니다");
		
	}

}
