package com.javalec.function;

public class Sum {

	// Field
	
	int num1;
	int num2;
	int inputnum1;
	int inputnum2;
	int sum;
	// Constructor
	public Sum() {
		// TODO Auto-generated constructor stub
	}



	public Sum(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 =num2;
	}
	
	
	
	
	// Method
	public String sum() {
		String result;
			if(num1>num2) {
				num1=inputnum2;
				num2=inputnum1;
			}
		for(int i=num1; i<=num2; i++) {
			sum+=i;
		}
		return result=Integer.toString(sum);
	}
	
	
	
}
