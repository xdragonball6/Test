package com.javalec.funtion;

public class StoreShop3 extends StoreHQ{
	
	// Field
	int seven=7000;
	//Constructor
	public StoreShop3() {
		// TODO Auto-generated constructor stub
	}
	
	//Method
	@Override
	public void Kimchi() {
		System.out.println("김치찌개 : 6000원");
	}
	@Override
	public void Budae() {
		System.out.println("부대찌개 : 7000원");
	}
	@Override
	public void Bibim() {
		System.out.println("비빔밥 : 7000원");
	}
	@Override
	public void Sundea( ) {
		System.out.println("순대국밥 : 6000원");
	}
}
