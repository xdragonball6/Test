package com.javalec.base;

public class Minus extends Plus {

	// Field
		
		
		
	// Constructor
		public Minus() {
			// TODO Auto-generated constructor stub
		}
		public Minus(int firstNum, int secondNum) {
			super();
			this.firstNum = firstNum;
			this.secondNum = secondNum;
		}





		// Method
		public void minus() {
			System.out.println(firstNum+"-"+secondNum+"="+(firstNum-secondNum));
		}
	}

