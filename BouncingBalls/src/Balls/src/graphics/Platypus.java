package Balls.src.graphics;

import javax.swing.JFrame;
public class Platypus {
	public static void main(String[] args) 
	{ 
		PlatypusPanel panel= new PlatypusPanel();
		JFrame application= new JFrame("Balls");
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(1280,800);
		application.setVisible(true);
//		CheckerBoard CB= new CheckerBoard();
//		application.add(CB);
		
	}	
}
