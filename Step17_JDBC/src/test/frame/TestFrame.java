package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dto.MemberDto;
/*
 *  //1. 선택된 row  인덱스를 읽어온다.
   int selectedIndex=table.getSelectedRow();
   
   //2. 선택된 row 의 첫번째(0번째) 칼럼의 숫자를 읽어온다 (삭제할 회원의 번호)
   int num=(int)model.getValueAt(selectedIndex, 0);
   
   
   -------------------------------------
   
   List<MemberDto>  list=dao.getList();
   
   for(MemberDto tmp:list){
      Object[] row={tmp.getNum(), tmp.getName(), tmp.getAddr()};
      model.addRow(row);
   }
 * 
 */
public class TestFrame extends JFrame implements ActionListener, PropertyChangeListener {
   //필드
   JTextField inputName, inputAddr;
   DefaultTableModel model;
   JTable table;
   
   //생성자
   public TestFrame() {
      setLayout(new BorderLayout());
      
      JLabel label1=new JLabel("이름");
      inputName=new JTextField(10);
      
      JLabel label2=new JLabel("주소");
      inputAddr=new JTextField(10);
      
      JButton saveBtn=new JButton("저장");
      saveBtn.setActionCommand("save");
      
      JButton updateBtn=new JButton("수정");
      updateBtn.setActionCommand("update");
      
      JButton deleteBtn=new JButton("삭제");
      deleteBtn.setActionCommand("delete");
      
      JPanel panel=new JPanel();
      panel.add(label1);
      panel.add(inputName);
      panel.add(label2);
      panel.add(inputAddr);
      panel.add(saveBtn);
      panel.add(updateBtn);
      panel.add(deleteBtn);
      
      add(panel, BorderLayout.NORTH);
      
      //표형식으로 정보를 출력하기 위한 JTable
      table=new JTable();
      //칼럼명을 String[] 에 순서대로 준비
      String[] colNames= {"번호", "이름", "주소"};
      //테이블에 출력할 정보를 가지고 있는 모델 객체 (칼럼명, row 갯수)
      model=new DefaultTableModel(colNames, 0) {
    	  public boolean isCellEditable(int row, int column) {
    		  if(column==0) {//만일 칼럼이0이면
    			  //수정이 불가능 하도록 false를 리턴해준다.
    			  return false;
    		  }else {
    			  //0번째 칼럼 이외의 칼럼은 모두 수정 가능하도록 true를 리턴해준다.
    			  return true;  
    		  }
    	  }
      };
      //모델을 테이블에 연결한다.
      table.setModel(model);
      //스크롤이 가능 하도록 테이블을 JScrollPane 에 감싼다.
      JScrollPane scroll=new JScrollPane(table);
      //JScrollPane  을 프레임의 가운데에 배치하기 
      add(scroll, BorderLayout.CENTER);
      
      displayMember();
      
      saveBtn.addActionListener(this);
      updateBtn.addActionListener(this);
      deleteBtn.addActionListener(this);
      
      table.addPropertyChangeListener(this);
   }
   
   //테이블에 데이터 출력하는 메소드
   public void displayMember() {
      
      //model.setRowCount(0); //테이블에 출력된 데이터 reset 
      
//      Object[] row1= {1, "김구라", "노량진"};
//      model.addRow(row1);
//      
//      Object[] row2= {2, "해골", "행신동"};
//      model.addRow(row2);
//      
//      Object[] row3= {3, "원숭이", "상도동"};
//      model.addRow(row3);
      //회원 전체 목록을 얻어와서
      MemberDao dao=new MemberDao();
      List<MemberDto> list=dao.getList();
      
      for(MemberDto tmp:list){
    	  //MemberDto 객체에 있는 내용을 Object[]에 순서대로 담아서
         Object[] row={tmp.getNum(), tmp.getName(), tmp.getAddr()};
         model.addRow(row);
      }
   }
   
   
   public static void main(String[] args) {
      TestFrame f=new TestFrame();
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setBounds(100, 100, 800, 500);
      f.setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
	   	String command=e.getActionCommand();
	   	if(command.equals("save")) {
	   		String name=inputName.getText();
	   		String addr=inputAddr.getText();
	   		MemberDto dto=new MemberDto();
	   		dto.setName(name);
	   		dto.setAddr(addr);
	   		boolean isSuccess=new MemberDao().insert(dto);	   		
			if(isSuccess) {
				JOptionPane.showMessageDialog(this, "회원정보를 추가했어요");
			}else {
				JOptionPane.showMessageDialog(this, "회원정보 추가를 실패했어요");		
			}
	   		model.setRowCount(0);
	   		displayMember();
	   	}else if(command.equals("update")) {
	   		String name=inputName.getText();
	   		String addr=inputAddr.getText();
	   		int selectedIndex=table.getSelectedRow();
	   		int num=(int)model.getValueAt(selectedIndex, 0);
	   		MemberDto dto=new MemberDto();
	   		dto.setNum(num);
	   		dto.setName(name);
	   		dto.setAddr(addr);
	   		boolean isSuccess=new MemberDao().update(dto);	   		
			if(isSuccess) {
				JOptionPane.showMessageDialog(this, "회원정보를 수정했어요");
			}else {
				JOptionPane.showMessageDialog(this, "회원정보 수정을 실패했어요");		
			}
	   		model.setRowCount(0);
	   		displayMember();
	   	}else if(command.equals("delete")) {
	   		int[] rows=table.getSelectedRows();
	   		//만일 어떤 row도 선택하지 않았다면
	   		if(rows.length==0) {
	   			JOptionPane.showConfirmDialog(this, "선택된 row가 없습니다.");
	   			//여기서 메소드를 끝낸다
	   			return;
	   		}
	   		MemberDao dao=new MemberDao();
	   		//반복문 돌면서 선택한 row 인덱스를 참조한다
	   		for(int seletedRow:rows) {
	   			//선택한 row의 가장 첫번째 칼럼에 있는 숫자 얻어내기
	   			int num=(int)model.getValueAt(seletedRow, 0);
	   			//MemberDao 객체를 이용해서 해당 번호의 회원 정보 삭제하기
	   			dao.delete(num);
	   		}
	   		model.setRowCount(0);
	   		displayMember();
	   	}
   }
   @Override
   public void propertyChange(PropertyChangeEvent evt) {
	   System.out.println("property change!");
	   System.out.println("property change!"+evt.getPropertyName());
	   System.out.println("isEditing"+table.isEditing());
   }
}
