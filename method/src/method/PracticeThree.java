package method;

public class PracticeThree {
	
	public static int convertToFahrenheit(int celsius) {
		
		return (celsius * 9 / 5) + 32;
		
	}
	
	public static void main(String[] args) {
		
		int celsius = 30;
		int fahrenheit = 0;
		
		fahrenheit = convertToFahrenheit(celsius);
		
		System.out.println("섭씨 : " + celsius);
		System.out.println("화씨 : " + fahrenheit);
		
	}

}
