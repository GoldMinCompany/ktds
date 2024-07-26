package com.ktdsuniversity.edu.array.homework;

public class Seller {
	
	Merchandise[] merchandise;
	
	public Seller(int merchandisNumber) {
		
		this.merchandise = new Merchandise[merchandisNumber];
		
		// 상품을 초기화
		
	}
	
	// 상품을 클래스 배열에 넣어주는 메소드
	public void addMerchandise(Merchandise merchandise, int index) {
		
		this.merchandise[index] = merchandise;
		
	}
	
	// 판매하는 메소드
	public void sell(String name, int quantity) {
	
		if(quantity == 0)
		{
			System.out.println("구매 수량은 0보다 커야 합니다.");
			return;
		}
		for(int i=0; i < merchandise.length; i++) {
			if(name.equals(merchandise[i].getName())) {
				
				
				if(quantity <= merchandise[i].getStock()) {
					
					merchandise[i].buy(quantity);
					System.out.println(name + " 가/이 "+ quantity + "개 팔렸습니다." + "재고 : " + merchandise[i].getStock());
					break;
				}
				else {
					
					System.out.println("재고가 부족합니다.");
					break;
				}
				
			}
		}
	}
		
		
}
	


