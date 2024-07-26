package method;

public class PracticeFour {
	
	public static int sumScore(int korScore, int engScore, int mathScore, int progScore) {
		
		return korScore + engScore + mathScore + progScore;
		
	}
	
	public static double getAverage(int sum, int subjectCount) {
		
		return (double) sum / subjectCount;
	}
	
	public static String getGrade(double average) {
		
		String grade = null;
		
		if(average >= 95) {
			grade = "A+";
			return grade;
		}
		else if(average >=90) {
			grade = "A";
			return grade;
			
		}
		else if(average >=85) {
			grade = "B+";
			return grade;
		}
		else if(average >=80) {
			grade = "B";
			return grade;
			
		}
		else if(average >=70) {
			grade = "C";
			return grade;
		}
		else{
			grade = "F";
			return grade;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		int korScore = 90;
		int engScore = 88;
		int mathScore = 70;
		int progScore = 80;
		
		int sum = sumScore(korScore, engScore, mathScore, progScore);
		System.out.println("총합 : "+ sum);
		
		double average = getAverage(sum, 4);
		System.out.println("평균 : "+ average);
		
		
		String grade = null;
		grade = getGrade(average);
		System.out.println("성적 : " + grade);
	
	}

}
