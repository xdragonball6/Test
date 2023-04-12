package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		
//		if(num1 % 2 ==0) {
//			System.out.println("Even");
//		}else {
//			System.out.println("Odd");
//		}
		
		
		switch(num1 % 2) { //switch는 if 대신 깔끔하게 만들어주는 역
		case 0:
			System.out.println("Even");
			break;	//break는 중간에 끊어주는 역할
		case 1:
			System.out.println("Odd");
			break;
		default:
			break;
		}

	}

}
