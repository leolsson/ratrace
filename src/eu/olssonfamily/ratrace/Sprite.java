package eu.olssonfamily.ratrace;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Sprite {

    protected int x;
    protected int y;
	protected int dx = 1;
	protected int dy = 0;

    protected int width;
    protected int height;
    protected boolean vis;
    protected Image image;

	final int BOARD_SIZE_X = 700;
	final int BOARD_SIZE_Y = 700;

    public Sprite(int x, int y) {

        this.x = x;
        this.y = y;
        vis = true;
    }

    protected void loadImage(String imageName) {

        ImageIcon ii = new ImageIcon(imageName);
        image = ii.getImage();
    }
    
    protected void getImageDimensions() {

        width = image.getWidth(null);
        height = image.getHeight(null);
    }    

    public Image getImage() {
        return image;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public void changeDirectionIfBoarderHit() {
		changeXdirectionIfXBoarderHit();
		changeYDirectionIfYBoarderHit();
    }

    public boolean isVisible() {
        return vis;
    }

    public void setVisible(Boolean visible) {
        vis = visible;
    }
    
	private void changeYDirectionIfYBoarderHit() {
		if ((y > (BOARD_SIZE_Y - 16) || y < 0) && dy != 0) {
			System.out.println("Hit Y  boarder");
			dy = dy * -1;
		}
	}

	private void changeXdirectionIfXBoarderHit() {
		if ((x > BOARD_SIZE_X - 16 || x < 0) && dx != 0) {
			System.out.println("Hit X  boarder");
			dx = dx * -1;
		}
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWidth() {
		return width;
	}

}