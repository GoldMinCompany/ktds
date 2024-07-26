package com.ktdsuniversity.edu.interfaceexam.animals;

import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Bark;
import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Eat;
import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Fly;
import com.ktdsuniversity.edu.interfaceexam.animals.interfaces.Move;

public class Main {
	
	
	public static void flying(Fly fly) {
		
		fly.fly();
		
	}
	
	public static void moving(Move move) {
		
		move.run();
		move.walk();
		
	}
	
	
	public static void eating(Eat eat) {
		
		eat.eat();
		
	}
	
	public static void barking(Bark bark) {
		
		bark.bark();
		
	}
	
	
	public static void main(String[] args) {
		
		//상속 is a -> sub class is a super class
		//인터페이스 : is a -> instance is a interface
		//Dog class -> Move, Eat, Bark
		//Dog의 타입이 Move, Eat Bark가 될 수 있다.
		
		Dog ppoppy = new Dog("뽀삐");

		ppoppy.walk();
		ppoppy.run();
		ppoppy.eat();
		ppoppy.bark();
		
		Eat eat = ppoppy;
		eat.eat();
		
		Move move = ppoppy;
		move.walk();
		move.run();
		
		Bark bark = ppoppy;
		bark.bark();
		
		
		//flying은 Dog에서 정의하지 않았으므로, 실행되지 않는다.
		//flying(ppoppy);
		Main.eating(ppoppy);
		Main.barking(ppoppy);
		Main.moving(ppoppy);

		
		Bird 비둘기 = new Bird("구구");
		
		비둘기.walk();
		비둘기.run();
		비둘기.eat();
		비둘기.bark();
		
		Main.flying(비둘기);
		Main.eating(비둘기);
		Main.barking(비둘기);
		Main.moving(비둘기);
		
		Chicken 닭 = new Chicken("꼬꼬");
		닭.walk();
		닭.run();
		닭.eat();
		닭.bark();
		
		Main.flying(닭);
		Main.eating(닭);
		Main.barking(닭);
		Main.moving(닭);
		
		Duck duck = new Duck("덕덕");
		
		duck.fly();
		
		Person kim = new Person("김");
		kim.eat();
		kim.speak();
		kim.think();
		kim.walk();
		kim.work();
		
		// flying(kim);
		// barking(kim);
		moving(kim);
		eating(kim);
		
		
	}
}
