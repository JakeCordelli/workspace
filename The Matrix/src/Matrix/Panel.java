package Matrix;

import javax.swing.JFrame;
public class Panel {
	public static void main(String[] args) 
	{ 
		MatrixPanel panel= new MatrixPanel();
		JFrame application= new JFrame("*****Enter The Matrix*****");
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(1280,800);
		application.setVisible(true);
	}	
}
