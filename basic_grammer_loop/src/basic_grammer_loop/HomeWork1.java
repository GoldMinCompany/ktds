package basic_grammer_loop;

public class HomeWork1 {

	public static void main(String[] args) {
		
		int money = 10_000; // 손님이 가지고 있는 돈
		int price = 18_000; // 
		int temp = price;
		
		if(money >= price) {
			System.out.println("관람 가능");
			System.out.println(Math.abs(temp));
		}
		else {
			System.out.println("관람 불가능");
			temp -= price;
			System.out.println("모자란 금액 : "+ temp);
		}

	}

}
