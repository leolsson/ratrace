package eu.olssonfamily.ratrace;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

public class Pacman extends Sprite {

	final int PACMAN_SPEED = 5;

	public Pacman(int x, int y) {
		super(x, y);
		loadImage("resources/pacman.png");
		getImageDimensions();
	}

	public void move() {
		changeDirectionIfBoarderHit();
		x = x + dx * PACMAN_SPEED;
		y = y + dy * PACMAN_SPEED;
	}
	
	
	public void drawPacman(Graphics g) {
		System.out.println("draw packman called");
		Graphics2D g2 = (Graphics2D) g;
		g2.drawImage(getImage(), getX(), getY(), null);
	}


	public void changeDirection(KeyEvent e) {

		System.out.println("Pacman key event recieved");
		
		int key = e.getKeyCode();

		dx = 0;
		dy = 0;
		
		switch (key) {
		case KeyEvent.VK_LEFT:
			dx = -1;
			break;
		case KeyEvent.VK_RIGHT: 
			dx = 1;
			break;
		case KeyEvent.VK_UP:
			dy = -1;
			break;
		case KeyEvent.VK_DOWN:
			dy = 1;
		}
	}
}
