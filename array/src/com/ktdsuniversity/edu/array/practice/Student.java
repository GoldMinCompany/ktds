package com.ktdsuniversity.edu.array.practice;

public class Student {
	
	private int java;
	private int python;
	private int cpp;
	private int csharp;
	
	public Student(int java, int python, int cpp, int csharp) {
		
		this.java = java;
		this.python = python;
		this.cpp = cpp;
		this.csharp = csharp;
		
	}
	
	public int getSumAllScores() {
		return this.java + this.python + this.cpp + this.cpp ;
	}
	
	public double getAverage() {
		return (double) getSumAllScores() / 4;
	}
	
	public double getCourseCredit() {
		return (getAverage() - 55) / 10;
	}
	
	public String getABCDEF() {
		
		String grade = null;
		
		if(getCourseCredit() >= 4.1) {
			
			grade = "A+";
			
		}
		else if(getCourseCredit() >= 3.6) {
			
			grade = "A";
			
		}
		else if(getCourseCredit() >= 3.1) {
			
			grade = "B+";
			
		}
		else if(getCourseCredit() >= 2.6) {
			
			grade = "B";
			
		}
		else if(getCourseCredit() >= 1.6) {
			
			grade = "C";
			
		}
		else if(getCourseCredit() >= 0.6) {
			
			grade = "D";
			
		}
		else {
			
			grade = "F";
		}
		
		return grade;
		
	}
	
	

}
