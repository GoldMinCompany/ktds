package franchise;

public class Deal {
	
	private Buyer buyer;
	private Seller seller;
	
	public Deal(Buyer buyer, Seller seller) {
		
		this.buyer = buyer;
		this.seller = seller;
		
	}
	
	
	public Deal deal() {
		
		// 구매자의 구매 횟수 * 판매자의 판매가격이 구매자의 지갑현황보다 크다면 구매 불가
		if(buyer.getPurchaseNumber() * seller.getPrice() > buyer.getbuyerMoney()) {
			System.out.println("구매 불가능");
			
			buyer.failDeal();
			
			return new Deal(buyer, seller);
		}
		else {
			
			if(buyer.getPurchaseNumber() > seller.getMerchandiseNumber()) {
				
				int stockOfSeller = seller.getMerchandiseNumber();
				buyer.buy(stockOfSeller, seller.getPrice());
				seller.sell(stockOfSeller, seller.getPrice());			
				
			}
			
			else {
				
				int stockOfSeller =+ buyer.getPurchaseNumber();
				buyer.buy(stockOfSeller, seller.getPrice());
				seller.sell(stockOfSeller, seller.getPrice());
			}
			return new Deal(buyer, seller);
		}
		
	}

}
