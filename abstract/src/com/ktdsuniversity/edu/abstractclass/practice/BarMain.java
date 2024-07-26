package com.ktdsuniversity.edu.abstractclass.practice;


public class BarMain {
	
	public static void main(String[] args) {
		/*
		 * 음료와 주류를 파는 바입니다.
		 * 음료 혹은 주류를 팔면 돈을 법니다.
		 * 19세 미만의 손님에게 주류를 팔 수 없습니다. 
		 * 
		 * 바는 여러개의 음료를 판매할 수 있습니다. 
		 * 
		 * 추가 구현 과제 : 
		 *  손님이 잔뜩 취했을 경우, 주류를 팔지 못합니다.
		 *  
		 */
		//Beverage beverage = new Beverage();
		Person person1 = new Person(30, 30000);	
		AbstractBar bar1 = new Bar1(5, person1, 100000);
		
		Beverage coke = bar1.getBeverage(0, new NonAlcoholBeverage("콜라", 1700, 5));
		Beverage mccol = bar1.getBeverage(1, new NonAlcoholBeverage("맥콜", 1500, 3));
		Beverage sprite = bar1.getBeverage(2, new NonAlcoholBeverage("사이다", 1600, 4));
		
		Beverage soju = bar1.getBeverage(3, new AlcoholBeverage("소주", 1200, 5));
		Beverage beer = bar1.getBeverage(4, new AlcoholBeverage("맥주", 2400, 7));
		
		bar1.sellFunction(coke, person1, 2);
		bar1.printLeftMoney();
		person1.printMoney();
		
		bar1.sellFunction(mccol, person1, 1);
		bar1.printLeftMoney();
		person1.printMoney();
		
		bar1.sellFunction(sprite, person1, 3);
		bar1.printLeftMoney();
		person1.printMoney();
		
		bar1.sellFunction(soju, person1, 4);
		bar1.printLeftMoney();
		person1.printMoney();
		
		bar1.sellFunction(beer, person1, 5);
		bar1.printLeftMoney();
		person1.printMoney();
		
		
		Person person2 = new Person(15, 100000);
		AbstractBar bar2 = new Bar2(4, person2, 100000);
		
		Beverage milkiss = bar2.getBeverage(0, new NonAlcoholBeverage("밀키스", 1400, 10));
		Beverage fanta = bar2.getBeverage(1, new NonAlcoholBeverage("환타", 1600, 7));
		Beverage pepsi = bar2.getBeverage(2, new NonAlcoholBeverage("펩시", 1200, 8));
		
		Beverage tera = bar2.getBeverage(3, new AlcoholBeverage("테라", 3000, 7));
		
		bar2.sellFunction(milkiss, person2, 5);
		bar2.printLeftMoney();
		person2.printMoney();
		
		bar2.sellFunction(fanta, person2, 4);
		bar2.printLeftMoney();
		person2.printMoney();
		
		bar2.sellFunction(pepsi, person2, 6);
		bar2.printLeftMoney();
		person2.printMoney();
		
		bar2.sellFunction(tera, person2, 4);
		bar2.printLeftMoney();
		person2.printMoney();
		
		
		
	}

}
