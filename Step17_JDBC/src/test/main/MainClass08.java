package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;

import test.util.DBConnect;

public class MainClass08 {
	public static void main(String[] args) {
		String name = "덩어리";
		String addr = "상도동";
		// 추가할 회원 정보를 Map 객체에 담고
		Map<String, String> mem = new HashMap<>();
		// insert 메소드에 전달해서 DB에 저장되는 기능을 완성해보세요.
		mem.put("name", name);
		mem.put("addr", addr);
		insert(mem);
	}
	
	// 인자로 전달 받은 Map 객체에 있는 회원 정보를 DB에 저장하는 메소드
	public static void insert(Map <String, String> map ) {
		Connection conn=null;
	    PreparedStatement pstmt=null;
	      
	    try {
	       String sql="INSERT INTO member(num,name,addr)"
	             + " VALUES(member_seq.NEXTVAL,?,?)";
	       	 conn=new DBConnect().getConn();
	         pstmt=conn.prepareStatement(sql);
	         pstmt.setString(1, map.get("name"));
	         pstmt.setString(2, map.get("addr"));
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
