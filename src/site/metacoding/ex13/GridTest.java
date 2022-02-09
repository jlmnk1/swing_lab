package site.metacoding.ex13;

import java.awt.GridLayout;

import javax.swing.JButton;

public class GridTest extends MyFrame {

	public GridTest() {
		setLayout(new GridLayout(0, 3));

		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton("버튼5");
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);

		pack();

		setVisible(true);
	}

	public static void main(String[] args) {
		new GridTest();

	}

}
