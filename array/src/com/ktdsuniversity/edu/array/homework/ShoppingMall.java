package com.ktdsuniversity.edu.array.homework;

public class ShoppingMall {
	public static void main(String[] args) {
		
		Seller seller = new Seller(5); // 5개의 상품이 생성
		
		seller.addMerchandise(new Merchandise("사과", 1000, 0), 0);
		seller.addMerchandise(new Merchandise("배", 1500, 1), 1);
		seller.addMerchandise(new Merchandise("귤", 2000, 2), 2);
		seller.addMerchandise(new Merchandise("포도", 1000, 3), 3);
		seller.addMerchandise(new Merchandise("바나나", 1500, 4), 4);
		
		seller.sell("사과", 0);
		seller.sell("배", 1);
		seller.sell("귤", 3);
		seller.sell("포도", 2);
		seller.sell("바나나", 5);
		
	}

}
