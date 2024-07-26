package com.ktdsuniversity.edu.array.homework;

public class Merchandise {
	
	private String name; // 상품명
	private int price; // 상품가격
	private int stock; // 상품재고
	
	public Merchandise(String name, int price, int stock){
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
	
	public void buy(int quantity) {
		
		this.stock -= quantity;
		
	}
	
}
