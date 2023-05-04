package com.javalec.base;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arrayList = new ArrayList<Integer>(); // Integer는 정수
		
		int inputNum=0; // 입력숫자 갯수
		int inputNum1=0; // 입력 받은 숫자
		int inputNum2=0; // 삭제 숫자
		
		System.out.print("입력할 숫자의 갯수? :");
		inputNum=scanner.nextInt();
		
		System.out.println(inputNum+"개의 숫자를 입력하세요! :");
		for(int i=0; i<inputNum; i++) {
			System.out.print((i+1)+"의 숫자 :");
			inputNum1=scanner.nextInt();
			arrayList.add(inputNum1);
			}
		
		System.out.print("몇번째의 숫자를 삭제 하시겠습니까? :");
		inputNum2=scanner.nextInt();
		arrayList.remove(inputNum2-1);
		
		System.out.println("------결과-------");
		for(int i=0; i<arrayList.size(); i++) {
		System.out.println(arrayList.get(i));
		}
	}

}
