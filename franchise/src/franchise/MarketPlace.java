package franchise;

public class MarketPlace {
	
	public static void main(String[] args) {
	
		Seller shoeMarker = new Seller(100, 150000, 100000);
		Buyer me = new Buyer(100000);
		
		int orderCount = 1000;
		
		if(orderCount * shoeMarker.PRICE <= me.money) {
			
			int orderQuantity = shoeMarker.sell(orderCount);
			me.buy(orderQuantity, orderQuantity * shoeMarker.PRICE);
			
		}
		
		shoeMarker.printSellerInfo();
		me.printBuyerInfo();
		
	
	}
	
}
