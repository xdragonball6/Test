package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// 배열을 배워보자
		// 배열(Array)
		// 문자열 배열 데티어 7개를 생성
//		String[] str = new String[7];
//		int [] num = new int[10];
//		str[0] ="일요일";
//		str[1] ="월요일";
//		str[2] ="화요일";
//		str[3] ="수요일";
//		str[4] ="목요일";
//		str[5] ="금요일";
//		str[6] ="토요일";
//		System.out.println(str); //좌표지정을 안해주면 암호화가 될 수 있음
		
		String[] str = {"일요일", "월요일","화요일", "수요일", "목요일", "금요일", "토요일"};
		
		//배열의 갯수 확인하기
		System.out.println(str.length);
		
		// 일요일 <- Sunday
		str[0] = "Sunday";
		
		for(int i=0; i<str.length; i++) { // 그전처럼 <=를 쓰게 될 경우 에러가 뜬다
			System.out.print(str[i]+"\t");
		}
		
		System.out.println("");
		
		// 정수 배열 intArray에 1부터 10까지 등룍하는 문장을 구성하고 출력하기
		int[] intArray= new int[10];
		
		// Creation
		for(int i=0; i<intArray.length; i++) {
			intArray[i] =i+1;
		}
		
		//Read
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		//Data가 짝수인 합계 구하기
		int tot=0;
		
		for(int i=0; i<intArray.length; i++) {
			if(intArray[i] %2 ==0) {
				tot+= intArray[i];
			}
				
		}
		System.out.println("tot :"+tot);
		
		
	}

}
