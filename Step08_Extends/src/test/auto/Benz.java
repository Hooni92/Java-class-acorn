package test.auto;

public class Benz extends Car{
	//Engine type 을 전달 받는 생성자
	public Benz(Engine engine) {
		// 부모 생정자를 호출하면서 필요한 값을 전달해 준다.
		super(engine);
		
	}
	//메소드 
	public void smoothDrive() {
		System.out.println("부드럽고 조용하게 달려요!");
	}
}
