package fractals;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Component;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.JButton;
import javax.swing.JFrame;
public class GraphicsFrame {

	public static void main (String [] args) 
	{
        JFrame window= new JFrame("CheckerBoard");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(1280,800);//Size of the window
		window.setVisible(true);
		JButton button=new JButton("Click me");
		FractalCode QT= new FractalCode();
		RainbowCircles RC= new RainbowCircles();
		CheckerBoard CB= new CheckerBoard();
//		window.add(RC);
		window.add(CB);
//		window.add(QT);

	}
}
