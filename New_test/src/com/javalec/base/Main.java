package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare
		Scanner scanner = new Scanner(System.in);
		int 국어 = 0, 영어 = 0, 수학 = 0;
		String message ="";
		String kor = "국어 ";
		String eng = "영어 ";
		String mat = "수학 ";
		String ave = "평균입니다";
		String low = "평균보다 낮습니다.";
		String high = "평균보다 높습니다.";
		String scoreis ="점수는 ";
		
		//점수를 입력하
		System.out.print(kor+"점수를 입력하세요 :");
		국어 = scanner.nextInt();
		System.out.print(eng+"점수를 입력하세요 :");
		영어 = scanner.nextInt();
		System.out.print(mat+"점수를 입력하세요 :");
		수학 = scanner.nextInt();
		if(국어>100 || 국어 <0 || 영어>100 || 영어<0||수학>100||수학<0) {
			System.out.println("점수를 잘못 입력 하셨습니다.");
		} else {

		double 평균점수 = ((국어+영어+수학)/3);
		System.out.println("평균점수 :"+평균점수);
		
		//국어 과정과 결과
		if(국어 == 평균점수) {
			message = scoreis+ave;
		} else if(국어 > 평균점수) {
			message = scoreis+high;
		} else {
			message = scoreis+low;
		}
		System.out.println(kor+message);
		
		// 영어 과정과 결과
		if(영어 == 평균점수) {
			message = scoreis+ave;
		} else if(영어 > 평균점수) {
			message = scoreis+high;
		} else {
			message = scoreis+low;
		}
		System.out.println(eng+message);
		
		//수학 과정과 결과
		if(수학 == 평균점수) {
			message = scoreis+ave;
		} else if(수학 > 평균점수) {
			message = scoreis+high;
		} else {
			message = scoreis+low;
		}
		System.out.println(mat+message);}
				
		}
		
	}
