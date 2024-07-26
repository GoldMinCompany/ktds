package com.ktdsuniversity.edu.extendsexam.practice;

public class CarMain {
	
	public static void startEngine(Vehicle vehicle) {
		
		vehicle.start();
		
	}
	
	public static void startTurboEngin(SportsCar vehicle) {
		
		
		vehicle.turboMode();
		
	}
	
	
	public static void main(String[] args) {
		
		// IS A 관계
		// sub Class is a Super Class
		// 한가지 타입으로 여러가지 타입을 표현할 수 있다.
		
		Vehicle vehicle = new Vehicle("현대자동차");
		Vehicle ev = new EV("테슬라", 100);
		Vehicle sc = new SportsCar("페라리");
		Vehicle bm = new BatMobile("배트모빌");
		
		Vehicle vehicle2 = new Vehicle("현대자동차");
		EV ev2 = new EV("테슬라", 100);
		SportsCar sc2 = new SportsCar("페라리");
		BatMobile bm2 = new BatMobile("배트모빌");
		
		
		CarMain.startEngine(vehicle);
		CarMain.startEngine(ev);
		CarMain.startEngine(sc);
		CarMain.startEngine(bm);
		
		CarMain.startEngine(vehicle2);
		CarMain.startEngine(ev2);
		CarMain.startEngine(sc2);
		CarMain.startEngine(bm2);
		
	//	CarMain.startTurboEngin(vehicle2);
	//	CarMain.startTurboEngin(ev2);
		CarMain.startTurboEngin(sc2);
		CarMain.startTurboEngin(bm2);
	
	}
}
