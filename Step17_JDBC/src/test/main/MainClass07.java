package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass07 {
	public static void main(String[] args) {
		// member 테이블에 추가할 회원의 정보
		String name = "주뎅이";
		String addr = "봉천동";
		
		// 회원 한명의 정보를 MemberDto 객체에 담고
		MemberDto dto = new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		
		// 메소드 호출하면서 MemberDto 객체를 전달한다.
		insert(dto);
	}
	
	// 회원 한명의 정보를 추가하는 메소드
	public static void insert(MemberDto dto) {
		// MemberDto 객체에 담긴 회원 정보를 DB에 저장하는 작업을 해보세요. 시퀀스 사용하
		Connection conn=null;
	    PreparedStatement pstmt=null;
	      
	    try {
	    	conn=new DBConnect().getConn();
	    	String sql="INSERT INTO member(num,name,addr)"
	             + " VALUES(member_seq.NEXTVAL,?,?)";
	    	
	         pstmt=conn.prepareStatement(sql);
	         pstmt.setString(1, dto.getName());
	         pstmt.setString(2, dto.getAddr());
	         pstmt.executeUpdate();
	         System.out.println("추가되었습니다.");
	      } catch (Exception e) {
	         try {
	            if(pstmt!=null)pstmt.close();
	            if(conn!=null)conn.close();
	         } catch (Exception e1) {
	            // TODO Auto-generated catch block
	            e1.printStackTrace();
	         }
	      }

	}
	
}
