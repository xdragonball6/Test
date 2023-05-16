package com.javalec.function;

public class Calc {

	// Field
	String part;
	double height;
	int weight;
	double bmi;
	
	
	// Constructor
	public Calc(double height, int weight) {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	// Method
	public String calc() {
	    String message="";
	    if (bmi>=30) {
	        message = "고도비만";
	    } else if (bmi>=25) {
	        message = "비만";
	    } else if (bmi>=23) {
	        message = "과체중";
	    } else if (bmi>=18.5) {
	        message = "정상체중";
	    } else {
	        message = "저체중";
	    }
	    return message;
	}
	
	
}
