package test.main;

import test.mypac.testDto;

public class testdtoMainClass {

	public static void main(String[] args) {
		testDto dto1 = new testDto();
		dto1.setNum(1);
		dto1.setName("이승훈");
		dto1.setAge(24);
		dto1.setAddr("원흥동");
		testDto dto2 = new testDto();
		dto2.setNum(2);
		dto2.setName("이은석");
		dto2.setAge(28);
		dto2.setAddr("금천구");
		testDto dto3 = new testDto();
		dto3.setNum(3);
		dto3.setName("김기덕");
		dto3.setAge(29);
		dto3.setAddr("남양주");
		testDto dto4 = new testDto();
		dto4.setNum(4);
		dto4.setName("조동현");
		dto4.setAge(25);
		dto4.setAddr("호계동");
		testDto dto5 = new testDto();
		dto5.setNum(5);
		dto5.setName("이용환");
		dto5.setAge(31);
		dto5.setAddr("연희동");
		
		testDto[] members = new testDto[5];
		
		members[0] = dto1;
		members[1] = dto2;
		members[2] = dto3;
		members[3] = dto4;
		members[4] = dto5;
		
		for(int i=0; i<members.length; i++) {
			testDto tmp= members[i];
			System.out.println("번호:"+tmp.getNum()+", 이름:"+tmp.getName()+", 나이:"+tmp.getAge()+", 주소:"+tmp.getAddr());
		}
		
		
	}
}
