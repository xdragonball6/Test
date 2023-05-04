package com.javalec.base;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ArrayList
		//<> Generic이라 부른다.
		ArrayList<String> arrayList = new ArrayList<String>(); //String만 사용 가능한 배열리스트. Listtype의 컬랙션
		
		arrayList.add("str1");
		arrayList.add("str2");
		arrayList.add("str3");
		arrayList.add("str4");

		System.out.println(arrayList);
		System.out.println(arrayList.size()); //size=length
		
		
		for(int i=0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i)); //arrayList에 i 번째 있는걸 가져온다는 뜻
		}
		
		arrayList.set(1, "str22"); // set은 arrayList에 1 번째 있는걸 str22로 바꿔준다는 의미를 가지고 있음
		System.out.println(arrayList);
		
		arrayList.remove(1); //remove는 1번째 있는걸 없애준다
		System.out.println(arrayList);
		
		arrayList.add(0, "AAA"); // add는 0번째에 AAA를 더해준다
		System.out.println(arrayList);
		
		arrayList.clear();// clear는 arrayList 안에 배열은 없애준다
		System.out.println(arrayList);
		
	}

}
