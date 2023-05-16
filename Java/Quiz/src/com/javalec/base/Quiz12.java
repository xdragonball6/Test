package com.javalec.base;

import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	몇 개의 숫자를 입력 할지 결정한 후 숫자를 입력하고 이중 검색을 하는 숫자의 위치를 파악
		
		Scanner scanner = new Scanner(System.in);
        int inputNum = 0; // 입력할 숫자의 개수
        int[] numbers; // 숫자 배열
        int whichNum = 0; // 검색할 숫자
        int where = -1; // 숫자의 위치

        System.out.print("입력할 숫자의 개수? ");
        inputNum = scanner.nextInt(); // 입력할 숫자의 개수 입력

        numbers = new int[inputNum]; // 숫자 배열 크기 초기화

        System.out.println(inputNum + "개의 숫자를 입력하세요! :");
        for (int i = 0; i < inputNum; i++) {
            System.out.print((i + 1) + "의 숫자: ");
            numbers[i] = scanner.nextInt(); // 숫자 입력
        }

        System.out.print("검색할 숫자는? : ");
        whichNum = scanner.nextInt(); // 검색할 숫자 입력

        // 숫자 검색 및 위치 파악
        for (int i = 0; i < inputNum; i++) {
            if (numbers[i] == whichNum) {
                where = i + 1; // 배열 인덱스가 0부터 시작하므로 1을 더해서 위치 파악
                break; // 검색할 숫자를 찾으면 루프 탈출
            }
        }

        if (where == -1) {
            System.out.println("입력한 숫자들 중 " + whichNum + "은(는) 없습니다.");
        } else {
            System.out.println(whichNum + "의 위치는 " + where + "번째 입니다.");
        }

    }
}