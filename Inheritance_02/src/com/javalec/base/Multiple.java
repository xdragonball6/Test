package com.javalec.base;

public class Multiple extends Minus {

	// Field

	
	
	
	// Constructor
	public Multiple() {
		// TODO Auto-generated constructor stub
	}
	public Multiple(int firstNum, int secondNum) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}






	// Method
	public void mul() {
		System.out.println(firstNum+"X"+secondNum+"="+(firstNum*secondNum));
	}
}
