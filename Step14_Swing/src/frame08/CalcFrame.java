package frame08;

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

/*
 *  계산기가 실제로 동작하도록 프로그래밍 해 보세요.
 *  
 *  혹시 숫자형식으로 입력하지 않았으면 메세지 다이얼로그에 "숫자형식으로 입력해 주세요" 메세지도 나오게 해보세요.
 *  혹시 0으로 나눌려고 시도한다면 메세지 다이얼로그에 " 0으로 나눌수는 없어요" 메세지도 나오게 해보세요
 *  
 *  - hint 1
 *  
 *  double num1 = Double.parseDouble("10");
 *  
 *  - hint 2
 *  
 *  try {
 *  } catch
 */

public class CalcFrame extends JFrame implements ActionListener {
   // 필드
   JTextField tf_num1, tf_num2;
   JLabel label_result;
   JPanel topPanel;
   
   // default  생성자
   public CalcFrame() {
      //프레임의 레이아웃 법칙 설정하기 
      setLayout(new BorderLayout());
      
      // JPanel
      topPanel=new JPanel();
      topPanel.setBackground(Color.YELLOW);
      
      // Panel 을 북쪽에 배치하기 
      add(topPanel, BorderLayout.NORTH);
      
      // JTextField 객체를 만들에서 JPanel 에 추가하기 
      tf_num1=new JTextField(10);
      topPanel.add(tf_num1);
      
      // 기능 버튼 객체를 만들어서 JPanel 에 추가하기
      JButton plusBtn=new JButton("+");
      JButton minusBtn=new JButton("-");
      JButton multiBtn=new JButton("*");
      JButton divideBtn=new JButton("/");
      topPanel.add(plusBtn);
      topPanel.add(minusBtn);
      topPanel.add(multiBtn);
      topPanel.add(divideBtn);
      
      // 두번째 JTextField  만들어서 페널에 추가 하기 
      tf_num2=new JTextField(10);
      topPanel.add(tf_num2);
      
      // JLabel
      JLabel label1=new JLabel("=");
      label_result=new JLabel("0");
      
      // 페널에 레이블 추가하기
      topPanel.add(label1);
      topPanel.add(label_result);
      
      // 버튼에 액션 리스너 등록
      plusBtn.addActionListener(this);
      minusBtn.addActionListener(this);
      multiBtn.addActionListener(this);
      divideBtn.addActionListener(this);
   }
   
   
   public static void main(String[] args) {
      
      CalcFrame frame=new CalcFrame();
      
      // 프레임의 제목 설정
      frame.setTitle("계산기");
      
      // 프레임을 닫으면 자동으로 프로세스가 종료 되도록 한다.
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setBounds(100, 100, 500, 500);
      frame.setVisible(true);
   }


	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			String command = e.getActionCommand();
			// 버튼에 액션 command 를 지정하지 않으면 버튼 text가 액션 command가 된다.
			
			// 입력한 문자열을 읽어낸다.
//			String strNum1 = tf_num1.getText();
//			String strNum2 = tf_num2.getText();
			// 문자열을 숫자로 바꿔준다
			Double num1 = Double.parseDouble(tf_num1.getText());
			Double num2 = Double.parseDouble(tf_num2.getText());
			double result = 0.0;
			
			if(command.equals("+")) {
				// 미리 만들어 놓은 지역변수에 연산의 결과 대입
				result = (num1 + num2);
				JButton hi = new JButton("hi");
				topPanel.add(hi);				
			} else if(command.equals("-")) {
				// 미리 만들어 놓은 지역변수에 연산의 결과 대입
				result = (num1 - num2);
			} else if(command.equals("*")) {
				// 미리 만들어 놓은 지역변수에 연산의 결과 대입
				result = (num1 * num2);
			} else if(command.equals("/")) {
				if(num2 == 0) {
					JOptionPane.showMessageDialog(this, "어떤 수를 0으로 나눌 수는 없어요");
					return; // 메소드를 여기서 끝내기
				}
				// 미리 만들어 놓은 지역변수에 연산의 결과 대입
				result = (num1 / num2);
			}
			// 숫자를 문자열로 바꾸기
			String strResult = Double.toString(result);
			// 연산의 결과를 JLabel에 출력하기
			label_result.setText(strResult);
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(this, "숫자 형식으로 입력하세요");
		} 
	}
}   