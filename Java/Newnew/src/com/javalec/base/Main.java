package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 ");
		int scoreKor = 0;
		int scoreEng = 0;
		int scoreMath = 0;
		
		
		String sub1 = "국어", sub2 = "영어", sub3 = "수학";
		String a1 = "점수를 입력하세요: ", a2 = "점수는 " , a3 = "평균점수: ";
		String aveLow = "평균보다 낮습니다", aveEq="평균입니다.", aveHigh="평균보다 높습니다.";
		String message1 = "";

		
		//입력
		System.out.println(sub1 + a1);
		scoreKor = scanner.nextInt();
		System.out.println(sub2 + a1);
		scoreEng = scanner.nextInt(); 
		System.out.println(sub3 + a1);
		scoreMath = scanner.nextInt();
		
		
		double aveScore = ((scoreKor + scoreEng +scoreMath)/3) ;
		
		
		
		//조건 
		if(scoreKor >aveScore) {
			message1 = aveHigh;
		}
		else if(scoreKor == aveScore) {
			message1 = aveEq;
		}
		else if(scoreKor < aveScore){
			message1 = aveLow;
		}

		if(scoreEng>aveScore) {
			message1 = aveHigh;
		}
		else if(scoreEng == aveScore) {
			message1 = aveEq;
		}
		else if(scoreEng < aveScore){
			message1 = aveLow;
		}
		
		if(scoreMath >aveScore) {
			message1 = aveHigh;
		}
		else if(scoreMath == aveScore) {
			message1 = aveEq;
		}
		else if(scoreMath < aveScore){
			message1 = aveLow;
		}
		
		
		
		//출력
		System.out.println(a3 + aveScore);
		System.out.println(sub1 + message1);
		System.out.println(sub2 + message1);
		System.out.println(sub3 + message1);
		
		
		
		
		

	}

}