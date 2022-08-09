package frame07;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	// 필드
	JTextField inputMsg, inputMsg2;
	
	// 생성자
	public MyFrame(String title) {
		super(title);
		// 레이아웃
		setLayout(new FlowLayout());
		inputMsg = new JTextField(10);
		inputMsg2 = new JTextField(10);
		JButton btn = new JButton("눌러보셈");

		add(inputMsg);
		add(btn);
		add(inputMsg2);
		
		// 버튼에 액션리스너 등록
		btn.addActionListener(this);
		
		/*
		btn.addActionListener((e) -> {
			inputMsg2.setText(inputMsg.getText());
		});
		*/
	}
	
	public static void main(String[] args) {
		JFrame f = new MyFrame("나의 프레임");
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setBounds(100, 100, 500, 500);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = inputMsg.getText();
		inputMsg2.setText(msg);
		inputMsg.setText("");
	}
	
}
