package com.javalec.base;

import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//아래의 그림과 같이 고객의 입금, 출금 및 현황을 관리하는 Program을 작성하라 단 고객번호는 1,2,3,4,5이다
		
		Scanner scanner= new Scanner(System.in);
		int cost=0;//남아있는 금
		int[] arr=new int[5];
		int num=0;
		
		while(num!=4)			{
			System.out.println("1.입금\n2.출금\n3.현황\n4.종료");
			System.out.println("번호를 선택하세요!");
			num=scanner.nextInt();//입력 될 숫자
			switch (num) {
			case (1) :
				System.out.println("고객번호 : ");
			int customer=scanner.nextInt(); //고객 번호
				System.out.println("금액 : ");
				int incost=scanner.nextInt();//금액의 양
				arr[customer-1]+=incost;
				System.out.println("입금 결과 : 고객번호 :"+customer+" 잔액 : "+incost);
				break;
				
			case (2) :
				System.out.println("고객번호 : ");
				customer=scanner.nextInt();
				System.out.println("금액 : ");
				cost=scanner.nextInt();
				if (arr[customer-1]>=cost) {
					arr[customer=1]-=cost;
					System.out.println("출금 결과 : 고객번호 :"+customer+"잔액 :"+ arr[customer-1]);
				}else
					System.out.println("잔액이 부족합니다!");
			
				break;
		
			case (3) :
				System.out.println("\t고객명\t잔액");
				System.out.println("\t------\t------");
			
				for(int i=0; i<arr.length; i++) {
				System.out.println("\t"+(i+1)+"\t"+arr[i]);
				}
				break;
			
			case (4) :
				System.out.println(">>>>>Thank You<<<<<");
				break;
			default:
				System.out.println("번호를 다시 입력해주세요");
			break;
			}
		}
	}
}