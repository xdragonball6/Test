package com.javalec.funtion;

public class StoreShop1 extends StoreHQ {
	// Field
	
	//Constructor
	public StoreShop1() {
		// TODO Auto-generated constructor stub
	}
		
		
	//Method
	@Override
	public void Kimchi() {
		System.out.println("김치찌개 : 4500원");
	}
		
	@Override
	public void Budae() {
		System.out.println("부대찌개 : 5000원");
	}
	@Override
	public void Sundea() {
		System.out.println("순대국밥 : 판매하지 않습니다.");
	}
}
