package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
//		int num1=0;
//		System.out.println("5개의 숫자를 입력하세요");
//		for(int i=1; i<=5; i++) {
//			System.out.print(i+"번 숫자: ");
//			num1=scanner.nextInt();
//		}
//		System.out.println("---------------------");
//		System.out.println("입력하신 숫자는 다음과 같습니다.");
//		int num2=0;
//		for(int j=0; j<=5; j++) {
//			num2
//		}
//		System.out.println(i+")"+j);
//		System.out.println("");
		
	
		int[] intnum= new int[5];
		int sum=0;
//		System.out.println("5개의 숫자를 입력하세요");
//		for(int i=0; i<intnum.length; i++) {
//			System.out.print((i+1)+"번 숫자:");
//			intnum[i]=scanner.nextInt();
//		}
//		System.out.println("----------------");
//		System.out.println("입력하신 숫자는 다음과 같습니다.");
//		for(int i=0; i<intnum.length; i++) {
//			System.out.println((i+1)+":"+intnum[i]);
//			sum+=intnum[i];
//		}
//		System.out.println("합계: "+sum);
		
//		System.out.println("5개의 숫자를 입력하세요");
//		for(int i=0; i<intnum.length; i++) {
//			System.out.print((i+1)+"번 숫자:");
//			intnum[i]=scanner.nextInt();
//		}
//		System.out.println("----------------");
//		System.out.println("입력하신 숫자는 다음과 같습니다.");
//		for(int i=intnum.length; i>0; i--) {
//			System.out.println((i)+":"+intnum[i-1]); // i는 5가 나와버리기 때문에 0부터 시작하는 특징을 생각하면 i-1을 해야 0,1,2,3,4 번째에 있는 값을 볼 수 있다. 이게 아니면 int i=intnum.length-1로 적으면 된다.
			
//			sum+=intnum[i-1];
//		}
//		System.out.println("합계: "+sum);
	
		int[] tonum= new int[100];
		int wow=0;
		int sum1=0;
		
		System.out.println("숫자의 갯수는 최대 100개입니다. 몇개의 숫자를 입력하시겠습니까?");
		wow=scanner.nextInt();
		
		System.out.println(wow+"개의 숫자를 입력하세요");
		for(int j=0; j<wow; j++) {
			System.out.print((j+1)+"번 숫자:");
			tonum[j]=scanner.nextInt();
		}
		System.out.println("----------");
		System.out.println("입력하신 숫자는 다음과 같습니다.");
		for(int i=0; i<wow; i++) {
			System.out.println((i+1)+":"+tonum[i]);
			sum1+=tonum[i];
		}
			System.out.println("합계:"+sum1);
	
	
	
	}
}

