package site.metacoding.ex13;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import site.metacoding.ex13.constant.BorderConstant;

public class BorderLayoutEx01 extends MyFrame {

	public BorderLayoutEx01() {
		super(500, 500);
		JPanel panel = (JPanel) getContentPane(); // JFrame�� �г� ��������
		panel.setLayout(new BorderLayout());

		JButton btnNorth = new JButton("����");
		JButton btnEast = new JButton("����");
		JButton btnWest = new JButton("����");
		JButton btnSouth = new JButton("����");
		JButton btnCenter = new JButton("���");
		
//		panel.add(btnNorth, BorderConstant.NORTH);
//		panel.add(btnEast, BorderConstant.EAST);
//		panel.add(btnWest, BorderConstant.WEST);
//		panel.add(btnSouth, BorderConstant.SOUTH);
//		panel.add(btnCenter, BorderConstant.CENTER);
		
		panel.add(btnNorth, BorderLayout.NORTH);
		panel.add(btnEast, BorderConstant.EAST);
		panel.add(btnWest, BorderConstant.WEST);
		panel.add(btnSouth, BorderConstant.SOUTH);
		panel.add(btnCenter, BorderConstant.CENTER);

		setVisible(true);
		
	}

	public static void main(String[] args) {
		new BorderLayoutEx01();

	}

}