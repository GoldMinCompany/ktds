package com.ktdsuniversity.edu.array;

public class Zoo {
	public static void main(String[] args) {
		
		Animal[] animals = new Animal[3];
		
		animals[0] = new Animal("고양이", "뽀냥");
		animals[1] = new Animal("강아지", "봄이");
		
		animals[0].printMyInformation();
		animals[1].printMyInformation();
		animals[2].printMyInformation();
	}

}
