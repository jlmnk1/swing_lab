package site.metacoding.ex13;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class FlowLayoutEx01 extends MyFrame {

	public FlowLayoutEx01() {
		super(300, 300);
		JPanel panel = (JPanel) getContentPane(); // JFrame의 패널 가져오기
		panel.setLayout(new FlowLayout());

		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);

		setVisible(true);
	}

	public static void main(String[] args) {
		FlowLayoutEx01 mf = new FlowLayoutEx01();

	}
}
