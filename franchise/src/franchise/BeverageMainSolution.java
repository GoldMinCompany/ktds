package franchise;

public class BeverageMainSolution {

	public static void main(String[] args) {
		
		BeverageSolution bacchas = new BeverageSolution("박카스", 900, 15);
		BeverageSolution monster = new BeverageSolution("몬스터", 1500, 20);
		BeverageSolution hotsix  = new BeverageSolution("핫식스", 1300, 10);
		BeverageSolution milkiss = new BeverageSolution("밀키스", 1400, 5);
		
		
		BeverageVendingMachineSolution bvms = new BeverageVendingMachineSolution(bacchas, monster, hotsix, milkiss);

		
		bvms.printStock();
		BeverageSolution myItem = bvms.selectItemButton("스타벅스 더블샷", 2000);
		System.out.println(myItem);
		//System.out.println(myItem.name);
		
		BeverageSolution mySecondItem = bvms.selectItemButton("밀키스", 3);
		System.out.println(mySecondItem);
		System.out.println("구매한 상품의 이름 : "+mySecondItem.name);
		System.out.println("구매한 상품의 가격 : "+mySecondItem.price);
		System.out.println("구매한 상품의 개수 : "+mySecondItem.stock);
		
		bvms.printStock();
		
		bvms.selectItemButton("밀키스", 10);
		bvms.printStock();
		
		
		
		BeverageSolution myThirdItem = bvms.selectItemButton("밀키스", 3);
		System.out.println(myThirdItem);
		//System.out.println("구매한 상품의 이름 : "+myThirdItem.name);
		//System.out.println("구매한 상품의 가격 : "+myThirdItem.price);
		//System.out.println("구매한 상품의 개수 : "+myThirdItem.stock);
		
		bvms.fillItem("밀키스", 10);
		bvms.printStock();
		
	}

}
