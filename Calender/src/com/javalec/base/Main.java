package com.javalec.base;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar calendar=Calendar.getInstance();
		String[] dateName= {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		
		int year= calendar.get(Calendar.YEAR); //연도 나타내는 방법
		int month=calendar.get(Calendar.MONTH)+1;//월 나타내는 방법
		int day=calendar.get(Calendar.DAY_OF_MONTH);//일 나타내는 방법
		int date=calendar.get(Calendar.DAY_OF_WEEK);//요일 나타내는 방법
		
		int hour=calendar.get(Calendar.HOUR);//시간 나타내는 방법
		int minute=calendar.get(Calendar.MINUTE);//분 나타내는 방법
		int second=calendar.get(Calendar.SECOND);//초 나타내는 방법
		
		System.out.println(year+"."+String.format("%02d", month)+"."+day+"."+"("+dateName[date-1]+")");
		System.out.println(hour+":"+minute+":"+second);
		
	}

}
