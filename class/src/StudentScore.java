
public class StudentScore {
	
	int java;
	int python;
	int cpp;
	int csharp;
	
	
	public int getSumAllScores() {
		
		int sum = java + python + cpp + csharp;
		
		return sum;
	}
	
	public double getAverage() {
		
		double avg = (double) getSumAllScores() / 4;
		
		return avg;
		
	}
	
	public double getCourseCredit() {
		
		double courseCredit = getAverage();
		return (courseCredit - 55) / 10;
		
	}
	
	
	public String getABCDEF() {
		
		double courseCredit = getCourseCredit();
		
		String grade = null;
		if(courseCredit >= 4.1) {
			grade = "A+";
		}
		else if(courseCredit >= 3.6) {
			grade = "A";
		}
		else if(courseCredit >= 3.1) {
			grade = "B+";
		}
		else if(courseCredit >= 2.6) {
			grade = "B";
		}
		else if(courseCredit >= 1.6) {
			grade = "C";
		}
		else if(courseCredit >= 0.6) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		
		
		return grade;
		
	}
	

}
