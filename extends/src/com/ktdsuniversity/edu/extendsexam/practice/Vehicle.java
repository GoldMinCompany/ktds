package com.ktdsuniversity.edu.extendsexam.practice;

public class Vehicle {
	/**
	 * 자동차 모델명
	 */
	private String name;
	
	
	/**
	 * Vehicle 생성자
	 */
	public Vehicle(String name) {		
		this.name = name;
	}
	
	/**
	 * 시동걸기
	 */
	
	public void start() {
		
		System.out.println("차량이 출발합니다.");
		
	}
	
	public void printVehicle() {
		
		System.out.println("모델명 : " + this.name);
	}
	
	public void ends() {
		
		System.out.println("시동 끄기");
	}
	
}
