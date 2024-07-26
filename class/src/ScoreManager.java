
/**
 * 클래스의 멤버변수 혹은 클래스의 메소드를 사용하기 위해서는 반드스 클래스를 변수로 생성해야한다. 
 * 
 */
public class ScoreManager {
	
	Student kim;
	Student lee;
	Student park;
	Student choi;
	
	public int getSum() {
		return kim.getSum()+lee.getSum()+park.getSum()+choi.getSum();
	}
	
	public double getAverage() {
		
		return getSum() / 4.0;
		
	}
	
	
	public static void main(String[] args) {
		
		ScoreManager manager = new ScoreManager();
		
		manager.kim = new Student();
		manager.kim.korScore = 100;
		manager.kim.engScore = 90;
		manager.kim.mathScore = 85;
		
		
		manager.lee = new Student();
		manager.lee.korScore = 85;
		manager.lee.engScore = 90;
		manager.lee.mathScore = 95;
		
		
		manager.park = new Student();
		manager.park.korScore = 75;
		manager.park.engScore = 80;
		manager.park.mathScore = 90;
		
		
		manager.choi = new Student();
		manager.choi.korScore = 85;
		manager.choi.engScore = 65;
		manager.choi.mathScore = 100;
		
		int sum = manager.getSum();
		double avg = manager.getAverage();
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 점수 : " + avg);
		
	}

}
