package site.metacoding.ex13;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import site.metacoding.ex13.constant.BorderConstant;

public class BorderLayoutEx01 extends MyFrame {

	public BorderLayoutEx01() {
		super(500, 500);
		JPanel panel = (JPanel) getContentPane(); // JFrame의 패널 가져오기
		panel.setLayout(new BorderLayout());

		JButton btnNorth = new JButton("북쪽");
		JButton btnEast = new JButton("동쪽");
		JButton btnWest = new JButton("서쪽");
		JButton btnSouth = new JButton("남쪽");
		JButton btnCenter = new JButton("가운데");
		
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
