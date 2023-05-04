package com.javalec.base;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// Map은 메모리가 2배 정도 필요해서 쓰긴 편하지만 보통 ArrayList를 씀
		// Map, Dictionary : Key와 Value 구성
		HashMap<String, String> hashMap = new HashMap<>();
		
		hashMap.put("Apple", "사과"); // 입력값이 Apple 일 때 사과가 나오게 함
		hashMap.put("Banana", "바나나");
		
		System.out.println(hashMap);
		System.out.println(hashMap.get("Apple"));
		
		
		hashMap.remove("Apple"); // 삭제
		System.out.println(hashMap);
		
		
		
	}

}
