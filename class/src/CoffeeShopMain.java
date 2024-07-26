
public class CoffeeShopMain {

	public static void main(String[] args) {
		
		CoffeeShop tomAndToms = new CoffeeShop("아이스 아메리카노",5500,"따듯한 아메리카노", 5000, 0.5);
//		tomAndToms.iceAmericano = 5500;
//		tomAndToms.hotAmericano = 5000;
		System.out.println(tomAndToms);
		
		CoffeeShop mammoth = new CoffeeShop("저렴한 아아", 1400, "저렴한 뜨아", 1200, 0.3);
		
		System.out.println(mammoth);
//		mammoth.iceAmericano = 1400;
//		mammoth.hotAmericano = 1200;
		
		
		int tomAndTomsIceAmericanoPrice = tomAndToms.orderCoffee(1, 10);
		int tomAndTomsHotAmericanoPrice = tomAndToms.orderCoffee(2, 5);
		
		System.out.println("탐탐 "+tomAndToms.iceAmericanoName+" : "+ tomAndTomsIceAmericanoPrice);
		System.out.println("탐탐 "+tomAndToms.hotAmericanoName+" : "+ tomAndTomsHotAmericanoPrice);
		
		int mammothIceAmericanoPrice = mammoth.orderCoffee(1, 10);
		int mammothHotAmericanoPrice = mammoth.orderCoffee(2, 10);
		
		System.out.println("메머드 " + mammoth.iceAmericanoName +" : "+ mammothIceAmericanoPrice);
		System.out.println("메머드 " + mammoth.hotAmericanoName +" : "+ mammothHotAmericanoPrice);
		
	}

}
