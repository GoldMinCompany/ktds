package com.ktdsuniversity.edu.interfaceexam.animals;

/**
 * Bird
 * 	interface : Move, Bark, Eat, Fly
 * 	Bird is a Move
 *  Bird is a Bark
 *  Bird is a Eat
 *  Bird is a Fly
 * 
 * Chicken
 *  extends Bird
 *  Chicken is a Bird
 *  Chicken is a Move
 *  Chicken is a Bark
 *  Chicken is a Eat
 *  Chicken is a Fly
 */


public class Chicken extends Bird{

	
	public Chicken(String name) {
		super(name);
	}
	
	//Bird의 fly()함수를 다시 재정의한 것
	//Interface의 fly()함수를 다시 재정의 한것이 아니다.
	@Override
	public void fly() {
		
		System.out.println(super.name + " 3초간 버덕입니다.");
	}

}
