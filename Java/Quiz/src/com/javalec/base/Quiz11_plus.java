package com.javalec.base;

import java.util.Scanner;

public class Quiz11_plus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		int[]histo=new int[10];
		
		// 입력부분
//		System.out.println("Input Score :");
//		for(int i=0; i<histo.length; i++) {
//			System.out.println((i+1)+"의 score ;");
//			histo[scanner.nextInt()/10]++;
//		}
//		scanner.close();
//		
		// 출력부분
//		System.out.println("-----------Histogram-----------");
//		
//		for(int i=(histo.length-1); i>=0; i--) {
//			System.out.print(String.format("%3d :", i*10));
//			for(int j=1; j<=histo[i]; j++) {
//				System.out.print("#");
//				
//			}
//			System.out.println();
//		}
		Scanner scanner=new Scanner(System.in);
		 String[] histo = new String[10]; // String 배열 생성

	        // 입력 부분
	        for (int i = 0; i < histo.length; i++) {
	            System.out.print((i + 1) + "의 score: ");
	            int score = scanner.nextInt();
	            int num = score / 10; // 점수를 10으로 나누기
	            if (histo[num] == null) { // int의 경우 입력값이 없으면 0 string의 경우 null이 뜬다
	                histo[num] = ""; // 만약 null이 나오면 아무것도 안뜨게 하기
	            } else
	                histo[num] += "#"; // null이 아닌 경우 "#" 추가
	        }
	        scanner.close();

	        // 출력 부분
	        System.out.println("-----------Histogram-----------");
	        for (int i = histo.length - 1; i >= 0; i--) {
	            System.out.print(String.format("%3d :", i * 10));
	            if (histo[i] != null) {
	                System.out.print(histo[i]); // 해당 인덱스의 값이 null이 아닌 경우 출력
	            }
	            System.out.println();
	        }
	    }
}