package basic_grammer_loop;

public class ForSyntax {

	public static void main(String[] args) {
		/*
		 * for(초기값; 반복조건; 증감식){
		 * 		반복할 코드
		 * }
		 */
		
		for(int i=1; i<101; i++) {
			
			//System.out.println(i);
			
		}
		
		/*
		 * 1. 1부터 1000까지 합 출력
		 * 2. 1부터 100 중 짝수의 합 출력
		 */
		
		int sum = 0;
		for(int i=1; i<1001; i++) {
			//System.out.println(i);
			sum += i;
			
		}
		
		System.out.println("총합 : " + sum);
		
		sum = 0;
	
		for(int i=1; i<101; i++) {
			
			if(i % 2 == 0) {
				//System.out.println(i);
				sum += i;
			}
			
		}
		
		System.out.println("총합 : " + sum);
		
		//
		sum = 0;
		for(int i=2; i<101; i += 2) {
			
			sum += i;
			
		}
		System.out.println("총합 : "+ sum);
		
		// 3. 구구단 3단을 출력
		for(int i=3; i<4 ; i++) {
			for(int j=1; j<10; j++) {
				
				System.out.println(i+" X "+j+" = "+ i*j);
				
			}	
		}
		// 4.
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++){
				
				System.out.println(i+" X "+j+" = "+ i*j);
			}
			System.out.println();
			
		}
		// 5. Scanner를 이용해서, 출력하고 싶은 구구단 수를 입력받으면
		//    해당 구구단이 출력되는 코드
		//    1 ~ 9 <-- Scanner를 이용해서 보고 싶은 곱할 수를 입력받는다. 
		//    예시 단수 : 10, 곱할 수 : 20
		
		
		
		
		
		
		
		
	}

}
