package site.metacoding.ex13;

import javax.swing.JFrame;

// Ctrl + Shift + F
// Ctrl + Shift + O
public class MyFrame extends JFrame {

	public MyFrame() {
		super();
		setSize(600, 400); // w, h
		setLocationRelativeTo(null); // ������ ȭ�� �߾� ��ġ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x��ư Ŭ���� main����
	}
	public MyFrame(int w, int h) {
		super();
		setSize(w, h); // w, h
		setLocationRelativeTo(null); // ������ ȭ�� �߾� ��ġ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x��ư Ŭ���� main����
	}
}
