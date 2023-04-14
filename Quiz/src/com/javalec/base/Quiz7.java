package com.javalec.base;

import java.util.Scanner;

public class Quiz7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		
		
		
		
		// 몇 개의 숫자를 입력할지 결정한 후
		// 숫자를 입력하고 이중 최대값의 위치와 최대값을 구하라
		
		Scanner scanner=new Scanner(System.in);
		
		int whatNum = 0; // 몇개의 수를 적을지
        int[] size; // 최대 크기
        int maxNum = 0;
        int whichLine = 0;
        System.out.println("입력할 숫자의 갯수 ? (100개 미만) :");
        whatNum = scanner.nextInt();

        if (whatNum <= 0 || whatNum > 100) {
            System.out.println("error");
            scanner.close();
            return;
        } else {
            System.out.println(whatNum + "개의 숫자를 입력하세요!");
            size = new int[whatNum]; // 배열 크기 동적 할당
        }

        for (int i = 0; i < whatNum; i++) {
            size[i] = scanner.nextInt();

            if (maxNum <= size[i]) {
                maxNum = size[i];
                whichLine = i + 1; // 최대값의 위치 저장
            }
        }
        System.out.println("가장 큰 수는 " + maxNum + "이고 " + whichLine + "번째 줄이다.");
        scanner.close();
    }

 }

