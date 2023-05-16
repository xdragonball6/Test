package com.javalec.base;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//몇 개의숫자를 입력한지 결정한 후 숫자를 입력하고 이중 필요없는 숫자의 위치를 정해 삭제
		
		Scanner scanner= new Scanner(System.in);
		int inputNum=0;//입력할 숫자의 갯수
		int where=0;//몇번째 숫자
		//입력하기
		System.out.println("입력할 숫자의 갯수? :");
		inputNum=scanner.nextInt();
		
		int[] numbers=new int[inputNum];// 입력받은 숫자로 정하기
		System.out.println(inputNum+"개의 숫자를 입력하세요! :");
		for(int i=0; i<=inputNum-1; i++) {
			System.out.println((i+1)+"의 숫자 :");
			numbers[i]=scanner.nextInt();
		}
		System.out.println("몇번째 숫자를 삭제 하시겠습니까? :");
		where=scanner.nextInt();
		for(int i=where; i<=numbers.length-1; i++) {
			numbers[i-1]=numbers[i];
			}
		System.out.println("----결과-----");
		for(int i=0; i<numbers.length-1; i++) {
			System.out.println(numbers[i]);
		}
			
		
	}
}