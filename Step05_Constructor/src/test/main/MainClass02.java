package test.main;

import test.mypac.Member;

public class MainClass02 {

	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다");
		//디버깅 모드로 실행을 해서 m1, m2, m3를 확인해보세요
		Member m1=new Member(1, "이승훈", "고양시");
		Member m2=new Member(1, "이은석", "금천구");
		Member m3=new Member(1, "김기덕", "남양주");
		//default 생성자를 이용해서 객체를 생성하면 field 에는 기본값이 들어 있다.
		Member m4 = new Member();
	}
}
