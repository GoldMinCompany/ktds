package com.ktdsuniversity.edu.extendsexam.practice;

public class AlcoholBeverage extends Beverage{
	
	private boolean alcohol;
	
	public AlcoholBeverage(String name, int price, int stock) {
		
		super(name, price, stock);
		this.alcohol = true; // 알코올 유무 : 유
		
	}
	
	public boolean getAlcohol() {
		
		return this.alcohol;
		
	}

	
	public void printAlcoholBeverage() {
		
		super.printBeverage();
		System.out.println("알코올 유무 : 유");
		System.out.println("재고 : " + super.getStock());
		System.out.println();
		
	}

}
