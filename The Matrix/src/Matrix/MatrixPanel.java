package Matrix;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MatrixPanel extends JPanel{
	public void paintComponent(final Graphics g)
	{
		Random r= new Random();
//		int Number;
//		int[] d = {1, 0};
//		Number = (d[r.nextInt(d.length)]);
		int R=r.nextInt(255);
		Color Color= new Color(0, 255, 0, R);
		super.paintComponent(g);
		g.fillRect( 0,  0, 1280, 800);
		g.setColor(Color.BLACK);
		for (int i=0; i<1280; i+=10)
			for (int x=0; x<800; x+=15)
		{

			g.drawString("1", i,x);
			g.setColor(Color);
//			g.drawString("0", i, x);
		}
		
		
		
//		{
//		try {
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		repaint();
//		}
	}
}
