package com.ktdsuniversity.edu.array;

import java.util.Random;

public class Hello {
	public static void main(String[] args) {
		
		Random random = new Random();	
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = random.nextInt(45)+1;
			
			for(int j=0; j< i ; j++) {
				
				if(lotto[i]==lotto[j]) {
					System.out.println("중복된 숫자입니다. " + lotto[j]);
					
				}
				
				
			}
			
		}
		
		
	}
}
