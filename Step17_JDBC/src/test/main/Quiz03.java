package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class Quiz03 extends JFrame implements ActionListener {
    JTextField numfield;
    JTextField namefield;
    JTextField addrfield;
	public Quiz03() {
	     setLayout(new BorderLayout());
	     JPanel topPanel=new JPanel();
	     topPanel.setBackground(Color.black);
	     add(topPanel, BorderLayout.NORTH);
	     JButton insertBtn=new JButton("추가하기");
	     JButton updateBtn=new JButton("수정하기");
	     JButton deleteBtn=new JButton("삭제하기");
	     topPanel.add(insertBtn);
	     topPanel.add(updateBtn);
	     topPanel.add(deleteBtn);
	     JPanel centerPanel=new JPanel();
	     centerPanel.setBackground(Color.yellow);
	     add(centerPanel, BorderLayout.CENTER);
	     JLabel numlabe=new JLabel("NUM:");
	     JLabel namelabe=new JLabel("NAME:");
	     JLabel addrlabe=new JLabel("ADDR:");
	     numfield=new JTextField(10);
	     namefield=new JTextField(10);
	     addrfield=new JTextField(10);
	     centerPanel.add(numlabe);
	     centerPanel.add(numfield);
	     centerPanel.add(namelabe);
	     centerPanel.add(namefield);
	     centerPanel.add(addrlabe);
	     centerPanel.add(addrfield);
	     JPanel bottomPanel=new JPanel();
	     bottomPanel.setBackground(Color.white);
	     add(bottomPanel, BorderLayout.SOUTH);
	     JButton sendBtn=new JButton("전송");
	     bottomPanel.add(sendBtn);
	     insertBtn.addActionListener(this);
	     updateBtn.addActionListener(this);
	     deleteBtn.addActionListener(this);
	     sendBtn.addActionListener(this);
	}
	
	public static void main(String[] args) {
	      Quiz03 frame=new Quiz03();
	      frame.setTitle("회원정보");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setBounds(100, 100, 500, 500);
	      frame.setVisible(true);
	      
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		Integer num = 0;	
		String name = namefield.getText();
		String addr = addrfield.getText();
		if(command.equals("추가하기")) {
			MemberDto dto=new MemberDto();
			dto.setName(name);
			dto.setAddr(addr);
			boolean isSuccess=new MemberDao().insert(dto);
			if(isSuccess) {
				JOptionPane.showMessageDialog(this, "회원정보를 추가했어요");
			}else {
				JOptionPane.showMessageDialog(this, "회원정보 추가를 실패했어요");		
			}
		}else if(command.equals("수정하기")){
			MemberDto dto=new MemberDto();
			dto.setName(name);
			dto.setAddr(addr);
			boolean isSuccess=new MemberDao().insert(dto);
			if(isSuccess) {
				System.out.println("회원정보를 추가했습니다");
			}else {
				System.out.println("추가 실패!");			
			}
		}else if(command.equals("삭제하기")) {
			MemberDto dto=new MemberDto();
			dto.setName(name);
			dto.setAddr(addr);
			boolean isSuccess=new MemberDao().insert(dto);
			if(isSuccess) {
				System.out.println("회원정보를 추가했습니다");
			}else {
				System.out.println("추가 실패!");			
			}
		}
	}
}
