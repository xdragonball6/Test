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
			for(int j=1; j<=i; j++) { //j는 한 행의 숫자 갯수와 열의 숫자 갯수가 같다면 줄을 바꿔서 출력하게 만드는 녀석
			num+=1;
			System.out.print(num);
		}
		System.out.println("");
	}
	}
}
