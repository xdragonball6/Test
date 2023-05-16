package com.javalec.funtion;

public class ChildMenu extends ParentsMenu {

	// Field
	
	
	// Constructor
	public ChildMenu() {
		// TODO Auto-generated constructor stub
	}
	// Method
	public void makeHotDoen() {
		System.out.println("얼큰 된장국");
	}
	public void makeHotDoen(String str1) {
		System.out.println("얼큰 된장국");
	}
	@Override // Method에 덧씌워진거다
	public void makeChung() {
		System.out.println("냄새 없는 청국장");
	}
	
}
