package test.main;
//Car 객체를 생성할 설계도를 import 한다.
import test.mypack.Car;
public class MainClass02 {

	public static void main(String[] args) {
		//달리고 싶다~ 어떻게 하면 달릴 수 있을까?
		Car run= new Car();
		run.drive();
		
		String carname= run.name;
	}
}
