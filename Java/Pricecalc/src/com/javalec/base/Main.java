package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int 숫자 = 0;
		String message = "";
		System.out.print("숫자를 입력하세요 : ");
		
		숫자 = scanner.nextInt();
		
		String side = ("입력하신 숫자 "+숫자+"(은)는");
		String end = ("입니다.");
		
		if (숫자 % 2==0) {
			message=(side+" 짝수");
		} else {
			message=(side+" 홀수");
		}
		
		System.out.println(message+end);
		
	}

}
