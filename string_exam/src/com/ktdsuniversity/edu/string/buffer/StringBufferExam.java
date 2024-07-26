package com.ktdsuniversity.edu.string.buffer;

public class StringBufferExam {
	
	
	public static void hugeStringConcat() {
		
		StringBuffer sb = new StringBuffer();
		
		
		for(int i=0; i<100000; i++) {
			
			sb.append("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."); 
			
		}
		
		String dummyText = sb.toString();
		
		System.out.println(dummyText);
		
	}
	
	public static void basicSyntax() {
		// 문자열 버퍼(문자열 임시공간)
		// 얼마나 많은 문자열이 할당 될지 모르기 때문에
		// 미리 메모리 공간을 널널하게 준비한다. 
		StringBuffer sb = new StringBuffer(); 
		
		// 1. 버퍼에 문자열 추가
		sb.append("첫 번째 문자열\n");
		sb.append("두 번째 문자열\n");
		sb.append("세 번째 문자열\n");
		
		// 버퍼에 들어있는 내용을 String 타입의 인스턴스로 변환
		// String 타입의 dummy 변수가 생성되었으므로, 메모리 주소가 바뀌지만, toString()만 한 경우 메모리 주소가 바뀌지 않는다. 
		String dummy = sb.toString();
		System.out.println(dummy);
	}
	
	
	public static void main(String[] args) {
		
		StringBufferExam.basicSyntax();
		StringBufferExam.hugeStringConcat();
		
	}
}
