package ratrace;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Tick implements ActionListener {

	Timer timer;
	
	public Tick(int delay) {
		timer = new Timer(delay,this);
		timer.start();
	}
	
	public void addActionListener(ActionListener listner) {
		timer.addActionListener(listner);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Tick called ");
	}

}
