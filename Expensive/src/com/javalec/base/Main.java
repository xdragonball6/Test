package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Declare
		Scanner scanner = new Scanner(System.in);
		int 금액 = 0; // 사용자 금액 입력
		String message = ""; // 출력값 멘트
		
		System.out.print("금액을 입력하세요! : ");
		금액 = scanner.nextInt();

		// Process
		
		if(금액>=8000) {
			message = "너무 비쌉니다.";
		} else if(금액>=5000) {
			message = "조금 비쌉니다.";
		} else if(금액>=3000) {
			message = "적당한 금액 입니다.";
		} else {
			message = "싼 편입니다.";
		}

		// Output
		System.out.println(message);
	
	
	}

}
