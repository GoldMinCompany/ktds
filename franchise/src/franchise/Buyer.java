package franchise;
/**
 * 구매자
 */
public class Buyer {
	
	int itemCount;
	int money;
	
	
	public Buyer(int money) {
		this.money = money;
	}
	
	/**
	 * 구매자가 구매한다.
	 * @param quantity : 구매 수량
	 * @param price : 구매 수량 * 판매 상품의 단가
	 */
	public void buy(int quantity, int price) {
		
		//돈이 충분하다면
		if(this.money >= price) {
			this.money -= price;
			this.itemCount += quantity;
		}
		
		
	}

	public void printBuyerInfo() {
		
		System.out.println("구매자의 상품 수 : " + this.itemCount);
		System.out.println("구매자의 지갑 현황 : " + this.money);
	}
	
}
