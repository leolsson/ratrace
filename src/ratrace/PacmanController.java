package ratrace;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PacmanController extends KeyAdapter implements ActionListener {

	private Pacman pacman;
	private GamePanel gamePanel;
	
	public PacmanController(Pacman pacman, GamePanel gamePanel) {
		this.pacman = pacman;
		this.gamePanel = gamePanel;
		
		Tick tick = new Tick(50);
		tick.addActionListener(this);
	}
	
	@Override
	public void keyPressed(KeyEvent keyEvent) {
		System.out.println("Key pressed");

		super.keyPressed(keyEvent);
		pacman.changeDirection(keyEvent);
	}

	// This is called when the tick timer is timed out
	@Override
	public void actionPerformed(ActionEvent e) {
		pacman.move();
		gamePanel.repaint();
	}
}
