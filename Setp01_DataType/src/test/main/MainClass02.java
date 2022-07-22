package test.main;

public class MainClass02 {

	public static void main(String[] args) {
		System.out.println("maun 메소드가 시작 되었습니다.");
		
		//국어점수
		int kor=95;
		// 영어점수
		int eng=100;
		
		// 국어 점수와 영어 점수의 평균을 구해서 변수에 담고 그 결과를 콘솔창에 출력해 보세요.(소수점 도 나오게)
		
		double avg=((double)kor+eng)/2;
		/*
		 * 정수 와 정수를 연산하면 정수만 나오기 때문에
		 * 정확한 실수 값을 얻어내기 위해서는 연산에 참여하는 숫자중에 적어도 하나는 실수가 되어야 한다. 
		 */
		System.out.println(avg);
		
		
	}

}
