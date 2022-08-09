package test.main;

import java.io.File;

public class MainClass10 {
	public static void main(String[] args) {
		File f1 = new File("c:/workspace/myFolder/folder1");
		
		// 폴더 만들기
		f1.mkdir();
		
		/*
		 * 위 코드를 참고해서
		 * c:/workspace/myFolder 폴더 안에
		 * 폴더 1000개를 만들어보세요.
		 * 폴더명은 folder1,2 ,3 ... 1000;
		 */
		
		for(int i=0; i<1000; i++)
		{
			File f2 = new File("c:/workspace/myFolder/folder"+(i+1));
			if(f2.exists()) {
				f2.delete();
			} else {
				f2.mkdir();
			}
		}
	}
}
