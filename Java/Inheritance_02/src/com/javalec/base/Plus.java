package com.javalec.base;

public class Plus {

	// Field
	String plussStr="Plus class";
	int firstNum;
	int secondNum;
	int result;
	
	
	
	// Constructor
	public Plus() {
		// TODO Auto-generated constructor stub
	}
	public Plus(int firstNum, int secondNum) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	
	
	
	}
	// Method
	public void plus() {
		result=firstNum+secondNum;
		System.out.println(firstNum+"+"+secondNum+"="+result);
	}
}
