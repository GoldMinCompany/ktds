
public class ConstructorTestMain {

	public static void main(String[] args) {
		
		/*
		 * 생성자 : 인스턴스를 만들어주는 메소드
		 * 메소드 : 특정 기능을 수행하는 코드 묶음
		 * 메소드 : 특정 기능을 수행하기 위해서 파라미터를 요구할 수 있다.
		 * 메소드 : 기능을 수행한 결과를 반환시킬 수 있다. -> 생성자는 반환타입이 없기 때문에 반환시킬 수 없다. 위의 2가지 기능만 수행할 수 있다.
		 */
		
		ConstructorTest constTest = new ConstructorTest();
		System.out.println(constTest.name);
		constTest.name = "ABC";
		System.out.println(constTest.name);
		constTest.name = "홍길동";
		System.out.println(constTest.name);
		
		ConstructorTest constTest2 = new ConstructorTest("금민규");
		System.out.println(constTest2.name);
	}

}
