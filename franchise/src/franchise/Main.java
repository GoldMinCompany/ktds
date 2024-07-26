package franchise;

public class Main {
	public static void main(String[] args) {
		
		Coffee ice = new Coffee("아이스아메리카노", 2500);
		Coffee hot = new Coffee("따뜻한아메리카노", 2000);
		
		CoffeeShop cs = new CoffeeShop(ice, hot);
		
		int price = cs.orderCoffee(0,  5);
		
		System.out.println(price);
		
		
	}

}
