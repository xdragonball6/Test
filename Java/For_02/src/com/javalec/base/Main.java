package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 사용자가 입력한 숫자로 구구단을 구성.
//		Scanner scanner=new Scanner(System.in);
//		
//		int firstNum=0;
//		System.out.println("구구단 몇:");
//		firstNum = scanner.nextInt();
//		for (int i=1; i<=9; i++ ) {
//			System.out.println(firstNum + " X " + i + " = "+(firstNum*i));
//		}
		
		//2단 하는 법
//		int dan= 2;
//		for(int num =1; num<=9; num++) {
//			System.out.println(dan + " X " + num + " = "+(dan*num));
//		}

		
		
		//구구단 전체 출력
//		Scanner scanner = new Scanner(System.in);
//		for (int dan=2; dan<=9; dan++) {
//			System.out.println("-----"+ dan + "단-----");
//			for(int num=1; num<=9; num++ ) {
//				System.out.println(dan + " X " + num + " = "+(dan*num));
//			}
//		}
		
		//구구단 전체 출력중 곱해지는 수가 짝수인 경우에만 출력하기

//			for(int dan=2; dan<=9; dan++) {
//				if(dan % 2 ==0 ) {
//					System.out.println("-----"+ dan + "단-----");
//				}
//					for(int num=1; num<=9; num++) {
//					if(num%2==0) {
//						System.out.println(dan + " X " + num + " = "+(dan*num));
//					}
//					}
//		       }
		//구구단 전체 출력중 곱해지는 수가 홀수인 경우에는 곱해지는 수를 *로 표시하기
			
//			for (int dan=1; dan<=9; dan++) {
//				System.out.println("-----"+ dan + "단-----");
//				for(int num=1; num<=9; num++ ) {
//					if((dan*num)%2==0) {
//						System.out.println(dan + " X " + num + " = "+(dan*num));					
//					}else {
//						System.out.println(dan + " X " + "*" + " = "+(dan*num));					
//						
						
//					}
//
//					}
//				}
			//위에거랑 같은 결과 나오게 하는법
			
//			for (int dan=2; dan<=9; dan++) {
//				System.out.println("-----"+ dan + "단-----");
//				for(int num=1; num<=9; num++) {
//					System.out.println(dan + " X " +(num % 2 == 0 ? num : "*")+ " = " + (dan*num));
//				}
//			}

			//구구단 쭉 적어보기
			
//		for(int num=1; num<=9; num++) {
//			for (int dan=2; dan<=9; dan++) {
//					System.out.print(dan + "X" + num + "=" + (dan*num)+"\t");
//				}
//				System.out.println();
//		 }
		
		
//		for (int num= 1; num<=9; num++) {
//			System.out.print("1 X " + num + "= " + (1*num)+ "\t");
//			System.out.print("2 X " + num + "= " + (2*num)+ "\t");
//			System.out.print("3 X " + num + "= " + (3*num)+ "\t");
//			System.out.print("4 X " + num + "= " + (4*num)+ "\t");
//			System.out.print("5 X " + num + "= " + (5*num)+ "\t");
//			System.out.print("6 X " + num + "= " + (6*num)+ "\t");
//			System.out.print("7 X " + num + "= " + (7*num)+ "\t");
//			System.out.print("8 X " + num + "= " + (8*num)+ "\t");
//			System.out.println("9 X " + num + "= " + (9*num)+ "\t");
//		}
		
		//짝수 곱하기
//		for (int num=1; num<=4; num++) {
//			for (int dan=2; dan<=9; dan++) {
//				System.out.print(dan + "X" + 2*num + "=" + ((2*dan)*num)+"\t");
//			}
//			System.out.println();
//		}
		
//		for (int num=1; num<=9; num++) {
		
//			for (int dan=2; dan<=9; dan++) {
//				if (num%2==0) {
//					System.out.print(dan + " X " + num + " = " + (dan*num)+"\t");
//				}else {
//					System.out.print(dan + " X " + "*" + " = "+(dan*num)+"\t");
//				}
//			}
//			System.out.println();
//		}

		//if 없이 위에것과 같게 나오게 만들기
		for (int num=1; num<=9; num++) {
			for (int dan=2; dan<=9; dan++) {
				System.out.print(dan + " X " +(num % 2 == 0 ? num : "*")+ " = " + (dan*num)+"\t");
			}
			System.out.println();
		}
			String str= "구구단";
			
			
		}

}