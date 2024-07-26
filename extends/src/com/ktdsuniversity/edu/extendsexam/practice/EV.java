package com.ktdsuniversity.edu.extendsexam.practice;

public class EV extends Vehicle {

	private int battery;
	
	public EV(String name, int battery) {
		super(name);
		this.battery = battery;
		
	}
	
	public void checkBattery() {
		
		if(this.battery > 0) {
			System.out.println("배터리 잔량 : " + this.battery);
		}
		else {
			
			this.battery = 0;
			System.out.println("배터리 잔량 : " + this.battery);
			
		}
		
	}
	
	public void printEV() {
		
		super.printVehicle();
		System.out.println("배터리 잔량 : " + this.battery);
	}
	
}
