package franchise;

public class CoffeeShop {
	
	Coffee iceAmericano; // 멤버변수로 Coffee 클래스 선언, Coffee 새로운 자료형
	Coffee hotAmericano;
	
	public CoffeeShop(Coffee iceAmericano, Coffee hotAmericano) {
		
		this.iceAmericano = iceAmericano;
		this.hotAmericano = hotAmericano;
		
	}
	
	
	/**
	 * CoffeeShop에서 음료주문 기능
	 * @param menu 주문할 음료의 번호 1 : iceAmericano, 0 : hotAmericano
	 * @param quantity 주문할 수량
	 * @return 주문 총액
	 */
	public int orderCoffee(int menu, int quantity) {
		
		if(menu == 1) {
			System.out.println(this.iceAmericano.name+"을 주문합니다.");
			return this.iceAmericano.price * quantity;
		}
		
		System.out.println(this.hotAmericano.name+"을 주문합니다.");
		return this.hotAmericano.price * quantity;
		
	}
}
