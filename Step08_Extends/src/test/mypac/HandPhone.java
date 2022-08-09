package test.mypac;

public class HandPhone extends Phone { // Phone을 상속받았다는 뜻 (상속받은 클래스를 슈퍼클래스라고도 부름)
	// 생성자
	public HandPhone() {
		System.out.println("HandPhone 생성자 호출됨");
	}
	
	public void mobileCall() {
		System.out.println("이동중에 전화를 걸어요!");
	}
	
	public void takePicture() {
		System.out.println("30만 화소의 사진을 찍어요");
	}
}
