package com.ktdsuniversity.edu.extendsexam.practice;

public class BatMobile extends SportsCar{

	public BatMobile(String name) {
		super(name);
	}
	
	public void batPort() {
		
		System.out.println("배트포트 분리");
	}
	
	public void printBatPort() {
		
		super.printVehicle();
	}
}
