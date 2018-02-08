package BallPackage;

import javax.swing.JFrame;
public class Frame {
	public static void main(String[] args) 
	{ 
		ControlPanel panel= new ControlPanel();
		JFrame application= new JFrame("Party");
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(1920,1080);
		application.setVisible(true);
	}	
}