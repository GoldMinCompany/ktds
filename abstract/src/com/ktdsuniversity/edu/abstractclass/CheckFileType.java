package com.ktdsuniversity.edu.abstractclass;

/**
 * 파일의 확장자를 확인하는 기능.
 */
public class CheckFileType extends AbstractFileTypeChecker {
	
	/**
	 * 확장자를 가지고 있는 파일의 이름
	 * 확장자를 체크 하려는 파일의 정보
	 */
	
	public CheckFileType(String fileName) {
		super(fileName);
	
	
	}
	
	@Override
	public boolean compareType() {
		
		return this.fileName.toLowerCase().endsWith(".jpg");
	}
}
