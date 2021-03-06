package site.metacoding.bubble.ex03;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * 
 * @author 이상기 플레이어는 좌우 이동이 가능하다. 점프가 가능하다. 방울 발사(나중에 생각)
 *
 */

public class Player extends JLabel {

	int x;
	private int y;
	private ImageIcon playerR;

	public Player() {
		initObject();
		initSetting();
	}

	private void initObject() {
		playerR = new ImageIcon("image/playerR.png");
	}

	private void initSetting() {
		x = 70;
		y = 535;
		setIcon(playerR);
		setSize(50, 50);
		setLocation(x, y);
	}

	public void left() {

	}

	public void right() {
		System.out.println("오른쪽 이동");
		x = x + 10;
		setLocation(x, y);
	}
}
