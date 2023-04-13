package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// 1부터 100까지의 합계 구하기
		int tot=0;
		for(int i=1; i<=100; i++) {
			tot +=i;
		}
		System.out.println("tot :"+tot);
		
		// --------------
		tot=0;
		int i = 1;
		while(i<=100) {
			tot+=i;
			i++; //i가 100보다 커질 때 멈추게 만들어주는 역할을 함(while에 들어간 조건)
		}
		System.out.println("tot :"+tot);
		
		
		//---------------
		tot=0;
		i=1;
		while(true) { //true로 해놔야지 재료 소진할때까지 키오스크에서 사용 가능
			tot+=i;
			i++;
			if(i>100) {
				break; //break를 if 조건	뒤에 둬야 원하는 조건 만들기 가능 
			}
		}
		System.out.println("tot :"+tot);
		
		
		//----------break-------------
		for(int j=1; j<1000000; j++) {
			if(j==10) {
				System.out.println("Find");
				break;
			}
		}
		
		//----------continue-----------
		for(int j=1; j<=10; j++) {
			if(j==5) {
				continue; //다시 반복문으로 흘러가라는 뜻을 지니고 있음. j에서 5는 무시되고 6부터 흘러감
			}
			System.out.println(j);
		}
		
	
		
	}

}
