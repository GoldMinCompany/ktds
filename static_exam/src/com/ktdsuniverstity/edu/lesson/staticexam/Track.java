package com.ktdsuniverstity.edu.lesson.staticexam;

public class Track {

	
	public static void main(String[] args) {
		
		Car matiz = new Car(Car.SMALL, "마티즈");
		matiz.startEngine();
		
		
		Car kona = new Car(Car.MIDEUM, "코난");
		kona.startEngine();

		Car g90 = new Car(Car.LARGE, "재네시스 G90");
		g90.startEngine();
		
		System.out.println(StringUtils.isEmpty(""));
		System.out.println(StringUtils.isEmpty("a"));
		System.out.println(StringUtils.isNumber("01234"));
		System.out.println(StringUtils.paresInt("01234"));

	}

}
