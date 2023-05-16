package com.javalec.base;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random= new Random();
//		System.out.println(random.nextInt(10));//()가로 안에 숫자를 넣으면 그 안의 숫자만 나옴
		for(int j=1; j<=6; j++) { //6번까지 실행한다
			int i = random.nextInt(45); //45까지의 숫자중에 랜덤으로
			System.out.println(i+1); //0부터 시작할테니까 1을 더해서
		}
		
		
	}

}
