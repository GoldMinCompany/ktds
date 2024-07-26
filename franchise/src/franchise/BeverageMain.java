package franchise;

public class BeverageMain {
	public static void main(String[] args) {
		
		Beverage bakcas  = new Beverage("박카스", 900, 15);
		Beverage monster = new Beverage("몬스터", 1500, 20);
		Beverage hotsix = new Beverage("핫식스", 1300, 13);
		Beverage milkiss = new Beverage("밀키스", 1400, 5);
				
		
		BeverageVendingMachine bvm = new BeverageVendingMachine(bakcas, monster, hotsix, milkiss);
		
		bvm.order("박카스", 5);
		bvm.order("몬스터", 3);
		bvm.order("핫식스", 2);
		bvm.order("밀키스", 2);
		
		bvm.store("박카스", 2);
		bvm.store("몬스터", 2);
		bvm.store("핫식스", 2);
		bvm.store("밀키스", 2);
		
		bvm.stock("박카스");
		bvm.stock("몬스터");
		bvm.stock("핫식스");
		bvm.stock("밀키스");
	}

}
