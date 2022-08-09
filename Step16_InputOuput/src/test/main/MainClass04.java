package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class MainClass04 {
	public static void main(String[] args) {
		PrintStream ps = System.out;
		
		// 학습을 위해서 PrintStream 객체를 부모 type OuputStream으로 받아보기
		// OutputStream도 1byte 처리 스트림이다.
		// OutputStream은 PrintStream의 상위 클래스이지만 기능적으로는 PrintStream에서가 더 많다(위쪽 클래스가 기능이 더 빈약)
		
		OutputStream os = ps;
		try {
			os.write(97); // 출력할 준비만 한거임
			os.write(98);
			os.write(44032);
			os.flush(); // 출력을 방출해주는 역할
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
