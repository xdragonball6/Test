package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int score = 0;
		String is = "학점 입니다";
		System.out.print("점수를 입력하세요 :");
		score = scanner.nextInt();
		if(score>100 || score<0) {
			System.out.println ("점수를 잘못 입력했습니다.");
		}
		else {
			switch(score / 10) {
			
			case 10: //밑에 A학점이 같게 나오기 때문에 break가 필요 없다.
			case 9:
				System.out.println("A"+is);
				break;	//break는 중간에 끊어주는 역할
			case 8:
				System.out.println("B"+is);
				break;
			case 7:
				System.out.println("C"+is);
				break;
			default:
				System.out.println("D"+is);
				break;
			}
		}
		
	}

}
