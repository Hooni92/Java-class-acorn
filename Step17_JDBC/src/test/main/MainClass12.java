package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.util.DBConnect;

public class MainClass12 {

	public static void main(String[] args) {
		//삭제할 회원의 번호라고 가정하자.
		int num=2;
		//회원의 정보를 삭제하고 성공여부를 리턴 받는다.
		boolean isSuccess=delete(2);
		// 성공이냐 실패냐에 따라 선택적인 작업을 할 수 있다.
		if(isSuccess) {
			System.out.println(num+" 번 회원을 삭제 했습니다");
		}else {
			System.out.println(num+" 번 회원 삭제 실패!");
		}
			
	}
	//회원 한명의 정보를 삭제하는 메소드
	public static boolean delete(int num) {
		Connection conn=null;
	    PreparedStatement pstmt=null;
	    int updateRowCount=0;
	    try {
	    	 conn=new DBConnect().getConn();  
	    	 //실행할 sql 문
	    	 String sql="DELETE FROM member"
	               + " WHERE num=?";
	         pstmt=conn.prepareStatement(sql);
	         pstmt.setInt(1, num);
	         //실행 후 메소드가 리턴해주는 변화된 행의 갯수를 지역변수에 담는다.
	         updateRowCount=pstmt.executeUpdate();
	         System.out.println("회원정보를 삭제했습니다.");
	      } catch (Exception e) {
	    	  try {
	            if(pstmt!=null)pstmt.close();
	            if(conn!=null)conn.close();
	         } catch (Exception e1) {
	            e1.printStackTrace();
	         }
	      }
		if(updateRowCount>0) {
			return true;
		}else {
			return false;
		}
	}
}
