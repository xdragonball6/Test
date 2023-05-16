package com.javalec.base;

import java.util.Scanner;

public class Quiz9 {
	 
	
	 public static void main(String[] args) {
		 
		 //학생수가 4명이고 과목이 3과목일 경우의 점수 합계와 평균 구하기 기능 추가
		
		Scanner scanner = new Scanner(System.in);
		
	String [] student = {"No1","No2","No3","No4"};
	String [] gwamok = {"Korean","English","Mathmatics"};
		int[] korscore = new int[student.length]; //[]숫자 안의 학생의 점수를 기억해두게 만듦
		int[] Engscore = new int[student.length]; //[]숫자 안의 학생의 점수를 기억해두게 만듦
		int[] Mathscore = new int[student.length]; //[]숫자 안의 학생의 점수를 기억해두게 만듦
		int ave=0;
		int tot=0;
		int korAve=0;
		int EngAve=0;
		int MathAve=0;
		
		System.out.println(gwamok[0]+"의 성적을 입력 :");
		for(int i=0; i<student.length; i++) {
			System.out.print(student[i]+"의 성적은 : ");
			korscore[i]=scanner.nextInt();
			tot+=korscore[i];
			korAve=tot/student.length;
		}
		
		System.out.println(gwamok[1]+"성적을 입력 :");
		for(int i=0; i<student.length; i++) {
			System.out.print(student[i]+"의 성적은 : ");
			Engscore[i]=scanner.nextInt();
			tot+=Engscore[i];
			EngAve=tot/student.length;
		}
			
			System.out.println(gwamok[2]+"의 성적을 입력 :");
			for(int i=0; i<student.length; i++) {
				System.out.print(student[i]+"의 성적은 : ");
				Mathscore[i]=scanner.nextInt();
				tot+=Mathscore[i];
				MathAve=tot/student.length;
			}
			for(int i=0; i<=3; i++)
			System.out.println(student[i]+"\t"+korscore[i]);
			}
			
			
			
			//난 왜 위 처럼 다 적은거지; for로 반복되는걸 줄여봐 좀
			
//			for(int j=0; j<=2; j++) {
//				System.out.println(gwamok[j]+"의 성적을 입력 :");
//			}
		 
	 }