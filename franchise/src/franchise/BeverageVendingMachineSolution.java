package franchise;

/**
 * 음료수를 판매하는 자판기
 * 4개의 음료수를 판매
 * has a 관계 
 */
public class BeverageVendingMachineSolution {
	
	BeverageSolution itemOne;
	BeverageSolution itemTwo;
	BeverageSolution itemThree;
	BeverageSolution itemFour;
	
	//멤버변수 초기화
	public BeverageVendingMachineSolution(BeverageSolution itemOne, BeverageSolution itemTwo, BeverageSolution itemThree, BeverageSolution itemFour) {
		
		this.itemOne = itemOne;
		this.itemTwo = itemTwo;
		this.itemThree = itemThree;
		this.itemFour = itemFour;
		
	}
	
	
	//주문하기
	public BeverageSolution selectItemButton(String itemName, int pressTime) {
		
		if(this.itemOne.name.equals(itemName)) {
			
			if(this.itemOne.stock >= 0 && this.itemOne.stock >= pressTime) {
				this.itemOne.stock -= pressTime;
				
				BeverageSolution outputItem = new BeverageSolution(this.itemOne.name,
																	this.itemOne.price * pressTime, pressTime);
				return outputItem; // 손님에게 상품을 전달한다. 
			}
			else {
				System.out.println("상품이 품절되었습니다.");
				return null;
			}
			
			
		}
		else if(this.itemTwo.name.equals(itemName)) {
			
			if(this.itemTwo.stock >= 0 && this.itemTwo.stock >= pressTime) {
				this.itemTwo.stock -= pressTime;
				
				BeverageSolution outputItem = new BeverageSolution(this.itemTwo.name,
																	this.itemTwo.price * pressTime, pressTime);
				return outputItem; // 손님에게 상품을 전달한다. 
			}
			else {
				System.out.println("상품이 품절되었습니다.");
				return null;
			}
			
		}
		else if(this.itemThree.name.equals(itemName)) {
			
			if(this.itemThree.stock >= 0 && this.itemThree.stock >= pressTime) {
				this.itemThree.stock -= pressTime;
				
				BeverageSolution outputItem = new BeverageSolution(this.itemThree.name,
																	this.itemThree.price * pressTime, pressTime);
				return outputItem; // 손님에게 상품을 전달한다. 
			}
			else {
				System.out.println("상품이 품절되었습니다.");
				return null;
			}
			
		}
		else if(this.itemFour.name.equals(itemName)) {
			
			if(this.itemFour.stock >= 0 && this.itemFour.stock >= pressTime) {
				this.itemFour.stock -= pressTime;
				
				BeverageSolution outputItem = new BeverageSolution(this.itemFour.name,
																	this.itemFour.price * pressTime, pressTime);
				return outputItem; // 손님에게 상품을 전달한다. 
			}
			else {
				System.out.println("상품이 품절되었습니다.");
				return null;
			}
			
		}
		else {
			System.out.println("그런 상품은 없습니다.");
		}
		return null; // 메모리에 할당된 데이터가 없는 상태
	}
	//입고
	public void fillItem(String itemName, int stock) {
		
		if(this.itemOne.name.equals(itemName)) {
			this.itemOne.stock += stock;
		}
		else if(this.itemTwo.name.equals(itemName)) {
			this.itemTwo.stock += stock;
		}
		else if(this.itemThree.name.equals(itemName)) {
			this.itemThree.stock += stock;
		}
		else if(this.itemFour.name.equals(itemName)) {
			this.itemFour.stock += stock;
		}
		else {
			System.out.println("그런 상품은 팔지 않습니다.");
		}
		
	}
	//재고
	public void printStock() {
		
		System.out.println(this.itemOne.name + " : " + this.itemOne.stock + "개" );
		System.out.println(this.itemTwo.name + " : " + this.itemTwo.stock + "개" );
		System.out.println(this.itemThree.name + " : " + this.itemThree.stock + "개" );
		System.out.println(this.itemFour.name + " : " + this.itemFour.stock + "개" );

	}
	

}
