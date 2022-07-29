package test.main;

import test.mypac.Weapon;

public class MainClass05 {
	
	public static void main(String[] args) {
		Weapon w1=new Weapon() {
			
			@Override
			public void attack() {
				System.out.println("메롱메롱");
			}
		};
		useWeapon(w1);
		//지역변수를 만들지 않고 바로 익명클래스로 객체생성 후 참조값 전달하기
		useWeapon(new Weapon() {
			
			@Override
			public void attack() {
				System.out.println("시스템아웃프린트엘엔");
			}
		});
	}
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}

}