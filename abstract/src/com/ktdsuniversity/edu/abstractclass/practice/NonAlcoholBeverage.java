package com.ktdsuniversity.edu.abstractclass.practice;


public class NonAlcoholBeverage extends Beverage{
	
	private boolean alcohol;
	//private int stock; // 수량
	
	
	public NonAlcoholBeverage(String name, int price, int stock) {
		
		super(name, price, stock);
		this.alcohol = false; // 알코올 유무 : 무
		
	}
	
	public boolean getAlcohol() {
		
		return this.alcohol;
		
	}
	
	
	
	public void printNonAlcoholBeverage() {
		
		super.printBeverage();
		System.out.println("알코올 유무 : 무");
		System.out.println("재고 : " +  super.getStock());
		System.out.println();
		
	}

}
