package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1= 123;
		String str1="12345";
		
		// 문자를 숫자로 바꾸기
		int num2 = Integer.parseInt(str1);
		System.out.println(num1+num2);
		
		// 숫자를 문자로 바꾸기
		String str2 = Integer.toString(num1);
		System.out.println(str1+str2);
	}

}
