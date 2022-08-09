package test.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Quiz02 extends JFrame implements ActionListener{
	
	JTextField tf1 = null;
	JTextArea ta1 = null;
	
	public Quiz02(String title) {
		super(title);
		setLayout(new BorderLayout());
		JPanel panel=new JPanel();
	    panel.setBackground(Color.YELLOW);
	    add(panel, BorderLayout.NORTH);
	    
		tf1 = new JTextField(20);
		panel.add(tf1);
		JButton addBtn = new JButton("추가");
		panel.add(addBtn);
		JButton loadBtn = new JButton("불러오기");
		panel.add(loadBtn);
		ta1 = new JTextArea(10, 30);
		panel.add(ta1);
		
		addBtn.addActionListener(this);
		loadBtn.addActionListener(this);
	}
	
	public static void main(String[] args) {
		Quiz02 frame = new Quiz02("Quiz02");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBounds(100, 100, 500, 500);
	    frame.setVisible(true);
	}
	
	File f1 = new File("c:/workspace/myFolder/memo.txt"); 
	FileWriter fw = null;
	BufferedWriter bw = null;
	FileReader fr = null;
	BufferedReader br = null;


	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		try {
			if(command.equals("추가")) {
				try {
					if(!f1.exists()) f1.createNewFile();
					
					fw = new FileWriter(f1, true);
					bw = new BufferedWriter(fw);
					bw.append(tf1.getText());
					bw.close();
					fw.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			} else if(command.equals("불러오기")) {
				try {
					fr = new FileReader(f1);
					br = new BufferedReader(fr);
					
					while(true) {
						String str = br.readLine();
						if(str == null) break;
						ta1.setText(str);
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}
