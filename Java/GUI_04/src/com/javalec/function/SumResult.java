package com.javalec.function;

public class SumResult {

	// Field
	int inputNum;
	int sum;
	// Constructor
	public SumResult(int inputNum) {
		super();
		this.inputNum = inputNum;
	}
	
	
	
	//Method
	public void sumResult() {
		String result;
		while(inputNum > 0) {
			sum += inputNum % 10;
			inputNum /= 10;
			result=Integer.toString(sum);
			}
		}
}