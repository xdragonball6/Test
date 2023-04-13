package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// 배열 평균 구하기
		int sum=0;
		double ave=0;
		int[] intNum= {1,5,8,12,200,1002};
		for(int i=0; i<intNum.length; i++) {
			sum+=intNum[i];
			
		}
		ave=(double)sum/intNum.length;
		System.out.println(ave);
	}

}
