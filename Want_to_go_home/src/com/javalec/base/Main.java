package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 집 가고싶어서 정리하
		System.out.println("Hello, \n\tworld");
		
		String A = "집";
		String B = "에 가고싶";
		String C = "어 죽겠네";

		System.out.println("**"+A+B+C+"**");
		
		System.out.println(632);
		System.out.println("632");
		System.out.println(6+3+2);
		System.out.println("6"+"3"+"2");
		System.out.println("6"+"+"+"3"+"+"+"2"+"="+(6+3+2));

		int a = 10;
		int b = 50;
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(a+"/"+b+"="+((double)a/b));
		System.out.println(a+"-"+b+"="+(a-b));
		
		int c = 60;
		double d = c;
		System.out.println(c);
		
		System.out.println(d);
		// 정수밖에 표현이 안되기 떄문에 오류가 있을 수 있다.
		
		double e = 3.64;
		int f = (int) e;
		System.out.println(e);
		System.out.println(f);
		
		int i = 3;
		int j = 4;
		int k = 5;
		
		
		i++;
		System.out.println(i);
		
		System.out.println(i==j ? "OK" : "None");
		System.out.println(i>j ? "OK" : "None");
		
		// 17은 3의 배수인가
		
		Scanner scanner = new Scanner(System.in);
		int U = 0, Q = 0;
		
		System.out.println("A는 B의 배수인가?");
		System.out.print("A를 입력하세요");
		U= scanner.nextInt();
		System.out.print("B를 입력하세요");
		Q= scanner.nextInt();

		System.out.println(U+"은(는)"+Q+"의 배수인가?");
		System.out.println(U % Q==0 ? "배수가 맞음" : "배수가 아님");
		
		String decision = (U % Q ==0 ? U+ "는(은) " + Q+"의 배수" : U+"는 "+Q+"의 배수가 아님");
		System.out.println(U+"는 "+Q+"의 배수인가?"+decision);

				
	}
}
