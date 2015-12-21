package CoinFlip;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Graphics {

	public static void main (String [] args) 
	{
        JFrame window= new JFrame("Shapes");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(1280,800);//Size of the window
		window.setVisible(true);
		JButton button=new JButton("Click me");
		paintComponent DC= new paintComponent();
		window.add(DC); 
		
//		BouncingBall BouncingBall= new BouncingBall();
//		window.add(BouncingBall);
	}
	public void setColor(Color c) {
		// TODO Auto-generated method stub
		
	}

	public void drawPolygon(Polygon p) {
		// TODO Auto-generated method stub
		
	}
}
