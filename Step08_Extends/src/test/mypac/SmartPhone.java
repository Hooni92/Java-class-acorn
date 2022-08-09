package test.mypac;

public class SmartPhone extends HandPhone{ // 부모 클래스를 상속 받아도 특정 메소드가 마음에 안들 수도 있음.
	// 즉, 덮어쓰기 == 재정의 == Override를 하고 싶음
	
	// 생성자
	public SmartPhone() {
		// 부모생성자 즉 HandPhone 클래스의 생성자를 호출하는 표현식이다.
		// super(); // 부모생성자 중에서 default 생성자를 호출할 때는 생략 가능하다 -> 다른 작업이 아닌 최우선으로 진행되어야함
		// => 부모생성자로 전달해야하는 값이 있으면 생략안하고 사용을 한다.
		
		System.out.println("SmartPhone 생성자 호출됨");
	}
	
	// 인터넷 기능
	public void doInternet() {
		System.out.println("인터넷을 해요");
	}
	// 사진 찍는 메소드 재정의(오버라이드) 하기
	@Override
		public void takePicture() {
			System.out.println("1000만 화소의 사진을 찍어요");
		}
}
