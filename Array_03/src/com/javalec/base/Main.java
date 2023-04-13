package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// 구구단 출력하기
		int[] dan = {5,3,9,7,8};
		for(int i=0; i<dan.length; i++) {
			System.out.println(dan[i]);
			for(int num =1; num<=9; num++) {
				System.out.println(dan[i] + " X " + num + " = "+(dan[i]*num));
			}
		}
	
		String[]str = {"Sun","Mon","Tue","Wed","Thr","Fri","Sat"};
		int[]intNum = {10,20,30};
		double[]doubleNum= {1.1,1.2};
		boolean[]boolNum= {true,false,true,false};
		
		// str 전체 출력해보기
		for(int j=0; j<str.length; j++) {
			System.out.println(str[j]);
			}
		
		// intNum 합계 구하기
			
		int sum=0;
		for(int j=0; j<intNum.length; j++) {
			sum+=intNum[j];
		}
		System.out.println(sum);
		
		
		// doubleNum의 평균 구하기
		double sum01=0;
		for(int k=0; k<doubleNum.length; k++) {
			sum01+=doubleNum[k];
		}
		System.out.println(sum01/doubleNum.length);
		
		// boolNum true의 갯수 출력하기
		int trueCount = 0;
		for (int i=0; i<boolNum.length; i++) {
			if(boolNum[i]==true) { //true인 경
				trueCount++; // trueCount를 1 증가
			}
		}

		System.out.println("true의 개수: " + trueCount);
		 
	}

}
