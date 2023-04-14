package com.javalec.base;

import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 더하기 할 숫자들의 개수를 정한 후 숫자를 입력 받아서 입력한 숫자의 합을 구하는 프로그램 작성
		Scanner scanner=new Scanner(System.in);
		
		
		int whtnum= 0;//몇개 숫자를 더할지 정하기
		int tot=0; //총합
		
		System.out.print("몇개의 숫자를 더할까요 ? :" );
		whtnum=scanner.nextInt();
		
		System.out.println(whtnum+"의 숫자를 입력하세요.");
		for(int i=1; i<=whtnum; i++ ) {
			System.out.println(i); //이건 1~i의 숫자를 나타냄
			tot+=i;
				
		}
			System.out.println("입력한 숫자의 합은"+tot+"입니다.");
	
	
	
	}
}
