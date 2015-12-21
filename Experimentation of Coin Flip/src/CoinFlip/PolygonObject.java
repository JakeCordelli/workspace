package CoinFlip;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JPanel;

public class PolygonObject extends paintComponent {
	Polygon p;
	Color c;
	public PolygonObject(int[] x, int[] y, Color c)
	{
		p= new Polygon();
		p.xpoints=x;
		p.ypoints=y;
		p.npoints=x.length;
		this.c=c;
	}
	public void drawPolygon(Graphics g) 
	{
		g.setColor(c);
		g.drawPolygon(p);
		
	}

}
