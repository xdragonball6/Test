package com.javalec.base;
// 패키지 이름
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Condition 
		
//		String str1 = new String("abc"); 이거랑 밑에거랑 같음
//		String str1 = "abc";
		

		int i = 0, j = 0, k = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("i의 값을 입력해 주세요! : ");
		i = scanner.nextInt();
		System.out.print("j의 값을 입력해 주세요! : ");
		j = scanner.nextInt();
		System.out.print("k의 값을 입력해 주세요! : ");
		k = scanner.nextInt();
		
		
		if(j > i) {
			System.out.println("j가 i보다 큽니다.");
				
		} else if(j < i) {
			System.out.println("j가 i보다 작습니다.");
		} else {
			System.out.println("j와 i는 같습니다");
		}

		if(i == k) {
			System.out.println("i와 k가 같습니다.");
		} else if(i < k) {
			System.out.println("i가 k보다 작습니다.");
		} else {
			System.out.println("i가 K보다 큽니다.");
		}
	
		if(k > j) {
			System.out.println("k가 j보다 큽니다.");
		} else if (k < j) {
			System.out.println("k가 j보다 작습니다.");
		} else {
			System.out.println("k와 j는 같습니다.");
		}
		
		System.out.println("--- END ---");
		
		
		
	}

}
