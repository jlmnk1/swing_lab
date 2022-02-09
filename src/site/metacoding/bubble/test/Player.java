package site.metacoding.bubble.test;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel {

	private int x;
	private int y;
	private ImageIcon playerR, playerL;

	private boolean isRight;
	private boolean isLeft;
	private boolean isJump;

	private static final int JumpSpeed = 2;
	private static final int Speed = 4;

	public boolean isRight() {
		return isRight;
	}

	public void setRight(boolean isRight) {
		this.isRight = isRight;
	}

	public boolean isLeft() {
		return isLeft;
	}

	public void setLeft(boolean isLeft) {
		this.isLeft = isLeft;
	}

	public boolean isJump() {
		return isJump;
	}

	public void setJump(boolean isJump) {
		this.isJump = isJump;
	}

	public Player() {
		initObject();
		initSetting();
	}

	private void initObject() {
		playerR = new ImageIcon("image/playerR.png");
		playerL = new ImageIcon("image/playerL.png");
	}

	private void initSetting() {
		x = 70;
		y = 535;
		setIcon(playerR);
		setSize(50, 50);
		setLocation(x, y); // paintComponent 호출해줌

		isRight = false;
		isLeft = false;
		isJump = false;
	}

	public void left() {
		isLeft = true;
		setIcon(playerL);
		System.out.println("왼쪽 이동");

		new Thread(() -> {
			while (isLeft) {
				x = x - Speed;
				setLocation(x, y);
				try {
					Thread.sleep(10);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}).start();
	}

	public void right() {
		isRight = true;
		setIcon(playerR);
		System.out.println("오른쪽 이동");

		new Thread(() -> {
			while (isRight) {
				x = x + Speed;
				setLocation(x, y);
				try {
					Thread.sleep(10);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}).start();
	}

	public void jump() {
		System.out.println("점프");
		isJump = true;
		// 점프는 for문을 돌려야 한다. -> 0~130
		// up 일 때는 sleep(5) -> for

		new Thread(() -> {
			// up
			for (int i = 0; i < 130 / JumpSpeed; i++) {
				y = y - JumpSpeed;
				setLocation(x, y);

				try {
					Thread.sleep(4);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			// down
			for (int i = 0; i < 130 / JumpSpeed; i++) {
				y = y + JumpSpeed;
				setLocation(x, y);

				try {
					Thread.sleep(4);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			isJump = false;
		}).start();

		// down 일 때는 sleep(3) -> for

	}

}