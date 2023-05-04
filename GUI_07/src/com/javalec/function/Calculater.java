package com.javalec.function;

public class Calculater {

	//Field
	int num1;
	int num2;
	
	
	//Constructor
	public Calculater() {
		// TODO Auto-generated constructor stub
	}
	
	public Calculater(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	public int add() {
		return num1+num2;
		}

	public int sub() {
		return num1-num2;
	}
	public int mul() {
		return num1*num2;
	}
	public String div() {
		String result;
		if(num2==0) {
			result ="Imposiblse";
		}else {
			result=String.format("%.3f",(double)num1/num2);
		}
		return result;
		
	}
}
