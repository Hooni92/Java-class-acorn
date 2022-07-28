package test.main;

import test.auto.CampingCar;
import test.auto.Engine;

public class MainClass08 {

	public static void main(String[] args) {
		CampingCar campingcar=new CampingCar(new Engine());
		campingcar.carTent();
	}
}
