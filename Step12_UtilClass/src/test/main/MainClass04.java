package test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * 	Scanner 객체를 이용해서 반복문 돌면서 친구 이름을 3번 입력 받아서
		 * 	입력 받은 이름을 ArrayLisyt 객체에 순서대로 저장을 하는 프로그래밍을 해보세요.
		 */
		Scanner sc = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		for(int i=0; i<3; i++) {
			System.out.print("이름 입력 : ");
			names.add(sc.nextLine());
		}
		System.out.println(names);
	}
	
	/*
	 * 저장된 내용 출력할때 확장 for문 사용하기
	 * 
	 * for(String tmp:names) {
	 * 		System.out.println(tmp);
	 * }
	 */
}
