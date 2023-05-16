package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
//		String[]name = {"James", "Cathy", "Kenny", "Martin", "Crystal"};
//		int[] height =new int[name.length];//이렇게 적어두면 이름과 키가 같은 사람들끼 뜨게 할 수 있다.
//		int avg = 0;
//		int tot =0;
//		int maxArrayNo=0;
//		int minArrayNo=0;
//		int maxHeight;
//		int minHeight;
//		
//		for(int i=0; i<name.length; i++) {
//			System.out.print(name[i]+"의 신장을 입력하세요!");
//			height[i]=scanner.nextInt();
//			tot+=height[i];
//		}
//		avg=tot/name.length;
//		
//		maxHeight=height[0];
//		minHeight=height[0];
//		
//		for(int i=0; i<height.length; i++) {
//			if(maxHeight<=height[i]) {
//				maxHeight=height[i];
//				maxArrayNo =i;
//			}
//			if(minHeight>=height[i]) {
//				minHeight = height[i];
//				minArrayNo = i;
//			}
//		}
//		System.out.println("평균신장은: "+avg);
//		System.out.println("가장 큰 학생은"+name[maxArrayNo]+"이고 그 학생의 키는"+height[maxArrayNo]);
//		System.out.println("가장 큰 학생은"+name[minArrayNo]+"이고 그 학생의 키는"+height[minArrayNo]);
		
		
		
		
		
		
		//완성하고 찬찬히 보면 일겠는데 만들려니까 머리 터져나가네;
		String[]name = {"James", "Cathy", "Kenny", "Martin", "Crystal"};
		int[] height =new int[name.length];//이렇게 적어두면 이름과 키가 같은 사람들끼 뜨게 할 수 있다.
		int avg = 0;
		int tot =0;
		int maxArrayNo=0;
		int minArrayNo=0;
		int maxHeight=0;
		int minHeight=10000;
		
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i]+"의 신장을 입력하세요!");
			height[i]=scanner.nextInt();
			tot+=height[i];
			avg=tot/name.length;
			if(maxHeight<=height[i]) {
				maxHeight=height[i];
				maxArrayNo =i;
			}
			if(minHeight>=height[i]) {
				minHeight = height[i];
				minArrayNo = i;
			}
		}
		System.out.println("평균신장은: "+avg);
		System.out.println("가장 큰 학생은"+name[maxArrayNo]+"이고 그 학생의 키는"+height[maxArrayNo]);
		System.out.println("가장 작 학생은"+name[minArrayNo]+"이고 그 학생의 키는"+height[minArrayNo]);
		
		
	}

}
