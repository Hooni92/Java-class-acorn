package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		// main 메소드의 흐름을 사용자가 일정시간 잡아둘 수가 있는 방법이 있다.
		
		try {
			Thread.sleep(5000); 
			// RuntimeException이 부모에 없는 애들은 무조건적으로 try catch 문법으로 예외를 묶어줘야만한다.
			//thread 클래스는 try catch로 묶어줘야만 문법이 성립한다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
