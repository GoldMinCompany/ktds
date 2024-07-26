package com.ktdsuniversity.edu.abstractclass.practice;


public class Beverage {
	
	/**
	 * 음료수의 이름
	 */
	private String name;
	
	/**
	 * 음료수의 가격
	 */
	
	private int price;
	/**
	 * 재고
	 *
	 */
	
	private int stock;
	
	public Beverage() {
		
	}
	
	public Beverage(String name, int price, int stock) {
		
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	
	public String getName() {
		
		return this.name;
		
	}
	
	public int getPrice() {
		
		return this.price;
	
	}
	public int getStock() {
		return this.stock;
	}
	
	public void printBeverage() {
		
		System.out.println("음료수의 이름 : " + this.name);
		System.out.println("음료수의 가격 : " + this.price);
		
	}
	
	public void leftStock(int quantity) {
		
		this.stock -= quantity;
		
	}
	
}
