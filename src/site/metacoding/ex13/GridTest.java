package site.metacoding.ex13;

import java.awt.GridLayout;

import javax.swing.JButton;

public class GridTest extends MyFrame {

	public GridTest() {
		setLayout(new GridLayout(0, 3));

		JButton btn1 = new JButton("��ư1");
		JButton btn2 = new JButton("��ư2");
		JButton btn3 = new JButton("��ư3");
		JButton btn4 = new JButton("��ư4");
		JButton btn5 = new JButton("��ư5");
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
