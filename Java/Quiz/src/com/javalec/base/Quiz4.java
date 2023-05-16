package com.javalec.base;
import java.util.Scanner;
public class Quiz4 {
	public static void main(String[] args) {

	//입력한 숫자 만큼 별 모양이 증가하면서 출력하다가 다시 감소하면서 출력하기
		Scanner scanner=new Scanner(System.in);
		int starnum;
		String star= "*";

		System.out.print("Input your decimal no : ");
		starnum=scanner.nextInt();
			// 별 증가
		for(int i=1; i<=starnum; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(star);
				}			
				System.out.println(""); //if 쓸필요 없이 i랑 j랑 같아지면 별의 갯수만큼 나오는거라서 밖에 뺄 수 있음
			}
			// 별 감소
		for(int i=starnum-1; i>0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(star);
				}
				System.out.println("");
			}
 }
}