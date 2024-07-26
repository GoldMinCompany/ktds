package franchise;

public class Buyer {
	
	private int purchaseNumber; //구매 횟수
	private int buyerMoney; // 지갑현황
	
	
	//생성자
	public Buyer(int purchaseNumber, int buyerMoney) {
		
		this.purchaseNumber = purchaseNumber;
		this.buyerMoney = buyerMoney;
		
	}
	
	//구매 갯수 getter
	public int getPurchaseNumber() {
		
		return purchaseNumber;
	}
	//지갑 현황 getter
	public int getbuyerMoney() {
		
		return buyerMoney;
		
	}
	
	public void buy(int stockOfSeller, int price) {
		
		this.purchaseNumber = stockOfSeller; //오류 발생할 것 같다.
		this.buyerMoney -= this.purchaseNumber * price;
		
	}
	public int failDeal() {
		
		return this.purchaseNumber = 0;
		
		
	}
	public void printBuyer() {
		
		System.out.println("구매자의 구매 횟수 : " + this.purchaseNumber);
		System.out.println("구매자의 지갑 현황 : " + this.buyerMoney);
	}

	
	


}
	
