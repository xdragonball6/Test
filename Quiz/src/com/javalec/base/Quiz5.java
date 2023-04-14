package com.javalec.base;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	숫자 삼각형에 프로그램 작성
		int prNum=0; //피라미드 몇단계로 할지 정하는 숫자
		int num=0;
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("몇 단계의 피라미드로 구성할까? :");
		prNum=scanner.nextInt();
		
		for(int i=1; i<=prNum; i++) { //i는 피라미드를 세어주는 숫자
			num+=i;
			System.out.print(num);
		for(int j=0; j<=i; j++) { //j는 한 행의 숫자 갯수와 열의 숫자 갯수가 같다면 줄을 바꿔서 출력하게 만드는 녀석
		}
		System.out.println("");
	}
	}
}
