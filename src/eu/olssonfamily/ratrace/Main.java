package eu.olssonfamily.ratrace;

import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {

		GamePanel backgroundPanel = new GamePanel("resources/ratrace-course.png");
		GameWindow ratraceWindow = new GameWindow(backgroundPanel);
		ratraceWindow.setVisible(true);
	}

}
