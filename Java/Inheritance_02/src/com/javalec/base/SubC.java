package com.javalec.base;

public class SubC extends AddC{
	
	
	public SubC() {
		// TODO Auto-generated constructor stub
	}

	public SubC(int num1, int num2) {
		super(num1, num2);
		// TODO Auto-generated constructor stub
	}
	
	public void sub() {
		System.out.println(num1-num2);
	}
}
