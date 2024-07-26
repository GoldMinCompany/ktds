package method;

public class SimpleParameter {
	
	public static void printHello(String name, String message) {
		
		System.out.println(name + "씨, "+ message);
		
	}

	public static void main(String[] args) {
		
		printHello("불안이", "안녕하세요?");
		printHello("당황이", "반갑습니다?");
		printHello("따분이", "안녕?");
		printHello("부럽이", "안녕히가세요.");
		printHello("기쁨이", "부러워요.");
		
	}

}
