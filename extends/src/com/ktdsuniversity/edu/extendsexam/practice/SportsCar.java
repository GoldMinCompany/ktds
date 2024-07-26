package com.ktdsuniversity.edu.extendsexam.practice;

public class SportsCar extends Vehicle {
	
	public SportsCar(String name) {
		
		super(name);
		
	}
	
	public void turboMode() {
		
		System.out.println("터보모드");
		
	}
	
	public void printSportsCar() {
		
		super.printVehicle();
	}
}
