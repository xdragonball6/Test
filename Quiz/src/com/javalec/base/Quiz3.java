package com.javalec.base;

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//10의 제곱승 구하기

		long tot =1; //tot를 정수 0으로 둬버리면 뭐를 곱해도 0이 나오기 때문에 1로 적어놔야함
		for(int j=0; j<=10; j++) {
			
			System.out.println("10^"
					+String.format("%2d",j)+"="
					+String.format("%12d",tot));
			tot*=10; // 같은 for문(반복문) 안에 들어 있기 떄문에 tot=10*10, tot=10*10*10, tot=10*10*10*10..이런식으로 10번 할때까지 반복함
		}
	}

}
