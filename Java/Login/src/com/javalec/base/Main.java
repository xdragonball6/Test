package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String id = ""; //ID
		String password = ""; //PassWord
		
		System.out.println("** Log In Check **");
		
		System.out.print("User ID :");
		id = scanner.next();
		
		System.out.print("Password :");
		password = scanner.next();
		
		// 문자일 때 .equals는 숫자의 ==와 같다
		if(id.equals("root")&& password.equals("1234")) {
			System.out.println("환영합니다.");
		}else {
			System.out.println("등록된 사용자가 아닙니다.");
		}
	}
}