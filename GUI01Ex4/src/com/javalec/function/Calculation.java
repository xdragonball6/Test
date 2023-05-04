package com.javalec.function;

public class Calculation {

	// Field
	
	String part="";
	int startNum=0;
	int endNum=0;
	
	
	
	// Constructor
	public Calculation() {
		// TODO Auto-generated constructor stub
	}
	public Calculation(String part, int startNum, int endNum) {
		super();
		this.part = part;
		this.startNum = startNum;
		this.endNum = endNum;
	}
	
	
	
	
	// Method
	public int action() {
		int result=0;
		if(part.equals("all")) {
			result=calcAll();
		}else if(part.equals("even")) {
			result=calcEven();
		}else {
			result=calcOdd();
		}
		return result;
	}
	
	private int calcAll() {
		int sum=0;
		for(int i=startNum; i<=endNum; i++) {
			sum+=i;
		}
		return sum;
	}
	
	private int calcEven() {
		int sum=0;
		for(int i=startNum; i<=endNum; i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		return sum;
	}
	
	private int calcOdd() {
		int sum=0;
		for(int i=startNum; i<=endNum; i++) {
			if(i%2==1) {
				sum+=i;
			}
		}
		return sum;
	}
	
	
	
	
	
	
}
