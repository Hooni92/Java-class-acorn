package test.main;

import java.util.ArrayList;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass01 {

	public static void main(String[] args) {
		Remocon r1 = new Remocon() {
			
			@Override
			public void up() {
				System.out.println("채널을 올려요");
			}
			
			@Override
			public void down() {
				System.out.println("채널을 내려요");
			}
		};
		r1.down();
		r1.up();
		/*
		 *  필드나 지역변수에 final 이라는 예약어를 붙이면 변수가 아니고 상수가 된다.
		 *  상수는 값이 변경되지 않는 것이 상수이다.
		 *  따라서 아래의 num, name, r2 에 다른 값을 다시 대입할 수 가 없다.
		 */
		final int num=10;
		final String name="kim";
		
		/*
		 * 관례상 final 지역변수나 필드는 모두 대문자로 표기한다.
		 * 
		 * 숫자를 상소화 시키면 복잡한 숫자에 이름을 부여하는 효과를 준다.
		 * 
		 * 문자열을 상수화 시키면 혼돈하기 쉬운 문자열에 이름을 부여하는 효과를 준다.
		 * 
		 * 프로그래머가 복잡한 숫자나 혼돈하기 쉬운 문자열을 쉽게 불러다 쓸수 있도록 도움을 준다.
		 */
		final double PI=3.141592;
		final String GREET_KOR="안녕하세요";
		final String GREET_ENG="hello";
		final String GREET_JPN="곤니찌와";
		final String GREET_CHN="니하오";
		//인터페이스의 static final 필드 참조하기
		String a=Remocon.COMPANY;

	}
}
