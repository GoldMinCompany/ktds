package com.ktdsuniversity.edu.interfaceexam.practice;

public class myPhone implements AddressBook {
	
	private String phoneNumber;
	
	public myPhone(String phoneNumber) {
		
		this.phoneNumber = phoneNumber;
	}

	@Override
	public void contactCheckUp() {
		System.out.println("연락처 조회 : " + this.phoneNumber);
		
	}

	@Override
	public void contactDelete() {
		System.out.println("연락처 삭제 : " + this.phoneNumber);
		
	}

	@Override
	public void contactCorrection() {
		System.out.println("연락처 수정 : " + this.phoneNumber);
		
	}

	@Override
	public void contactAdd() {
		System.out.println("연락처 추가 : " + this.phoneNumber);
		
	}
	
	

}
