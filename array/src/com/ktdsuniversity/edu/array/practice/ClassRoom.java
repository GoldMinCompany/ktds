package com.ktdsuniversity.edu.array.practice;

public class ClassRoom {
	private Student[] student;
	
	//생성자를 통해 한 학급의 학생 수를 설정한다. 
	public ClassRoom(int count) {

		this.student = new Student[count];
		
	}
	
	//student Getter
	//배열은 인덱스를 통해 접근하므로, 매개변수로 인덱스값과 Student 클래스를 설정한다.
	public void getStudent(int index, Student student) {
		
		this.student[index] = student;
		
	}

	public int getSumAllScores() {

		int sum = 0;

		for (int i = 0; i < student.length; i++) {

			sum += student[i].getSumAllScores() / 4;
		}
		return sum;

	}
	
	
	public double getAverage() {

		return (double) Math.round(getSumAllScores() * 10) / 10 / student.length;

	}

	public double getCourseCredit() {

		return (getAverage() - 55) / 10;

	}

	public String getABCDEF() {

		String grade = null;

		if (getCourseCredit() >= 4.1) {
			grade = "A+";
		} else if (getCourseCredit() >= 3.6) {

			grade = "A";
		} else if (getCourseCredit() >= 3.1) {

			grade = "B+";
		} else if (getCourseCredit() >= 2.6) {

			grade = "B";
		} else if (getCourseCredit() >= 1.6) {

			grade = "C";
		} else if (getCourseCredit() >= 0.6) {

			grade = "D";
		} else {

			grade = "F";
		}

		return grade;
	}

}
