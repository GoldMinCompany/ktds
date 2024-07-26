package com.ktdsuniversity.edu.extendsexam.practice;

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
		
		Person person = new Person(30, 50000);
		Bar bar = new Bar(3, 2, person, 100000);
		
		
		NonAlcoholBeverage coke = bar.getNonAlcoholBeverage(0, new NonAlcoholBeverage("콜라", 1700, 5));
		NonAlcoholBeverage mccol = bar.getNonAlcoholBeverage(1, new NonAlcoholBeverage("맥콜", 1500, 3));
		NonAlcoholBeverage sprite = bar.getNonAlcoholBeverage(2, new NonAlcoholBeverage("사이다", 1600, 4));
		
		
		//coke.printNonAlcoholBeverage();
		//mccol.printNonAlcoholBeverage();
		//sprite.printNonAlcoholBeverage();
		
		AlcoholBeverage soju = bar.getAlcoholBeverage(0, new AlcoholBeverage("소주", 1200, 5));
		AlcoholBeverage beer = bar.getAlcoholBeverage(1, new AlcoholBeverage("맥주", 2400, 7));
		
		//soju.printAlcoholBeverage();
		//beer.printAlcoholBeverage();
		
		bar.sellFunction(coke, 0, person, 2);
		bar.printLeftMoney();
		person.printMoney();
		
		bar.sellFunction(mccol, 1, person, 1);
		bar.printLeftMoney();
		person.printMoney();
		
		bar.sellFunction(sprite, 2, person, 3);
		bar.printLeftMoney();
		person.printMoney();
		
		bar.sellFunction(soju, 1, person, 4);
		bar.printLeftMoney();
		person.printMoney();
		
		bar.sellFunction(beer, 2, person, 5);
		bar.printLeftMoney();
		person.printMoney();
	}

}
