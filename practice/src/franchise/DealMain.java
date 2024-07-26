package franchise;

public class DealMain {

	public static void main(String[] args) {
		
		Seller seller = new Seller(5, 5000, 0);
		Buyer buyer = new Buyer(4, 100000);
		
		Deal deal = new Deal(buyer, seller);
		
		deal.deal();
		buyer.printBuyer();
		seller.printSell();
		

	}

}
