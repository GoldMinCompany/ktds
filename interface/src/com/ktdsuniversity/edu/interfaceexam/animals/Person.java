package com.ktdsuniversity.edu.interfaceexam.animals;

import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Human;
import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Move;

/**
 * Person is a Human
 * Human is a Move
 * Human is a Eat
 * 
 * Person is a Human
 * Person is a Move
 * Person is a Eat
 */
public class Person implements Human {
	
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	
	@Override
	public void walk() {
		
		System.out.println(this.name + " 두 발로 걷습니다. 속도 : " + Move.SPEED);
	}

	@Override
	public void run() {
		System.out.println(this.name + " 두 발로 뜁니다. 속도 : " + Move.RUN_SPEED);
		
	}

	@Override
	public void eat() {
		System.out.println(this.name + " 숟가락으로 밥을 먹습니다.");
		
	}

	@Override
	public void work() {
		System.out.println(this.name + " 이 일을 합니다.");
		
	}

	@Override
	public void speak() {
		
		System.out.println(this.name + " 말을 합니다");
	}

	@Override
	public void think() {
		System.out.println(this.name + " 생각을 합니다.");
		
	}

}
