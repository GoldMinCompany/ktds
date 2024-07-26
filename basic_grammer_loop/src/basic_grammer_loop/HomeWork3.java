package basic_grammer_loop;

public class HomeWork3 {

	public static void main(String[] args) {
		
		/* i가 0부터 시작하고 j가 i+1보다 작을 때까지 "*" 반복 후 한 줄을 띄운다.
		 * 
		 */
		for(int i=0; i<5; i++) {
			
			for(int j=0; j<i+1; j++) {
				
				System.out.print("*");
				
			}
			
		System.out.println();
		
		}

	}

}
