package test.main;

import java.util.Scanner;

public class MainClass08 {

	public static void main(String[] args) {
		//Scanner 객체를 생성해서 scan이라는 지역변수에 참조값 담기
		Scanner	scan=new Scanner(System.in);
		//콘솔에 입력한 문자열을 읽어와서 변수에 담기
		String line=scan.nextLine();
		//변수를 콘솔창에 출력하기
		System.out.println("line:"+line);
	}
}
