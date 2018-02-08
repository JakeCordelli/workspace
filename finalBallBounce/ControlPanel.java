package BallPackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
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


public class ControlPanel extends JPanel{
	//Create an instance of the ball object
	public BallObject b;
	//Store each instance of the ball object into an array
	public ArrayList<BallObject> ballz = new ArrayList<BallObject>();
	Random r= new Random();
	
	public JButton button;
	public JButton button2;

	protected int x;
	protected int y;
    public boolean ballInfo=false;
    public long currentTime=getTime();

    
	public ControlPanel()
	{
		MouseListener m= new MouseListener() {
			
			public void mouseReleased(MouseEvent arg0) {

			}
			public void mousePressed(MouseEvent me) {
				
		         if (me.getButton() == MouseEvent.BUTTON3) {
		        	 deleteBall();
	             }
		         if (me.getButton() == MouseEvent.BUTTON1) { 
	            	 for (int i=0; i<1; i++)
	 				{
	 					addball(me.getX(), me.getY());

	 				}
	             }
		         if (me.getButton() == MouseEvent.BUTTON2){
	            	 clearBalls();
	             }
			}
			public void mouseExited(MouseEvent arg0) {
			}
			public void mouseEntered(MouseEvent arg0) {

			}
			public void mouseClicked(MouseEvent me) {
				
			}
		};

		addMouseListener(m);
	}
	public static int getTime() {
	    int time = 0;
	    time=((int)System.currentTimeMillis())/1000;
	    return (time);
	}
	
	//Define how fast the simulation will run 
	int sleeper=20;
	public void slowSim() {
		sleeper=500;
	}
	
	public void speedSim() {
		sleeper=1000;
	}
	
	public static int genServiceTime() {
		Random r= new Random();
		int ar[]= new int[10];
		int g=0;
		
		int lowTime=30;
		int highTime=120;
		
		int randomLocation=r.nextInt(ar.length);
		
		
		for (int i=0; i<ar.length; i++) {
			g=r.nextInt((highTime - lowTime) + 1) + lowTime;
			ar[i]=(g);
		}
		System.out.println(ar[randomLocation]);
		return (ar[randomLocation]);
	}

	
	public void addball(int x, int y)
	{
		//Make the balls random Sizes 
		Random r= new Random();
		int x1=0-1;
		int J=0;
		if (x1<0) {
			J=r.nextInt(100);
		}
		int s=genServiceTime();
		ballz.add(new BallObject(x, y, this, 50, s));
		
	}
	
	
	
	public void automateBall() {

	int x=300;
	
	//add a ball every x amount of time
	if (getTime()%x==0) {
		addball(500,500);
	}
	}

	
	public void deleteBall()
	{
		ballz.remove(0);
	}
	
	public void clearBalls() {
		while (ballz.size()>=0) {
			deleteBall();
		}
	}
	
	
	
	public void drawGrid(Graphics g) {

		g.setColor(Color.white);	
		//Draw the vertical lines
		g.drawLine(0, getHeight()/2, getWidth(), getHeight()/2);
		int rows=15;
		int xCo=0;
		int yCo=0;
		int centerPointSize=10;
		int width=getWidth()/rows;
		for (int i=0; i<getWidth(); i+=width) {
			g.setColor(Color.white);	
			g.drawLine(i, 0, i, getHeight());
			xCo=i+(width/2);			
			yCo=getHeight()/4;

		
			//upper level center points
			int fxCo=xCo-(centerPointSize/2);
			int fyCo=yCo-(centerPointSize/2);
			int fxCo2=fxCo;
			int fyCo2=yCo*3-(centerPointSize/2);
			//Display the coordinates of the center points
			g.drawString((fxCo+", "+fyCo), fxCo, fyCo);
			g.fillOval(fxCo, fyCo, centerPointSize, centerPointSize);
			
			//lower level center points
			g.fillOval(fxCo2, fyCo2, centerPointSize, centerPointSize);
			
			//Display the coordinates of the center points
			g.drawString((fxCo2+", "+fyCo2), fxCo2, fyCo2);
			//There are 30 possible parking spots; choose a random one
			int u=r.nextInt(30);
		}			
	}
	
	public void paintComponent(final Graphics g)
	{
		{
			//Paints Background of the Frame
			super.paintComponent(g);
			g.setColor(Color.black);
			g.fillRect( 0,  0, getWidth(), getHeight());
			
			//drawGrid(g);

			automateBall();
			//Call the 
			for(BallObject b: ballz)
			{
				b.draw(g);
				b.move();
				b.ballInfo(g);
			}

			//Sets the Font Color of text displayed on the frame
			g.setColor(Color.green);
			Font font = new Font("Comic Sans MS", Font.BOLD, 16);
			setFont(font);
			g.drawString(" "+ballz.size(), 20,50);	
			g.drawString("Time elapsed: "+getTime(), 20, 80);
		}
		try {
			Thread.sleep(sleeper);
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		repaint();
		}
}