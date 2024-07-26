package method;

public class PracticeOne {
	
	public static int convertToTime(int minutes, int seconds) {
		
		return minutes * 60 + seconds;
	}
	
	public static void main(String[] args) {
		
		int minutes = 5;
		int seconds = 50;
		int time = 0;
		
		time = convertToTime(minutes, seconds);
		
		System.out.println(time + "초");
		
	}

}
