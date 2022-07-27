package test.main;

import test.mypack.Arrow;
import test.mypack.Gun;
import test.mypack.MyObject;
import test.mypack.Radio;

public class MainClass04 {
	
	public static void main(String[] args) {
		MyObject obj=new MyObject();
		obj.setNum(999);
		obj.setName("kim");
		
		//useRadio()메소드도 호출해 보세요
		obj.useRadio(new Radio());
		
		//메소드의 인자로 전달할 값이 이미 준비 되어 있을 수도 있다.
		Radio r = new Radio();
		//이미 준비 되어 있다면 메소드 호출하면서 준비된 값을 참조해서 전달하면 된다.
		obj.useRadio(r);
		
		//attack() 메소드를 호출해 보세요.
		obj.attack(new Gun(), new Arrow());
	}
}
