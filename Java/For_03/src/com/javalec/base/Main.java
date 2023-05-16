package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		for (int num=1; num<=9; num++) {
//			for (int dan=2; dan<=9; dan++) {
//				System.out.print(dan + " X " +(num % 2 == 0 ? num : "*")+ " = " + (dan * num) + "\t");
//			}
//			System.out.println();
//		}

		//위와의 차이는 String.formet을 써서 오른쪽 정렬이 필요한곳에 가져다 놓은것이다.
//		for (int num=1; num<=9; num++) {
//			for (int dan=2; dan<=9; dan++) {
//				System.out.print(dan + " X " +(num % 2 == 0 ? num : "*")+ " = " +String.format("%2d",(dan * num)) + "\t");
//			}
//			System.out.println();
//		}
		
		
		for (int num=1; num<=9; num++) {
			for (int dan=2; dan<=9; dan++) {
				if ((dan*num)%2==0) {
					System.out.print(dan + " X " + num + " = " + (dan*num)+"\t");
				}else {
						System.out.print("\t\t");
				}
			}
		
			System.out.println();
//		}
//		//if문 사용하지 않고 적어보기
//		for (int num=1; num<=9; num++) {
//			for(int dan=2; dan<=9; dan++) {
//				System.out.print(((dan*num)%2==0 ? dan+" X "+num+" = "+(dan*num)+"\t" : "\t\t"));
//			}
//			System.out.println("\t\t");
		}
	}
}