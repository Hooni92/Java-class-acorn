package frame02;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	// 생성자
	public MyFrame(String title) {
		// 부모생성자에 프레임의 제목 넘겨주기
		super(title);
		// setBounds(x, y, width, height)
		setBounds(100, 100, 500, 500);
		// 창을 닫았을 때 프로세스도 같이 종료되도록 한다.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 프레임의 레이아웃 매니저를 사용하지 않기 때문에 UI를 절대 좌표에 직접 배치해야 한다.
		
		
		// FlowLayout layout = new FlowLayout(FlowLayout.CENTER); // 창의 넓이와 크기에 따라서 물 흐릇이 변경됨(flowlayout)
		
		setLayout(new FlowLayout(FlowLayout.CENTER)); // 굳이 객체에 담아서 안하고 바로 해도 됨.
		
		JButton btn1 = new JButton("버튼1");	
		add(btn1); // 프레임에 btn1 추가하기
	
		JButton btn2 = new JButton("버튼2");
		add(btn2); // 프레임에 btn2 추가하기
		
		JButton btn3 = new JButton("버튼3");
		add(btn3); // 프레임에 btn3 추가하기
		
		
		// 프레임이 화면상에 보이도록 한다
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new MyFrame("나의 프레임");
	}
}
