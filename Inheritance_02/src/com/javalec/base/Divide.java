package com.javalec.base;

public class Divide extends Multiple {

	// Field
	
	
	// Constructor
	public Divide() {
		// TODO Auto-generated constructor stub
	}

	public Divide(int firstNum, int secondNum) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}
	
	
	// Method
	public void divide() {
		System.out.println(firstNum+"/"+secondNum+"="+((double)firstNum/secondNum));
	}
}
