package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String
		String str1="a";
		
		long startTime1 = System.currentTimeMillis();
		for(int i=1; i<=500000; i++) {
			str1=str1+"a";
		}
		long endTime1 = System.currentTimeMillis();
		
		System.out.println("Term1 :" +(endTime1-startTime1));
	
		//-----
		// StringBuilder
		StringBuilder stringBuilder=new StringBuilder("a");
		
		long startTime2=System.currentTimeMillis();
		for(int i=1; i<500000; i++) {
			stringBuilder.append("a");
		}
		long endTime2=System.currentTimeMillis();
		
		System.out.println("Term2 :" +(endTime2-startTime2));
	
	
	}

}
