package test.main;

import java.util.ArrayList;

import test.mypac.Car;

public class MainClass06 {
	public static void main(String[] args) {
		// 1. Car type 을 저장할 수 있는 ArrayList 객체를 생성해서
		// 참조값을 ArrayList 인터페이스 type 지역변수 cars에 담아보세요
		ArrayList<Car> cars = new ArrayList<Car>();
		
		// 2. Car 객체(3개)를 생성해서 ArrayList 객체에 저장해 보세요.
		Car car1 = new Car("소나타");
		Car car2 = new Car("그랜저");
		Car car3 = new Car("아이오닉");
		
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		
		// 3. 반복문 for문을 이용해서 ArrayList 객체에 저장된 모든 Car 객체의 drive() 메소드를
		// 순서대로 호출해 보세요.
		for(int i=0; i<cars.size(); i++)
		{
			cars.get(i).drive();
		}
		
		/*
		 * 
		 * for(Car tmp:cars){
		 * 		tmp.drive();
		 * }
		 */
	}
}
