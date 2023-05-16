package com.javalec.base;

import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//10개의 점수(0부터 99)를 입력받아 점수의 분포를 10점 간격의 등급으로된 히스토그램을 표시하라.
		Scanner scanner=new Scanner(System.in);
		int[] score = {1,2,3,4,5,6,7,8,9,10};//점수의 갯수
		int[] whoScore = new int[score.length];
		int scorenum=0;//점수 분포
		String shap= "#";
		System.out.println("Input score : ");
		
		for(int i=0; i<=score.length-1; i++) {
			System.out.println(score[i]+"의 score :");
			whoScore[i]=scanner.nextInt();
		}
		
		System.out.println("-----Histogram------");
		System.out.print("90 :");
		for(int i=0; i<score.length; i++) {
			if(whoScore[i]/10>=9) {
				System.out.print(shap);//적힌 점수에서 10을 뺀 값이 9보다 크거나 같을때 샾이 나오게 한다 
		}
			}
		System.out.println("");
		System.out.print("80 :");
		for(int i=0; i<score.length; i++) {
			if(whoScore[i]/10>=8) {
				System.out.print(shap);//적힌 점수에서 10을 뺀 값이 9보다 크거나 같을때 샾이 나오게 한다 
			}
		}
		System.out.println("");
		System.out.print("70 :");
		for(int i=0; i<score.length; i++) {
			if(whoScore[i]/10>=7) {
				System.out.print(shap);//적힌 점수에서 10을 뺀 값이 9보다 크거나 같을때 샾이 나오게 한다 
			}
		}
		System.out.println("");
		System.out.print("60 :");
		for(int i=0; i<score.length; i++) {
			if(whoScore[i]/10>=6) {
				System.out.print(shap);//적힌 점수에서 10을 뺀 값이 9보다 크거나 같을때 샾이 나오게 한다 
			}
		}
		System.out.println("");
		
	
//	디따 멍청하게 만들고 있었네;
	
	
		}	
	}

