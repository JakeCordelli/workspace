package BallPackage;

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

public class BallObject {
public int ballDiameter=10;

Random r= new Random();
//Velocity random number generator
//int randomNum = r.nextInt((max - min) + 1) + min;

int highSpeed=5;
int lowSpeed=-5;
public int xv = r.nextInt((highSpeed - lowSpeed) + 1) + lowSpeed;
public int yv=r.nextInt((highSpeed - lowSpeed) + 1) + lowSpeed;

private ControlPanel p;

//Generate RGB values
private int R=r.nextInt(255);
private int G=r.nextInt(255);
private int B=r.nextInt(255);

//Use random RGB values to make random colors
public Color Random= new Color(R, G, B, 255);
public Color Marcus=new Color(R, 124, 234, 200);

public int x=0;
public int y=0;

public int serviceTime=0;


//The BallObject has an xLocation, yLocation, Panel, and Diameter
public BallObject(int x, int y, ControlPanel p, int diameter, int serviceTime)
{
	this.ballDiameter = diameter;
	this.p=p;
	this.x=x;
	this.y=y;
	this.serviceTime=serviceTime;
}

public void move() 
{
	//Change velocities if they equal 0 (prevents stillness)
	if (xv==0) {
		xv=1;
	}
	
	if (yv==0) {
		yv=1;
	}
	
	x+=xv;
	y+=yv;
	
	if (x<=0)
	{
		xv*=-1;
		//ballDiameter=ballDiameter-5;
		Marcus=new Color(R, 124, 234, 200-20);
	}
	
	if (x>=p.getWidth()-ballDiameter)
	{
		xv*=-1;
		//ballDiameter=ballDiameter-5;
		Marcus=new Color(R, 124, 234, 200-20);


	}
	if (y<=0)
	{
		yv*=-1;
		//ballDiameter=ballDiameter-5;
		Marcus=new Color(R, 124, 234, 200-20);


	}
	if (y>=p.getHeight()-ballDiameter)
	{
		yv*=-1;
		//ballDiameter=ballDiameter-5;
		Marcus=new Color(R, 124, 234, 200-20);

	}
}

public void draw(Graphics g)
{
	g.setColor(Marcus);
	g.fillRect(x, y, ballDiameter, ballDiameter);
	

}

public void ballInfo(Graphics g) {
	g.setColor(Color.white);
	g.drawString("S="+serviceTime, x, y);	
}
}
