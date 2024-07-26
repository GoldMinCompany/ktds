package method;

public class ForSyntax {
	
	public static void oneToHundred() {
		
		for(int i=1; i<101; i++) {
			
			System.out.println(i);
			
		}
	}
	
	public static void onToThousandPlus() {
		
		int sum = 0;
		for(int i=1; i<1001; i++) {
			sum += i;
			
		}
		
		System.out.println("총합 : " + sum);
		
	}
	
	public static void evenPlus() {
		
		int sum = 0;
		
		for(int i=1; i<101; i++) {
			
			if(i % 2 == 0) {
				sum += i;
			}
			
		}
				System.out.println("총합 : " + sum);
	}
	
	public static void gugudan() {
		
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++){
				
				System.out.println(i+" X "+j+" = "+ i*j);
			}
					System.out.println();
		}
	}
	

	public static void main(String[] args) {
		
		oneToHundred();
		onToThousandPlus();
		evenPlus();
		gugudan();
		
	}

}
