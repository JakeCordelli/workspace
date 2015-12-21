package Balls.src.graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Panel;
import java.util.Random;
import java.awt.Font;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.SliderUI;

public class Ball {
Random r= new Random();
public int diameter=10;
public int x,y;


private float VelocityRandom=r.nextInt(40);
private float VelocityRandom2=r.nextInt(40);
private float xv=(-20)+VelocityRandom+5, yv=(-20)+VelocityRandom2+3;
private Color lineColor;
private PlatypusPanel p;
private boolean inverted= false;
private int R=r.nextInt(255);
private int G=r.nextInt(255);
private int B=r.nextInt(255);

Color Random= new Color(R, G, B, 255);
Color red =new Color (255,0,0,255);
Color green =new Color (0,255,0,200);
Color blue =new Color (0,0,255,200);

Color magenta =new Color (255,0,255,200);
Color yellow =new Color (255,255,0,200);
Color cyan =new Color (0,255,255,200);

public Ball(PlatypusPanel p)
{
	this.p=p;
	changeColor();
	x=r.nextInt(800);
	y=r.nextInt(800);
}
public Ball(int x, int y, PlatypusPanel p, boolean inverted, int diameter)
{
	this.diameter = diameter;
	this.inverted=inverted;
	this.p=p;
	changeColor();
	this.x=x;
	this.y=y;
}
public void move() 
{
	x+=xv;
	y+=yv;
	if (x<=0)
	{
		xv*=-1;
		
//		changeColor();
	}
	if (x>=p.getWidth()-diameter)
	{
		xv*=-1;
//		changeColor();
	}
	if (y<=0)
	{
		yv*=-1;
//		changeColor();
	}
	if (y>=p.getHeight()-diameter)
	{
		yv*=-1;
//		changeColor();
	}
}
public void changeColor()
{
	Random r = new Random();
	if(inverted)
		{
//			Color[] d = {Random, Random, Random};
			Color [] d= {red, green, blue};
			lineColor  = (d[r.nextInt(d.length)]);
		} 
	else 
		{
			Color[] d = {Random, Random, Random};
//			Color[] d = {cyan, yellow, magenta};
			lineColor  = (d[r.nextInt(d.length)]);
		}
}
public void draw(Graphics g)
{
	boolean reset = true;
	g.setColor(lineColor);
	if(reset)
	{
		g.fillOval(x, y, diameter, diameter); 
		reset=false;	
		g.setColor(lineColor);
	}
		if (inverted)
		{
			g.setColor(Color.WHITE);
		}
		else
		{
			g.setColor(Color.black);
		}
}
public void invert() 
	{
		inverted=!inverted;
	}
}




