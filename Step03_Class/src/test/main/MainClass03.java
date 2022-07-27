package test.main;

import test.mypack.Member;

public class MainClass03 {
	
	public static void main(String[] args) {
		//Member 객체를 생성해서 그 참조값을 mem1 이라는 지역변수에 담아 보세요(1줄)
		Member mem1= new Member();
		mem1.num=1;
		mem1.name="김구라";
		mem1.addr="노량진";
		
		//Member 객체를 생성해서 그 참조값을 mem2 라는 지역변수에 담고 해골의 정보도 담아보세요
		Member mem2= new Member();
		mem2.num=2;
		mem2.name="해골";
		mem2.addr="행신동";
		
		//mem1, mem2에 들어있는 참조값을 이용해서 show()메소드 호출하기
		mem1.showInfo();
		mem2.showInfo();
	
	}
}
