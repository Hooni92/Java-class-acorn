package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Quiz01 {
	public static void main(String[] args) {
		/*	1번 문제
		 * 	콘솔창에 emp 테이블에 근무하는 사원의
		 * 	사원번호, 사원이름, 부서번호, 급여를 급여에 대해서 내림차순으로 정렬해서 출력해보세요
		 */
		
		//DB 연결객체를 담을 지역 변수 만들기
	      Connection conn=null;
	      
	      try {
	         //오라클 드라이버 로딩
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         //접속할 DB 의 정보 @아이피주소:port번호:db이름
	         String url="jdbc:oracle:thin:@localhost:1521:xe";
	         //계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
	         conn=DriverManager.getConnection(url, "scott", "tiger");
	         //예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
	         System.out.println("Oracle DB 접속 성공");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      
	      PreparedStatement pstmt=null;
	      ResultSet rs = null;
	      try {
	         //실행할 미완성의 sql 문
	         String sql="SELECT empno, ename, deptno, sal FROM emp"
	    			  + " ORDER BY sal DESC";
	         pstmt = conn.prepareStatement(sql);
	    	 // PreparedStatement 객체를 이용해서 query 문 수행하고 결과를
	    	 // ResultSet 객체로 받아오기
	    	 rs = pstmt.executeQuery(); //executeQuery()가 select문을 수행하는 메소드
	    	 while(rs.next()) {
	    		 int empno = rs.getInt("empno");
	    		 String ename = rs.getString("ename");
	    		 int deptno = rs.getInt("deptno");
	    		 int sal = rs.getInt("sal");
	    		 // 콘솔창에 출력해보기
	    		 System.out.println(empno+" | "+ename+" | "+deptno+" | "+sal);
	    	  }
	      } catch(Exception e) {
	         e.printStackTrace();
	      }
	      System.out.println("main 메소드가 종료 됩니다.");
	  }
}
