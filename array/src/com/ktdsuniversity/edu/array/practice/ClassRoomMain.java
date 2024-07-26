package com.ktdsuniversity.edu.array.practice;

public class ClassRoomMain {

	public static void main(String[] args) {
		
		ClassRoom classRoom = new ClassRoom(5);
		
		classRoom.getStudent(0, new Student(100, 100, 100, 100));
		classRoom.getStudent(1, new Student(100, 100, 100, 100));
		classRoom.getStudent(2, new Student(100, 100, 100, 100));
		classRoom.getStudent(3, new Student(100, 100, 100, 100));
		classRoom.getStudent(4, new Student(100, 100, 100, 100));
		
		
		int sumScore = classRoom.getSumAllScores();
		double average = classRoom.getAverage();
		double courseCredit = classRoom.getCourseCredit();
		String grade = classRoom.getABCDEF();
		
		System.out.println("합계 : " + sumScore);
		System.out.println("평균 : " + average);
		System.out.println("학점 : " + courseCredit);
		System.out.println("등급 : " + grade);
	}

}
