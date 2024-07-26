package franchise;

public class Seller {
	
	private int merchandiseNumber; //상품 갯수
	private int price; //상품 가격
	private int sellerMoney; // 금고현황 
	
	//생성자 
	public Seller(int merchandiseNumber, int price, int sellerMoney) {
		
		this.merchandiseNumber = merchandiseNumber;
		this.price = price;
		this.sellerMoney = sellerMoney;
	}
	
	//상품 갯수 getter
	public int getMerchandiseNumber() {
		
		return this.merchandiseNumber;
	}
	
	//상품 가격 getter
	public int getPrice() {
		return this.price;
	}

	//금고 현황 getter
	
	public int getSellerMoney() {
		
		return this.sellerMoney;
	}
	
	public void sell(int stockOfBuyer, int price) {
		
		this.merchandiseNumber -= stockOfBuyer;
		this.sellerMoney += stockOfBuyer * price;
		
		
	}
	
	public void printSell() {
		
		System.out.println("판매자의 상품 수 : " + this.merchandiseNumber);
		System.out.println("판매자의 상품 가격 : " + this.price);
		System.out.println("판매자의 금고 현황 : " + this.sellerMoney);
	}

}
