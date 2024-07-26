package com.ktdsuniversity.edu.extendsexam.practice;

public class Person {
	
	NonAlcoholBeverage nonAlcoholBeverage;
	AlcoholBeverage alcoholBeverage;
	/**
	 * 나이
	 */
	
	private int age;
	
	/**
	 * 소지금
	 */
	private int money;
	

	/**
	 * 취한상태 
	 * true : 취함
	 * false : 안취함
	 */
	
	private boolean state;
	//
	public Person() {
		
		
	}
	
	public Person(int age, int money) {
		
		this.age = age;
		this.money = money;
	}
	
	public int getAge() {
		
		return this.age;
		
	}
	
	public int getMoney() {
		
		return this.money;
		
	}
	
	public boolean getState() {
		
		return this.state;
	}
	
	public int leftMoney(int price, int buyQuantity){
		return this.money -= buyQuantity * price;
	}

	public void printMoney() {
		System.out.println("Person의 소지금 : " + this.money);
		System.out.println();
	}
	
	public int zeroMoney() {
		
		return this.money = 0;
	}
	
	
}
