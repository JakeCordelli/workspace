package fractals;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class CheckerBoard extends JPanel {
	public void paintComponent(Graphics g){
		Random rn= new Random();
		int R=rn.nextInt(255);
	 	int G=rn.nextInt(255);
	 	int B=rn.nextInt(255);
	 	int size= rn.nextInt(100);
	 	Color Random= new Color(R, G, B, 255);
	 	Color Random2= new Color(G, R, B, 255);
		super.paintComponent(g); 	
		this.setBackground(Random);
		
								//Checkers
		for (int i=0; i<800; i+=256 )
			for (int q=128; q<1280; q+=256)
		{
				g.setColor(Random2);
			g.fillRect(q, i, 128, 128);
			
		}
		for (int i=128; i<800; i+=256 )
			for (int q=0; q<1280; q+=256)
		{
				g.setColor(Random);
			g.fillRect(q, i, 128, 128);
		}
		
					//Smaller Square inside of Checkers
		
		for (int i=32; i<800; i+=128)
			for (int q=32; q<1280; q+=128)
		{
			g.setColor(Random2);
			g.fillRect(q, i, 64, 64);
		}

					//Smaller Squares inside of Larger Checkers
		for (int i=8; i<800; i+=32 )
			for (int q=8; q<1280; q+=32)
		{
			g.setColor(Random);
			g.fillRect(q, i, 16, 16);
		}
					//Circles
		
		for (int i=12; i<800; i+=32)
			for (int q=12; q<1280; q+=32)
		{
			g.setColor(Random2);
			g.fillOval(q, i, 8, 8);
		}
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		repaint();
		
		
	}

}
