package test.main;

import test.mypac.Drill;

public class MainClass04 {
	public static void main(String[] args) {
		useDrill(new Drill() {
			
			@Override
			public void hole() {
				System.out.println("벽에 구멍을 뚫어요!");
			}
		});
		//Interface 메소드가 오직 하나일떄 가능한 방법.
		useDrill(()->{
			System.out.println("벽에 구멍을 한번 더뚫어요!");
		});
		//으악 이게 뭐지?
		Drill d2=()->{
			System.out.println("벽에 구멍을 두번 더뚫어요!");
		};
		//Drill type을 메소드의 인자로 전달하기
		useDrill(d2);
		//Drill type 의 메소드 직접 호출하기.
		d2.hole();
		Drill d3=new Drill() {

			@Override
			public void hole() {
				// TODO Auto-generated method stub
				
			}
		};
	}
	//Drill 인터페이스 type을 인자로 전달받는 메소드
	public static void useDrill(Drill d) {
		d.hole();
	}
}
