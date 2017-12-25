package com.dgtech.learning.mavenGitDemo;

public class MathDemo {
	
	private int int1=0;
	private int int2=0;
	
	public MathDemo(int int1, int int2) {
		super();
		this.int1 = int1;
		this.int2 = int2;
	}
	
	public int addInts() {
		return int1+int2;
	}
	

	public int substractInts() {
		return int1-int2;
	}
	
	public int multInts() {
		return int1*int2;
	}
	
	public int divideInts() {
		return int1/int2;
	}
}
