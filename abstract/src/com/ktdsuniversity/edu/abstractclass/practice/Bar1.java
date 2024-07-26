package com.ktdsuniversity.edu.abstractclass.practice;

public class Bar1 extends AbstractBar{
	
	public static final int ADULT = 19;
	
	
	
	
	// 음료와 주류의 가짓수
	public Bar1(int stock, Person person,int money) {
		super(stock, person, money);
		System.out.println("성인만 입장 가능한 Bar입니다.");
		System.out.println("========================");
	}
	

	@Override
	public Beverage getBeverage(int index, Beverage beverage) {
		return this.beverage[index] = beverage;
	}
	
	@Override
	public void sellFunction(Beverage drink, Person person, int quantity) {
		
		System.out.println(drink.getName() +"의 " + "재고 : " + drink.getStock());
		if(person.getMoney() <= 0) {
			
			System.out.println("돈이 부족하여, 음료와 주류를 구매하실 수 없습니다.");
			person.zeroMoney();
		}
		else {
		
			if(drink.getStock() >= quantity) {
				if(drink instanceof NonAlcoholBeverage) {
					
					if(this.isAdult()) {
						if(drink.getPrice() * quantity > person.getMoney()) {
							person.getMoney();
							System.out.println("소지금이 부족합니다. 더 이상 구매하실 수 없습니다.");
							System.out.println(drink.getName() +"의 " + "남은 갯수 : " + drink.getStock());
						}
						else {
							this.money += drink.getPrice() * quantity;
							drink.leftStock(quantity);
							person.leftMoney(drink.getPrice(), quantity);
							System.out.println(drink.getName() + "의 판매 갯수 : " + quantity); 
							System.out.println(drink.getName() +"의 " + "남은 갯수 : " + drink.getStock());
							
							
						}
					}else {
						
						System.out.println("19세 미만은 성인 바에 입장이 불가능합니다.");
						System.out.println(drink.getName() +"의 " + "남은 갯수 : " + drink.getStock());
						
					}
				}
				
				if(drink instanceof AlcoholBeverage ) {
					
					if(this.isAdult()) {
						if(drink.getPrice() * quantity > person.getMoney()) {
//							person.getMoney();
							System.out.println("소지금이 부족합니다. 더 이상 구매하실 수 없습니다.");
							System.out.println(drink.getName() +"의 " + "남은 갯수 : " + drink.getStock());
						}
						else {
							this.money += drink.getPrice() * quantity;
							drink.leftStock(quantity);
							person.leftMoney(drink.getPrice(), quantity);
							System.out.println(drink.getName() + "의 판매 갯수 : " + quantity); 
							System.out.println(drink.getName() +"의 "+"남은 갯수 : " + drink.getStock());	
						}
					}
					else {
						System.out.println("19세 미만은 성인 바에 입장이 불가능합니다.");
						System.out.println(drink.getName() +"의 " + "남은 갯수 : " + drink.getStock());
					}
					
					
				}
			}else {
				
				System.out.println("재고 없음");
			}
				
		}
	}
	@Override
	public void printLeftMoney() {
		
		System.out.println("Bar의 소지금 : " + this.money); 
		
	}
	@Override
	public boolean isAdult() {
		
		return person.getAge() >= ADULT;
	}
	
	
	
}
