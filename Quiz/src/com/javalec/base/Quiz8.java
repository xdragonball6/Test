package com.javalec.base;

 import java.util.Scanner;

 public class Quiz8 {
	 
	 public static void main(String[] args) {
		 
		 
		 
		 
		 //입력한 한 자릿수 정수의 합을 구하는 프로그램을 작성하라.
		 
		 Scanner scanner=new Scanner(System.in);

		
		 int sum=0; //나머지를 다 더한
		 int remainder=0; //나머지
		 int inputValue=0;//입력될 숫자
		 int calcValue=0; //while문에서 저장되게 다르게 치환
		 
		 System.out.print("Enter an iterger(0~9) :");
		 inputValue=scanner.nextInt();
		 
		 calcValue=inputValue;
		 //10으로 나누고 나온 나머지 값을 마지막에 적고 10으로 나눈 나머지값을 그 다음에 적고 반복되게 만든다.
		 //몫이 0이 아니면 반복되게 만든다
		 //예를들어 1234567을10으로 나누면 7이 남을거고 그 다음 123456을 10으로 나누면 6이 남을거고 12345를 10으로 나누면 5가 나올거야 그러니까 나머지값을 계속 나오게 하고 다 더해봐
		 
		 while(calcValue !=0) { //while에서 숫자를 적은 뒤 !를 적으면 예외시킨다는 뜻을 지니고 있음
			remainder= calcValue%10;
			sum+=remainder;
			calcValue=calcValue/10;
		 }
		 System.out.println("sum of digits = "+sum);
		 
	 
	 
	 
	 
	 
	 
	 
	 
	 }
			 
 	}

