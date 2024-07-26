package method;

public class PracticeFive {
	
	public static int travelExpenses(int age) {
		
		final int adultOneWayFlightFare = 300_000;
		final int kidOneWayFlightFare = 120_000;
		
		
		final int ADULT_AGE = 19;
		
		if(age >= ADULT_AGE) {
			return adultOneWayFlightFare;
		}
		else {
			return kidOneWayFlightFare;
		}
	}
	
	public static void isTripPossible(int sumtravelExpenses) {
		
		int money = 1_000_000;
		
		if(money >= sumtravelExpenses) {
			
			System.out.println("여행가자!");
			
		}else {
			System.out.println("다음에 가자!");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		int father = 40;
		int mother = 36;
		int daughter = 11;
		
		int sumtravelExpenses = travelExpenses(father) + travelExpenses(mother) + travelExpenses(daughter);
		System.out.println("총 경비 : " + sumtravelExpenses);
		isTripPossible(sumtravelExpenses);
		
		
		
		
	}

}
