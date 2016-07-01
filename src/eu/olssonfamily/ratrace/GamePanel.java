package eu.olssonfamily.ratrace;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
	private static final long serialVersionUID = 1L;

	private transient Image backgroundImage;
	private BufferedImage bufferedBackgroundImage;
	
	private Pacman pacman; 

	public GamePanel(String imageResourcePath) {
		
		ImageIcon imageIcon = new ImageIcon(imageResourcePath);
		backgroundImage = imageIcon.getImage();
		bufferedBackgroundImage = getBufferedImageFromImage(backgroundImage);

		pacman = new Pacman(30, 260, bufferedBackgroundImage);
		
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

		g.drawImage(backgroundImage, 0, 0, null);
		pacman.drawPacman(g);
	}
	
	BufferedImage getBufferedImageFromImage(Image image) {
		   if (image instanceof BufferedImage)
		    {
		        return (BufferedImage) image;
		    }

		    // Create a buffered image with transparency
		    BufferedImage bimage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_ARGB);

		    // Draw the image on to the buffered image
		    Graphics2D bGr = bimage.createGraphics();
		    bGr.drawImage(image, 0, 0, null);
		    bGr.dispose();

		    // Return the buffered image
		    return bimage;
	}

}