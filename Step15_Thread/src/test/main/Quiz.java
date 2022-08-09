package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * 프레임 하나를 만들고
 * 프레임에 숫자를 입력하고 실행하기 버튼을 누르면
 * 구구단 하나가 콘솔창에 출력되는 프로그래밍을 해보세요
 * 예 ) 2를 jTextField에 입력하고 실행하기 버튼을 누르면
 * 
 * 구구단이 출력됨
 * 단 1초에 1줄씩 출력이 되도록 하고, 출력하는 작업은 새로운 스레드에서 출력하도록 하세요
 */
public class Quiz extends JFrame implements ActionListener {
	//필드
	JTextField tf_num1;
	
	//생성자
	   public Quiz() {

		  // 레이아웃 설정
	      setLayout(new BorderLayout());
	      JPanel panel=new JPanel();
	      panel.setBackground(Color.YELLOW);
	      add(panel, BorderLayout.NORTH);
	      
	      // 텍스트필드 생성
	      tf_num1 = new JTextField(10);
	      panel.add(tf_num1);
	      // 버튼 생성
	      JButton Btn=new JButton("실행하기");
	      panel.add(Btn);
	      
	      // 버튼 리스너 등록
	      Btn.addActionListener(this);
	   }
	   
	   public static void main(String[] args) {
	      JFrame frame = new Quiz();
	      frame.setTitle("Quiz"+ "");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setBounds(100, 100, 500, 500);
	      frame.setVisible(true);
	   }

	   @Override
	   public void actionPerformed(ActionEvent arg0) {
			   new Thread(()->{
				// 구구단 작업 시작
				   try {
					String strNum = tf_num1.getText();
					int num = Integer.parseInt(strNum);
					
					for(int i=0; i<9; i++) {
						System.out.printf("%d x %d = %d", num, i+1, (num*(i+1)));
						System.out.println("");
					}
					Thread.sleep(1000);
				  } catch (NumberFormatException nfe) {
						JOptionPane.showMessageDialog(this, "숫자 형식으로 입력하세요");
				  } catch (InterruptedException e) {
					e.printStackTrace();
				}
			   }).start();
	   }
}

/*
 * 선생님 코드~
 * package test.main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Frame07 extends JFrame implements ActionListener{
   JTextField tf;
   //생성자 
   public Frame07(String title) {
      super(title);
      //레이아웃 설정
      setLayout(new FlowLayout());
      
      this.tf=new JTextField(10);
      JButton printBtn=new JButton("출력하기");
      
      add(tf);
      add(printBtn);
      
      //버튼에 리스너 등록
      printBtn.addActionListener(this);
   }
   
   @Override
   public void actionPerformed(ActionEvent e) {
      //입력한 문자열을 읽어온다.
      String inputNum=tf.getText();
      //입력한 숫자형태의 문자열을 실제 정수로 바꾸기
      int num=Integer.parseInt(inputNum);
      for(int i=0; i<9; i++) {
         int result=num*(i+1);
         System.out.println(num+" x "+(i+1)+" = "+result);
      }
   }
   
   public static void main(String[] args) {
      JFrame frame=new Frame07("구구단 예제");
      //프레임을 닫으면 자동으로 프로세스가 종료 되도록 한다.
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setBounds(100, 100, 500, 500);
      frame.setVisible(true);
   }
}
*/








