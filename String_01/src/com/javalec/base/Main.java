package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) { //pubilc을 private로 바꾸면 나 외에는 클래스를 돌리지 못함
		
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String str=new String("abcd");//String str="abcd";
		String str0= new String("가나다라마바사");
		String str1="abcdefg";
		String str2="HIJKLMN";
		String str3="   abc   ";
		String str4="010-1212-3434";
		
		System.out.println(str1.concat(str2)); // 문자열 연결
		System.out.println(str1.substring(3)); // 문자열 자르기 
		System.out.println(str0.substring(3, 5)); //문자열 자르기 3~5까지
		System.out.println(str0.length());// 몇글자가 적혀있는지 나타냄
		System.out.println(str1.toUpperCase());//소문자를 대문자로 만들어줌
		System.out.println(str1.toUpperCase().concat(str2));//소문자를 대문자로 만들어준 뒤에 문자열을 붙이겠다
		System.out.println(str2.toLowerCase());
		System.out.println(str1.concat(str2).toLowerCase());//대문자를 소문자로 만들어준 뒤에 문자열을 붙임
		
		System.out.println(str1.charAt(0)); //문자열 0번째 있는 문자를 나타냄
		System.out.println(str1.indexOf('a'));//문자열에 a가 몇번째에 적혀있는지 나타냄
		System.out.println(str1.equals(str2));//str1과 str2가 같다면 true 다르다면 false가 뜬다
		System.out.println(str3);
		System.out.println(str3.trim());//앞 뒤의 공백을 없애주는 커맨드임
		System.out.println(str1.replace('a', 'z'));//a를 z로 바꿔서 나오게 만듦
		System.out.println(str1.replaceAll("abc", "zzzzzzzz"));//여러 글자를 바꿀 때는 replaceAll을 써줘야함

		// 010-1212-3434 -> 010-****-****		
		System.out.println(str4.replaceAll("1212-3434", "****-****"));
		System.out.println(str4.replaceAll(str4.substring(4),"****-****"));
		System.out.println(str4.substring(0,4).concat("****-****"));
		
		
		
	}

}
