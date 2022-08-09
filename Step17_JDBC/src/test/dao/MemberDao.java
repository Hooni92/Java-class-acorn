package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MemberDao {
	//1.전체 회원의 목록을 리턴하는 메소드
	public List<MemberDto> getList(){
	    //전체 회원 목록을 담을 ArrayList 객체는 미리 생성해 둔다
		List<MemberDto> list=new ArrayList<>();
		//필요한 객체를 담을 지역 변수를 미리 만든다. 
	    Connection conn=null;
	    PreparedStatement pstmt=null;
	    ResultSet rs=null;
	    try {
	    	conn=new DBConnect().getConn();
	    	//실행할 sql문 구성하기 
	    	String sql="SELECT num, name, addr"
	            + " FROM member"
	            + " ORDER BY num ASC";
	    	pstmt=conn.prepareStatement(sql);
	    	// ? 에 바인딩 할 내용이 있으면 한다.
	    	// select 문 수행하고 결과를 ResultSet 으로 얻어내기
	    	rs=pstmt.executeQuery();
	    	//반복문 돌면서 
	      while(rs.next()) { //커서를 한칸씩 내리고
	       	//커서가 위치한 곳의 회원 한명의 정보를 MemberDto 객체에 담고
	       	MemberDto dto=new MemberDto();
	      	dto.setNum(rs.getInt("num"));
	       	dto.setName(rs.getString("name"));
	      	dto.setAddr(rs.getString("addr"));
	      	list.add(dto);
	          //MemberDto 객체의 참조값을 ArrayList 객체에 누적 시킨다. 
	       }
	    }catch(Exception e) {
	       e.printStackTrace();
	    }finally {
	       try {
	          if(rs!=null)rs.close();
	          if(pstmt!=null)pstmt.close();
	          if(conn!=null)conn.close();
	       }catch(Exception e) {
	      	 e.printStackTrace();
	       }
	    }
	    return list;
	}
	//2. 특정회원 한명의 정보를 리턴하는 메소드
	public MemberDto getDto(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberDto dto = null;
		try {
			conn = new DBConnect().getConn();
			String sql = "SELECT name, addr"
					+ " FROM member"
					+ " WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				dto = new MemberDto();
				dto.setNum(num);
				dto.setName(name);
				dto.setAddr(addr);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e) {}
		}
		return dto;
	}
	//회원 한명의 정보를 추가하고 성공여부를 리턴하는 메소드
	public boolean insert(MemberDto dto) {
		Connection conn=null;
	    PreparedStatement pstmt=null;
	    int updateRowCount=0;
		try {
	    	 conn=new DBConnect().getConn();  
				String sql = "INSERT INTO member"
						+ " (num, name, addr)"
						+ " VALUES(member_seq.NEXTVAL, ?, ?)";
	         pstmt=conn.prepareStatement(sql);
	         pstmt.setString(1, dto.getName());
	         pstmt.setString(2, dto.getAddr());
	         updateRowCount=pstmt.executeUpdate();
	         System.out.println("회원정보를 추가하였습니다.");
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
	//회원 한명의 정보를 수정하고 성공여부를 리턴하는 메소드
	public boolean update(MemberDto dto) {
		Connection conn=null;
	    PreparedStatement pstmt=null;
	    int updateRowCount=0;
	    try {
	    	 conn=new DBConnect().getConn();  
	    	 //실행할 sql 문
		       String sql="UPDATE member"
		               + " SET name=? , addr=?"
		               + " WHERE num=?";
	         pstmt=conn.prepareStatement(sql);
	         pstmt.setString(1, dto.getName());
	         pstmt.setString(2, dto.getAddr());
	         pstmt.setInt(3, dto.getNum());	         
	         updateRowCount=pstmt.executeUpdate();
	         System.out.println("회원정보를 수정하였습니다.");
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
	//회원 한명의 정보를 삭제하고 성공여부를 리턴하는 메소드
	public boolean delete(int num) {
		Connection conn=null;
	    PreparedStatement pstmt=null;
	    int updateRowCount=0;
	    try {
	    	 conn=new DBConnect().getConn();  
	    	 String sql="DELETE FROM member"
	               + " WHERE num=?";
	         pstmt=conn.prepareStatement(sql);
	         pstmt.setInt(1, num);
	         updateRowCount=pstmt.executeUpdate();
	         System.out.println("회원정보를 삭제하였습니다.");
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
