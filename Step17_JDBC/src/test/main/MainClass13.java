package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass13 {

	public static void main(String[] args) {
		String name="햄버거";
		String addr="맥도날드";
		/*
		 * 위의 회원정보를 MemberDao 객체를 이용해서 DB에 저장하고
		 * 성공이면"회원정보를 추가했습니다"
		 * 실패면 "추가 실패!"
		 * 를 콘솔창에 code를 작성해보세요
		 */
		MemberDto dto=new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		boolean isSuccess=new MemberDao().insert(dto);
		
		// 성공이냐 실패냐에 따라 선택적인 작업을 할 수 있다.
		if(isSuccess) {
			System.out.println("회원정보를 추가했습니다");
		}else {
			System.out.println("추가 실패!");
		}
	}
}