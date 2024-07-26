package com.ktdsuniversity.edu.interfaceexam;

public class Test {

	public static void main(String[] args) {
		
		Calculator ssCalc = new SamsungCalc();
		Calculator lgCalc = new LgCalc();
		Calculator appleCalc = new AppleCalc();
		
		
		int addResult = ssCalc.add(10, 20);
		int subResult = ssCalc.sub(10, 5);
		int mulResult = ssCalc.mul(6, 7);
		double divResult = ssCalc.div(10, 3);
		
		
		System.out.println("SamsungCalc : " + addResult);
		System.out.println("SamsungCalc : " + subResult);
		System.out.println("SamsungCalc : " + mulResult);
		System.out.println("SamsungCalc : " + divResult);
		
		addResult = lgCalc.add(10, 20);
		subResult = lgCalc.sub(10, 20);
		mulResult = lgCalc.mul(10, 20);
		divResult = lgCalc.div(10, 20);
		
		System.out.println("LgCalc : " + addResult);
		System.out.println("LgCalc : " + subResult);
		System.out.println("LgCalc : " + mulResult);
		System.out.println("LgCalc : " + divResult);
		
		addResult = appleCalc.add(10, 20);
		subResult = appleCalc.sub(10, 20);
		mulResult = appleCalc.mul(10, 20);
		divResult = appleCalc.div(10, 20);
		
		System.out.println("AppleCalc : " + addResult);
		System.out.println("AppleCalc : " + subResult);
		System.out.println("AppleCalc : " + mulResult);
		System.out.println("AppleCalc : " + divResult);
	}

}
