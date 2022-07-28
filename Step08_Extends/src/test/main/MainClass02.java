package test.main;

import test.pack.HandPhone;
import test.pack.Phone;
/*
 *  java 의 다향성
 *  
 *  - 객체는 type을 여러개를 가질 수 있다.
 */
public class MainClass02 {
	public static void main(String[] args) {
		//HandPhone 객체를 생성해서 참조값을 HandPhone type 변수에 담기
		HandPhone p1=new HandPhone();
		
		//HandPhone 객체를 생성해서 참조값을 Phone type 변수에 담기
		Phone p2=new HandPhone();
		
		//HandPhon 객체를 생성해서 참조값을 Object type 변수에 담기
		Object p3=new HandPhone();
		
	}
}
