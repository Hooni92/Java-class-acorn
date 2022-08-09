package test.mypac;

public class Phone { // 어떤 클래스도 상속 받지 않으면 자동으로 extends Object 된다.
	
	/*
	 * heap 영역에 들어있는 참조값에 대한 객체의 타입이 다양하게 존재함 => 다형성
	 * 
	 */
	// 생성자
	public Phone() {
		System.out.println("Phone 생성자 호출됨");
	}
	
	// 전화거는 메소드
	public void call() {
		System.out.println("전화를 걸어요!");
	}
}

