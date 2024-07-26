package com.ktdsuniversity.edu.abstractclass;

public abstract class AbstractFileTypeChecker {
	
	protected String fileName; // 상속 클래스, 본인 클래스에서 사용 가능
 	
	public AbstractFileTypeChecker(String fileName) {
		
		this.fileName = fileName;
	
	}
	
	public boolean isImageFile() {
		
		return compareType();
		
	}
	
	public abstract boolean compareType();
}
