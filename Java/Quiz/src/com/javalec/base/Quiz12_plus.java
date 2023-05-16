package com.javalec.base;

import java.util.Scanner;

public class Quiz12_plus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//나중에 수정할거야 기다려
		
		Scanner scanner=new Scanner(System.in);
		int data=0;
		int count =0; //입력할 숫자의 갯수
		int number = 0;//검색할 
		int search = 0;
		
		//배열에 입력한 숫자 넣기
		for(int i=0; int)
			
			
		//검색
		
		System.out.println("검색할 숫자는 ? : ");
		search=scanner.nextInt();
		
		for(int data=0; data<count; data++) {
			if(number[data]==search) {
				System.out.println(search+"의 위치는"+(data+1)+"번째 입니다.");
				find=true;
				break;
			}
		}
		
		//찾지 못할 경우
		if(data==count) {
			System.out.println(search+"는 존재하지 않습니다.");
			
		}
	}

}
