package eu.olssonfamily.ratrace;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private transient Image backgroundImage;
	private Pacman pacman = new Pacman(100, 100);

	public GamePanel(String imageResourcePath) {
		ImageIcon imageIcon = new ImageIcon(imageResourcePath);
		backgroundImage = imageIcon.getImage();
		Dimension size = new Dimension(backgroundImage.getWidth(null), backgroundImage.getHeight(null));
		PacmanController pacmanController = new PacmanController(pacman, this);
		addKeyListener(pacmanController);
		setFocusable(true);
		setDoubleBuffered(true);
		setPreferredSize(size);
		setMinimumSize(size);
		setMaximumSize(size);
		setSize(size);
	}

	public void paintComponent(Graphics g) {

		Graphics2D g2 = (Graphics2D) g;

		// Rectangle rectangle2render = new Rectangle(pacman.getX(),
		// pacman.getY(), pacman.getWidth(), pacman.getHeight());
		// g2.setClip(rectangle2render);

		g.drawImage(backgroundImage, 0, 0, null);
		pacman.drawPacman(g);
	}

}