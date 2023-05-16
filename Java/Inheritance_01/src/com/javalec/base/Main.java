package com.javalec.base;

import java.security.PublicKey;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child(); //Parents 클래스는 임포트 할 필요가 없는게 Child 클래스에 전부 증여해줬기 때문에 Child만 임포트 해놔도 Parents에 있는 Method를 사용하는게 가능하
		child.getFather();
		child.getMother();
		child.getChild();
		
		System.out.println(child.pStr);
		System.out.println(child.cStr);
		
	}

}
