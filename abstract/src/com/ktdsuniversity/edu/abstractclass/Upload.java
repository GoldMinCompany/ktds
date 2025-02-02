package com.ktdsuniversity.edu.abstractclass;

public class Upload {

	public static void main(String[] args) {
		
		//추상 클래스는 인스턴스로 만들 수 없다. 반드시 상속을 통해서만 인스턴스를 만들어질 수 있다.
		//AbstractFileTypeChecker testChecker = new AbstractFileTypeChecker("pic.png");
		
		//1. 확장자만 체크하기
		AbstractFileTypeChecker checkFileType1 = new CheckFileType("pic.jpg");
		AbstractFileTypeChecker checkFileType2 = new CheckFileType("pic.xlsx");
		
		boolean isImageFile1 = checkFileType1.isImageFile();
		boolean isImageFile2 = checkFileType2.isImageFile();
		
		System.out.println(isImageFile1);
		System.out.println(isImageFile2);
		
		//2. 마임타임만 체크하기
		
		AbstractFileTypeChecker checkMimeTypeFile1 = new CheckFileMimeType("pic.zip");
		AbstractFileTypeChecker checkMimeTypeFile2 = new CheckFileMimeType("pic.exe");
		
		boolean isImageFile3 = checkMimeTypeFile1.isImageFile();
		boolean isImageFile4 = checkMimeTypeFile2.isImageFile();
		
		System.out.println(isImageFile3);
		System.out.println(isImageFile4);
		
		//3. 확장자와 마임타임 모두 체크하기
		
		AbstractFileTypeChecker checkFileTypeAndMimeType1 = new CheckFileTypeAndMimeType("pic.jpg");
		AbstractFileTypeChecker checkFileTypeAndMimeType2 = new CheckFileTypeAndMimeType("pic.mp3");
		
		boolean isImageFile5 = checkFileTypeAndMimeType1.isImageFile();
		boolean isImageFile6 = checkFileTypeAndMimeType2.isImageFile();
		
		System.out.println(isImageFile5);
		System.out.println(isImageFile6);

	}

}
