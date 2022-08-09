package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass11 {
	public static void main(String[] args) {
		// 문자열을 저장할 파일을 만들기 위한 File 객체
		File memoFile = new File("c:/workspace/myFolder/memo.txt");
		try {
			/*
			 * if(memoFile.exist() == false){ }
			 * if(!memoFile.exist()){ }
			 * 위의 if 문은 동일 로직의 if문이다.
			 */
			// 파일이 존재하지 않으면
			if(!memoFile.exists()) {
				// 파일을 만든다
				memoFile.createNewFile();
			}
			// 파일에 문자열을 출력할 수 있는 FileWriter 객체
			// 여러번 실행해도 누적이 안됨(덮어쓴다는 뜻) 하지만 밑에 처럼 boolean type을 적어주면 기존의 것을 유지하되 추가한다는 것임)
			// 즉, boolean type은 append를 해준다는 뜻
			FileWriter fw = new FileWriter(memoFile, true);
			fw.write("동쪽으로 가면 귀인을 만나요");
			fw.write("\r\n");
			fw.write("뻥치지마");
			fw.write("\r\n");
			fw.write("어쩌구...저쩌구...");
			fw.write("\r\n");
			fw.flush();
			fw.close(); // 출력을 다 했으면 마무리 한다.
			System.out.println("파일에 문자열을 저장했습니다.");
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
