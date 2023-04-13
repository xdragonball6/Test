package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1에서 10까지를 출력
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		
		//for는 가로 안에 반복되는것
//		for (int i=1; i<=100; i++) {
//			System.out.println(i);
//		}
		
//		for (int i = 1; i<=9; i++) {
//			System.out.println("2 X " + i + " = " + (2*i));
			
//		}
		
		// 1부터 10까지의 합계
//		int sum = 0;
		
//		for (int i = 1; i<=10; i++) {
//			sum+=i;
//		}
		
//		System.out.println("1~10까지의 합계 :"+ sum);
		
		// 범위의 합계 구하기
		
//		int sum = 0;
//		int startNum=0;
//		int endNum=0;
				
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("첫번째 숫자를 입력하세요 :");
//		startNum = scanner.nextInt();
//		System.out.print("두번째 숫자를 입력하세요 :");
//		endNum = scanner.nextInt();
		
//		for (int i = startNum; i<=endNum; i++) {
//			sum+=i;
//		}
		
//		System.out.println(startNum + "~" + endNum +" 합계:" + sum);
		
		// 1부터 100까지의 짝수 합계 구하기
//		int evenSum = 0;
//		int oddSum = 0;
		
//		for (int i=1; i<=100; i++) {
//			if(i % 2 == 0) {
//				evenSum +=i;
//			}else {		 
//				oddSum += i;
//					}
			
//		}
//		System.out.println("1부터 100까지의 짝수의 합은 "+ evenSum + " 입니다.");
//		System.out.println("1부터 100까지의 홀의 합은 "+ oddSum + " 입니다.");
//		System.out.println("1부터 100까지의 짝수와 홀수의 합은 "+(evenSum+oddSum)+" 입니다.");

		// 1부터 100까지 3의 배수이거나 5의 배수인 수의 합은
		
//		int sum = 0;
//		for(int i=1; i<=100; i++) {
//			if((i % 3 ==0) || ( i % 5 ==0)) {
//				sum += i;
//			}
//		}
//		System.out.println("1부터 100까지 수중 3의 배수이거나 5의 배수인 수의 합은 :" + sum);
	
	
		// 범위의 합계
		// Case #1
		
//		int startNum=0;
//		int endNum=0;
//		int tempStart=0;
//		int tempEnd=0;
//		int sum=0;
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("첫번째 숫자를 입력하세요 :");
//		tempStart=scanner.nextInt();
//		System.out.print("두번째 숫자를 입력하세요 :");
//		tempEnd=scanner.nextInt();
		
		//시작 숫자와 끝숫자 크기 비교해서 작은 수가 첫번째 수로 변경되게 만듦
//		if(tempStart>tempEnd){
//			startNum = tempEnd;
//			endNum = tempStart;
///		}else {
//			startNum= tempStart;
//			endNum=tempEnd;
//		}
//		// 범위 합계 구하기
//		for(int i=startNum; i<=endNum; i++) {
//			sum+=i;
//	
//	
//		}		 	
//			 
//		System.out.println("두 수의 합계는 " + sum + "입니다.");
		
		//범위 합

//		Scanner scanner = new Scanner(System.in);
//		int startNum = 0;//입력받은 첫번째 숫자
//		int endNum = 0;//입력받은 두번째 숫자
//		int	tempStart = 0;//비교 후 큰 숫자 대입
//		int tempEnd= 0;//비교 후 작은 숫자 대입
//		int sum = 0;//작은 숫자부터 큰 숫자까지의 합
	
//		System.out.print("첫번째 숫자를 입력하세요: ");
//		startNum = scanner.nextInt();
//		System.out.print("두번째 숫자를 입력하세요: ");
//		endNum = scanner.nextInt();
		
//		//startNum과 endNum의 크기비교 후 큰 숫자를big, 작은숫자를small로 넣는 과정
//		if(startNum > endNum) {
//			tempStart = startNum;
//			tempEnd = endNum;
//		}else {
//			tempEnd = startNum;
//			tempStart = endNum;
//		}
	

//		for (int i=tempEnd ; i<=tempStart ; i++) {
//			sum += i;
//			} 
//		System.out.println("두수의 범위의 합계는" + sum +"입니다.");

		//홀수의 합계
		Scanner scanner= new Scanner(System.in);
		int firstNum = 0;
		int secondNum= 0;
		int largeNum = 0;
		int smallNum = 0;
		int evenSum = 0;
		double oddSum = 0;
		int evenCount = 0;
		int oddCount = 0; //홀수의 갯
		double Sum=0;
		int Count =0;
		int average=0;
		int oddAverage=0;
		int evenAverage=0;
		
		System.out.println("첫번째 숫자를 입력하세요 :");
		firstNum = scanner.nextInt();
		System.out.println("두번째 숫자를 입력하세요 :");
		secondNum = scanner.nextInt();
		
		if(largeNum<smallNum) {
			firstNum=smallNum;
			secondNum=largeNum;
		} else {
			secondNum=smallNum;
			firstNum=largeNum;
		}
		
		for(int i=largeNum; i<=smallNum; i++) {
			Sum+=i;
			Count++;
			if(i%2==1) {
				oddSum+= i;
				oddCount++;
			}else {
				evenSum+= i;
				evenCount++;
			}
			
			//평균 구하기
//			average = Sum / Count;
//			oddAverage = oddSum / oddCount;
			
			//출력하기
			System.out.println("범위 합계는" + Sum + "입니다.");
			System.out.println("짝수의 합계는"+ evenSum+"입니다.");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
		}
		
	}

}