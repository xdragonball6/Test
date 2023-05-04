package com.javalec.function;

public class Sum {

	//Field
	int num1;
	int num2;
	
	//Constructor
	public Sum() {
		// TODO Auto-generated constructor stub
	}

	public Sum(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	
	
	//Method
	public int sum() {
	    int sum = 0; // sum 변수를 초기화
	    if (num1 > num2) {
	    	int num;
	        num = num1;
	        num1 = num2;
	        num2 = num;
	    }
	    for(int i=num1; i<=num2; i++) { // num1부터 num2까지의 합을 구함
	        sum += i;
	    }
	    return sum;
	}
	public int even() {
		int sum=0;
		for(int i=num1; i<=num2; i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		return sum;
	}
	
	public int odd() {
	int sum=0;
	for(int i=num1; i<=num2; i++) {
		if(i%2==1) {
			sum+=i;
			}
		}
	return sum;
	}

}