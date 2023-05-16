package com.javalec.funtion;

public class Caculation {
	
	int num1;
	int num2;
	
	public Caculation() {
		// TODO Auto-generated constructor stub
	}

	public Caculation(String num1, String num2) {
		super();
		this.num1 = Integer.parseInt(num1);
		this.num2 = Integer.parseInt(num2);
	}
	
	
	public String add() {
		return Integer.toString(num1+num2);
		}

	public String sub() {
		return Integer.toString(num1-num2);
	}
	public String mul() {
		return Integer.toString(num1*num2);
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
