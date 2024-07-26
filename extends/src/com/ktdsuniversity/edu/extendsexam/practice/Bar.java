package com.ktdsuniversity.edu.extendsexam.practice;

public class Bar {
	
	public static final int ADULT = 19;
	private NonAlcoholBeverage[] nonAlcoholBeverage;
	private AlcoholBeverage[] alcoholBeverage;
	private Person person;
	private int money;
	
	
	// 음료와 주류의 가짓수
	public Bar(int nonAlcoholBeverageStock, int alcoholBeverageStock, Person person,int money) {
		
		this.nonAlcoholBeverage = new NonAlcoholBeverage[nonAlcoholBeverageStock];
		this.alcoholBeverage =  new AlcoholBeverage[alcoholBeverageStock];
		this.person = person;
		this.money = money;
	}
	
	public NonAlcoholBeverage getNonAlcoholBeverage(int index, NonAlcoholBeverage nonAlcoholBeverage) {
		
		return this.nonAlcoholBeverage[index] = nonAlcoholBeverage;
		
	}
	
	public AlcoholBeverage getAlcoholBeverage(int index, AlcoholBeverage alcoholBeverage) {
		
		return this.alcoholBeverage[index] = alcoholBeverage;
	
	}
	
	
	public void sellFunction(Beverage drink, int index, Person person, int Quantity) {
		
		if(person.getMoney() <= 0) {
			
			System.out.println("음료와 주류를 구매하실 수 없습니다.");
			System.out.println();
			person.zeroMoney();
		}
		else {
		
			if(drink.getStock() >= Quantity) {
				if(drink instanceof NonAlcoholBeverage) {
					
					this.money += drink.getPrice() * Quantity;
					drink.leftStock(Quantity);
					person.leftMoney(drink.getPrice(), Quantity);
					System.out.println(drink.getName() +"의 " + "남은 재고 : " + drink.getStock());
					
				}
				
				if(drink instanceof AlcoholBeverage ) {
					
					if(person.getAge() >= ADULT) {
						
						this.money += drink.getPrice() * Quantity;
						drink.leftStock(Quantity);
						person.leftMoney(drink.getPrice(), Quantity);
						System.out.println(drink.getName() +"의 "+"남은 재고 : " + drink.getStock());
						
						
					}
					else {
						System.out.println("주류를 구매할 수 없습니다.");
						System.out.println(drink.getName() +"의 " + "남은 재고 : " + drink.getStock());
					}
					
					
				}
			}else {
				
				System.out.println("재고 없음");
			}
				
		}
	}
	
	public void printLeftMoney() {
		
		System.out.println("Bar의 소지금 : " + this.money); 
		
	}
	
	
	
	
}
