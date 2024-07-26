package com.ktdsuniversity.edu.interfaceexam.animals.interfaces;

//인터페이스만 상속할 수 있다.
public interface Human extends Move, Eat {

	public void work();
	public void speak();
	public void think();
	
	
}
