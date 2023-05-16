package com.javalec.base;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int fdan= 0; //첫번째 단
		int[] d= new int[4]; //집어넣은 숫자부터 4개 더 표시하기
		System.out.print("Input your number :");
			fdan=scanner.nextInt();
			for (int b=0; b<d.length; b++) {
				d[b]=fdan+b;
			}
			for(int num=1; num<=9; num++) {
				for(int dan=0; dan<d.length; dan++) {
			System.out.print((d[dan])+"X"+num+"="+((d[dan])*num)+"\t");
					
				}
				System.out.println("");
			}
		}
}

		
		