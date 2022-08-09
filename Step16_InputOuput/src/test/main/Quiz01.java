package test.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) throws IOException {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("문자열 입력 : ");
			String str = sc.nextLine();
			
			File f1 = new File("c:/workspace/myFolder/quiz.txt");
			FileWriter fw = null;
			BufferedWriter bw = null;
			
			try {
				if(!f1.exists()) {
					f1.createNewFile();
				}
				fw = new FileWriter(f1, true);
				bw = new BufferedWriter(fw);
				bw.write(str);
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if(bw!=null) bw.close();
				if(fw!=null) fw.close();
			}
	}
}
