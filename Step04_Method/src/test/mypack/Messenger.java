package test.mypack;

public class Messenger {
	//String type 을 인자로 전달받는 Static 메소드
	public static void sendMeesage(String msg) {
		System.out.println(msg+"를 전송합니다.");
	}
	//String type을 리턴해주는 static메소드
	public static String getMessage() {
		return "hello";
	}
	public static void uesRadio(Radio r) {
		r.listenMusic();
	}
}
