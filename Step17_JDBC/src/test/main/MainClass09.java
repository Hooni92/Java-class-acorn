package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass09 {
	public static void main(String[] args) {
		// 수정할 회원의 정보
		int num = 1;
		String name = "호빵";
		String addr = "아현동";
		
		// 아래의 update() 메소드를 활용해서 회원 정보를 수정할 수 있도록 해 보세요.
		MemberDto dto = new MemberDto(num, name, addr);
		update(dto);
	}
	
	public static void update(MemberDto dto) {
		Connection conn=null;
	    PreparedStatement pstmt=null;
	      
	    try {
	       String sql="UPDATE member"
	               + " SET name=? , addr=?"
	               + " WHERE num=?";
	       
	       	 conn=new DBConnect().getConn();
	       	 
	         pstmt=conn.prepareStatement(sql);
	         
	         pstmt.setString(1, dto.getName());
	         pstmt.setString(2, dto.getAddr());
	         pstmt.setInt(3, dto.getNum());
	         
	         pstmt.executeUpdate();
	         System.out.println("회원 정보를 수정했습니다.");
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
