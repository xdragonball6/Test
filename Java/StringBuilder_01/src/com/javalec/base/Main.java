package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1=new String("abc");
		
		StringBuilder stringBuilder =new StringBuilder("abcdefg");
		stringBuilder.append("hijklmn");//append는 뒤에 붙일때 사용한다
		System.out.println(stringBuilder);
		
		stringBuilder.insert(3, "zzz");//insert를 적으면 3번째에 zzz를 추가하는 작업
		System.out.println(stringBuilder);
		
		stringBuilder.delete(3, 6);//delete를 적으면 3번째부터 6까지 지워주는 작업
		System.out.println(stringBuilder);
		
		
		
	}

}
