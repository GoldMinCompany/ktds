package franchise;

public class BeverageVendingMachine {
	
	Beverage bakcas;
	Beverage monster;
	Beverage hotsix;
	Beverage milkiss;
	
	public BeverageVendingMachine(Beverage bakcas, Beverage monster, Beverage hotsix, Beverage milkiss) {
		
		this.bakcas = bakcas;
		this.monster = monster;
		this.hotsix = hotsix;
		this.milkiss = milkiss;
		
	}
	
	public Beverage order(String menuName, int quantity) {
		
		if(this.bakcas.name.equals(menuName)) {
			
			if(this.bakcas.stock > quantity)
				{
				this.bakcas.stock -= quantity;
				
				int price = this.bakcas.price * quantity;
				
				System.out.println("재고 : "+ this.bakcas.stock +", " + "가격 : " + price);
				
				
				return new Beverage(bakcas.name, price, quantity);
				}
			else {
				System.out.println("재고없음");
				 return null;
			}
			
		}
		else if(this.monster.name.equals(menuName)) {
			
			if(this.monster.name.equals(menuName)) {
				
				if(this.monster.stock > quantity)
					{
					this.monster.stock -= quantity;
					
					int price = this.monster.price * quantity;
					
					System.out.println("재고 : "+ this.monster.stock +", " + "가격 : " + price);
					return new Beverage(monster.name, price, quantity);
					}
				else {
					System.out.println("재고없음");
					 return null;
				}
				
			}
		}
		else if(this.hotsix.name.equals(menuName)) {
			
			if(this.hotsix.name.equals(menuName)) {
				
				if(this.hotsix.stock > quantity)
					{
					this.hotsix.stock -= quantity;
					
					int price = this.hotsix.price * quantity;
					
					System.out.println("재고 : "+ this.hotsix.stock +", " + "가격 : " + price);
					return new Beverage(hotsix.name, price, quantity);
					}
				else {
					System.out.println("재고없음");
					 return null;
				}
				
			}
		}
		else if(this.milkiss.name.equals(menuName)) {
			
			if(this.milkiss.name.equals(menuName)) {
				
				if(this.milkiss.stock > quantity)
					{
					this.milkiss.stock -= quantity;
					
					int price = this.milkiss.price * quantity;
					
					System.out.println("재고 : "+ this.milkiss.stock +", " + "가격 : " + price);
					return new Beverage(milkiss.name, price, quantity);
					}
				else {
					System.out.println("재고없음");
					 return null;
				}
				
			}
		}
		
		
		return null;
	}
	//입고
	public void store(String menuName,int store) {
		
		if(this.bakcas.name.equals(menuName)) {
			bakcas.stock += store;
		}
		else if(this.monster.name.equals(menuName)) {
			monster.stock += store;
		}
		else if(this.hotsix.name.equals(menuName)) {
			hotsix.stock += store;

		}
		else if(this.milkiss.name.equals(menuName)) {
			milkiss.stock += store;
		}

	}
	//재고
	public void stock(String menuName) {
		
		if(this.bakcas.name.equals(menuName)) {
			System.out.println(menuName + "재고 : "+ bakcas.stock);
		}
		else if(this.monster.name.equals(menuName)) {
			System.out.println(menuName + "재고 : "+ monster.stock);
		}
		else if(this.hotsix.name.equals(menuName)) {
			System.out.println(menuName + "재고 : "+ hotsix.stock);

		}
		else if(this.milkiss.name.equals(menuName)) {
			System.out.println(menuName + "재고 : "+ milkiss.stock);
		}
		
	}

}
