package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass13 {
	public static void main(String[] args) {
		/*
		 * FileReader 객체를 활용해서
		 * 
		 * c:/workspace/myFolder/memo.txt 파일에 있는 모든 문자를
		 * 
		 * 콘솔창에 출력하는 코드를 작성해 보세요.
		 * 
		 * - hint
		 * 1. 반복문 돌면서 한글자씩 읽어내야 한다.
		 * 2. 반복문을 몇번 돌아야 하는지 확실치 않다.
		 * 3. 읽어낸 코드값을 char type으로 casting 해야 문자 1개를 확인 할 수 있다.
		 * 4. 개행하지 않고 콘솔에 출력하는 방법은 System.out.print() 메소드를 활용하면 된다.
		 */
		File f1 = new File("c:/workspace/myFolder/memo.txt");
		
		try {
			// 파일에서 문자열을 읽어들일 수 있는 객체 생성
			FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				// 문자열 한줄 읽어내기
				String line = br.readLine();
				// 더이상 읽을 데이터가 없으면 반복문 탈출
				if(line == null) {
					break;
				}
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
