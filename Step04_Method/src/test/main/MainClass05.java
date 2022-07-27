package test.main;

import test.mypack.Messenger;
import test.mypack.Radio;

public class MainClass05 {
	
	public static void main(String[] args) {
		//Messenger 클래스의 sendMessage(), getMessage(), useRadio() 메소드를 호출해 보세요.
		
		Messenger.sendMeesage("hi");
		Messenger.getMessage();
		Messenger.uesRadio(new Radio());
	}
}
