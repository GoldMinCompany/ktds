package com.ktdsuniversity.edu.abstractclass.practice;

public abstract class AbstractBar {
	
	protected Beverage[] beverage;
	protected Person person;
	protected int money;
	
	public AbstractBar(int stock, Person person, int money) {
		
		this.beverage = new Beverage[stock];
		this.person = person;
		this.money = money;
		
		
	}
	public abstract Beverage getBeverage(int index, Beverage beverage);
	public abstract void sellFunction(Beverage drink, Person person, int quantity);
	public abstract void printLeftMoney();
	
	public abstract boolean isAdult();
}
