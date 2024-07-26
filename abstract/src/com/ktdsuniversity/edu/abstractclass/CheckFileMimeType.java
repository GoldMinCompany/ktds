package com.ktdsuniversity.edu.abstractclass;

import java.util.Random;

public class CheckFileMimeType extends AbstractFileTypeChecker {
	
	
	
	public CheckFileMimeType(String fileName) {
		super(fileName);
	}
	
	private String getMimeTypeOfFile() {
		
		String[] mimeTypes = {"image/jpeg","image/gif","audio/mp3", "video/avi"};
		Random random = new Random();
		
		return mimeTypes[random.nextInt(mimeTypes.length)];
		
		
	}
	/**
	 * 추상 클래스에 포함되어 있는 추상 메소드
	 * 서브 클래스에서 반드시 Override 한다. 
	 */
	@Override
	public boolean compareType() {
		
		String mimeTypeOfFile = getMimeTypeOfFile();
		
		boolean isImageFile = mimeTypeOfFile.equals("image/jpeg") || mimeTypeOfFile.equals("image/gif");
		
		System.out.println(fileName + "의 mimeTypes은 " + mimeTypeOfFile + "입니다.");
		
		return isImageFile;
	
	}
}
