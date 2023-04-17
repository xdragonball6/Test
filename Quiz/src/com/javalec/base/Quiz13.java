package com.javalec.base;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//몇개의 숫자를 입력할지 결정한 후 숫자를 입력하고 입력된 위치에 새로운 숫자를 삽입
		
		Scanner scanner=new Scanner(System.in);
		int switchNum=0;//바꿀 숫자
		int count=0;// 입력할 숫자
		int where=0;//넣고자 하는 위치

		//입력 부분
		System.out.print("입력할 숫자의 갯수? : ");
		count=scanner.nextInt();
		int[] numbers=new int[count]; //n번째 숫자의 숫자를 나타내기
		for(int i=0; i<count; i++) {
			System.out.println((i+1)+"의 숫자 :");
			numbers[i]=scanner.nextInt();
		}
		
		System.out.print("숫자를 삽입하고자 하는 위치는? :");
		where=scanner.nextInt();
		System.out.print("삽입하고자 하는 수는? :");
		switchNum=scanner.nextInt();
		for(int i=where; i<=numbers.length-1; i++) {
			numbers[i-1]=switchNum;
		}
		
			System.out.println("------결과------");
		for(int i=0; i<numbers.length; i++)
			System.out.println(numbers[i]);
		
	}

}
