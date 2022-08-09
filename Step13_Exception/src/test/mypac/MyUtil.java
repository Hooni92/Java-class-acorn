package test.mypac;

public class MyUtil {
	public static void draw() { // 자체적으로 오류를 처리했기에 문제없이 사용 가능
		System.out.println("5초 동안 그림을 그려요");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("그림 완성");
	}
	
	// 메소드 안에서 발생하는 Exception을 던져 버리는 경우
	// 메소드를 호출하는 쪽에서 해당 예외를 처리해야 한다.
	public static void send() throws InterruptedException { // 자체적으로 처리 안하고 메소드를 호출하는쪽으로 떠넘김
		System.out.println("5초동안 전송을 해요");
		
		// unhandled exception이 발생했을 때는 add throw declaration을 누르면 메소드에 throws InterruptedException이 나옴
		// 이 이야기는 호출하는 쪽에서 알아서 처리한다는 의미로 처리를 던진다는 의미
		Thread.sleep(5000);
		
		System.out.println("전송 완료!");
	}
}
