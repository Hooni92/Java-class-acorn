package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass04 {
	public static void main(String[] args) {
		// File f = new File("c:/acorn202206/myFolder/memo.txt");
		File f = new File("c:/workspace/myFolder/memo.txt");
		
		// 객체를 생성하거나 메소드를 호출했을 때 exception이 호출하는지 여부 확인하고 try catch로 묶기
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
