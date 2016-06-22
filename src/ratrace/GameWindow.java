package ratrace;

import java.awt.Dimension;

import javax.swing.JFrame;

public class GameWindow extends JFrame {

	private static final long serialVersionUID = 1L;

	public GameWindow(GamePanel backgoundPanel) {
		this.setContentPane(backgoundPanel);
		Dimension dim = backgoundPanel.getSize();
		this.setSize(dim);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}
