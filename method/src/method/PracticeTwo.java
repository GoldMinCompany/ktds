package method;

public class PracticeTwo {
	
	public static int convertToMinutes(int processTime) {
		final int MINUTES = 60;
		return processTime / MINUTES;
		
	}
	
	public static int converToSeconds(int processTime) {
		final int MINUTES = 60;
		return processTime % MINUTES;
	}
	
	
	public static void main(String[] args) {
		
		int processTime = 145;
		int minutes = 0;
		int seconds = 0;
		
		minutes = convertToMinutes(processTime);
		seconds = converToSeconds(processTime);
		
		System.out.println(minutes+"분 "+ seconds + "초");
		
		
		
	}

}
