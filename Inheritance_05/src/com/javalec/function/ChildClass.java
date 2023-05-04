package com.javalec.function;

public class ChildClass extends ParentsClass{

	public ChildClass() {
		// TODO Auto-generated constructor stub
		System.out.println("Child Class");
		this.method(); //자기 클래스에 있는 method를 실행한다는 뜻이다.
		super.method(); //상속자의 method를 실행하겠다는 뜻이다.
	}
	
	
	@Override
	public void method() {
		System.out.println("Child Method");
		super.method();
	}
}
