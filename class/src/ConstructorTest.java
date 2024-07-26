
public class ConstructorTest {
	
	String name;
	
	//클래스 내부에 어떤 형태의 생성자가 하나라도 있다면, 자바 컴파일러(javac)는 기본형태의 생성자를 생성하지 않는다. 
	public ConstructorTest() {
		
		System.out.println("ConstructorTest 인스턴스 생성");
		name = "Unknown"; //인스턴스가 생성되고, 코드가 실행된다. 
		System.out.println(name);
	}
	
	public ConstructorTest(String name) {
	
		this.name = name;
	}
}
