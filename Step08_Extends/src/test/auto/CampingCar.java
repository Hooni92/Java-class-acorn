package test.auto;

public class CampingCar extends Car {

	public CampingCar(Engine engine) {
		super(engine);
	
	}

	public void carTent() {
		System.out.println("텐트를 펼쳐요");
	}
}
