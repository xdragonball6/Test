package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1에서 10까지를 출력
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		
		//for는 가로 안에 반복되는것
//		for (int i=1; i<=100; i++) {
//			System.out.println(i);
//		}
		
//		for (int i = 1; i<=9; i++) {
//			System.out.println("2 X " + i + " = " + (2*i));
			
//		}
		
		// 1부터 10까지의 합계
//		int sum = 0;
		
//		for (int i = 1; i<=10; i++) {
//			sum+=i;
//		}
		
//		System.out.println("1~10까지의 합계 :"+ sum);
		
		// 범위의 합계 구하기
		
		int sum = 0;
		int startNum=0;
		int endNum=0;
				
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 :");
		startNum = scanner.nextInt();
		System.out.print("두번째 숫자를 입력하세요 :");
		endNum = scanner.nextInt();
		
		for (int i = startNum; i<=endNum; i++) {
			sum+=i;
		}
		
		System.out.println(startNum + "~" + endNum +" 합계:" + sum);
	
	
	}

}