package site.metacoding.ex13;

import javax.swing.JFrame;

// Ctrl + Shift + F
// Ctrl + Shift + O
public class MyFrame extends JFrame {

	public MyFrame() {
		super();
		setSize(600, 400); // w, h
		setLocationRelativeTo(null); // 프레임 화면 중앙 배치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼 클릭시 main종료
	}
	public MyFrame(int w, int h) {
		super();
		setSize(w, h); // w, h
		setLocationRelativeTo(null); // 프레임 화면 중앙 배치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼 클릭시 main종료
	}
}
