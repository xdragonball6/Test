package com.javalec.base;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner (System.in);
		
		//입력한 수의 facrotial 구하기(예 4!=4x3x2x1)
		
		int decimal=0; //집어넣을 수
		int factorialNum=1;//팩토리얼 숫자
		
		System.out.print("Input your decimal no. : ");
		decimal=scanner.nextInt();//숫자를 입력해서 decimal의 숫자를 받을거야
		
		for(int i=1; i<=decimal; i++ ) { //i가 입력받은 숫자 decimal의 값이 될때까지 i를 더할거야
			factorialNum*=i; //i가 decimal 받은 숫자가 될떄까지 곱해
		}
		System.out.println(decimal+"'s factorial value = "+factorialNum);
	
	
	
	
	
	
	
	
	
	}
}
