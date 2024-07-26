package franchise;
/**
 * 판매자
 * 
 */
public class Seller {
	
	/**
	 * 재고
	 */
	int stock;
	
	/**
	 * 상품의 판매 금액
	 */
	final int PRICE;
	/**
	 * 금고
	 */
	
	int money;
	
	
	public Seller(int stock, int PRICE, int money) {
		this.stock = stock;
		this.PRICE = PRICE;
		this.money = money;
	}
	// 몇개를 팔것인가?
	public int sell(int quantity) {
		if(this.stock >= quantity) {
			this.stock -= quantity;
			this.money += this.PRICE * quantity;
			return quantity;
		}
		
		else {
			
			quantity = this.stock;
			this.money += this.PRICE * this.stock;
			this.stock = 0;
			return quantity;
		}
		
	}
	
	public void printSellerInfo() {
		
		System.out.println("판매자의 상품 수 : " + this.stock);
		System.out.println("판매자의 상품 가격 : " + this.PRICE);
		System.out.println("판매자의 상품 지갑 : " + this.money);
		
	}
	
	
	
}
