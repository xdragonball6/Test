package com.javalec.base;

import com.javalec.funtion.StoreHQ;
import com.javalec.funtion.StoreShop1;
import com.javalec.funtion.StoreShop2;
import com.javalec.funtion.StoreShop3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StoreHQ[] store= //HQ 즉 본사에서 상속받은 녀석들이라서 HQ로 같은 타입으로 묶인다.
			{new StoreHQ(), new StoreShop1(), new StoreShop2(), new StoreShop3()}; //배열로 적은 뒤
		
		for(int i=0; i<store.length; i++) { // for 문으로 나오게도 가능함
			store[i].Kimchi();
			store[i].Budae();
			store[i].Bibim();
			store[i].Sundea();
			store[i].Gongi();
		}
		//
		//
		//
		
		System.out.println("-------shop1---");
		store[0].all();
		System.out.println();
		
		System.out.println("------shop2---");
		store[1].all();
		System.out.println();
		
		System.out.println("------shop3---");
		store[2].all();
		System.out.println();
	}

}
