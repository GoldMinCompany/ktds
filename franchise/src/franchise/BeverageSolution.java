package franchise;
/**
 * 자판기에서 판매하는 상품
 * Data Class
 * 지역변수와 생성자만 선언
 */
public class BeverageSolution {
	
	String name; //상품 이름
	int price; //상품 가격
	int stock; //상품 재고
	
	public BeverageSolution(String name, int price, int stock) {
		
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

}
