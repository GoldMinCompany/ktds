package basic_grammer_loop;

import java.util.Random;

public class WhileSyntax {
	
	public static void main(String[] args) {
		
		/*
		 * int count = 0;
		 * 
		 * while(count < 10) { System.out.println("반복 중"); count ++; }
		 * 
		 * System.out.println("반복 종료");
		 */
		
		//무한 반복문
		// - 사용하면 안되는 기술
		
		/*
		 * while(true) {
		 * 
		 * System.out.println(Math.random());
		 * 
		 * }
		 */
		Random random = new Random();
		int enemyHealthPoint = random.nextInt(Integer.MAX_VALUE); // 0억 ~ 21억
		System.out.println(enemyHealthPoint);
		
		
		while(enemyHealthPoint > 0) {
			
			int damge =random.nextInt(10000); // 0 ~ 9999
			System.out.println(damge);
			System.out.println(enemyHealthPoint);
			enemyHealthPoint -= damge;
			
		}

		
		
	}

}
