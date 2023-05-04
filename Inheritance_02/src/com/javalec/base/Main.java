package com.javalec.base;

import java.nio.channels.MulticastChannel;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		int firstNum=0;
		int secondNum=0;
		System.out.println("사용자로부터 2개의 숫자를 입력받아 덧셈 뺄셈 곱셈 나눗셈의 결과를 보여주려고 한다.");
		
		System.out.println("첫번째 값을 넣어주세요");
		firstNum=scanner.nextInt();
		System.out.println("두번째 값을 넣어주세요");
		secondNum=scanner.nextInt();
		Divide divide =new Divide(firstNum, secondNum);
		divide.plus();
		divide.minus();
		divide.mul();
		divide.divide();
		
		
		System.out.println("---------Method----------");
		
		MultipleM mul =new MultipleM();
		mul.plus(20, 30);
		mul.minus(20,30);
		mul.mul(20 , 30);
		
		System.out.println("---------constructor--------");

		MulC mulC =new MulC(20,30);
		mulC.add();
		mulC.sub();
		mulC.multipliction();
		
	}

}
