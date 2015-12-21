package Balls.src.graphics;

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


public class PlatypusPanel extends JPanel{
	public Ball ball1;
	public ArrayList<Ball> ballz = new ArrayList<Ball>();
	private boolean inverted= false;
	private boolean reset=false;
	public JSlider slider;
	public JSlider slider2;
	public JSlider slider3;
	public JSlider slider4;
	public JSlider slider5;
	public JButton button;
	public JButton button2;
	Random r= new Random();
	private int R=r.nextInt(255);
	private int G=r.nextInt(255);
	private int B=r.nextInt(255);
	Color Random= new Color(R, G, B, 255);
	public int value = 1;
	public int value2=10;
	public int value3=255;
	public int value4=255;
	public int value5=255;
	protected int x;
	protected int y;
	protected Color lineColor2;
	public PlatypusPanel()
	
	{
//Amount Slider
		button= new JButton();
		slider = new JSlider();
		slider.setMaximum(1000);
		slider.setMinimum(0);
		slider.setValue(5);
		slider.setMajorTickSpacing(250);
		slider.setMinorTickSpacing(100);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent ce) {
				value=slider.getValue();
			}
		});
		add(slider);
		{
//Diameter Slider
		slider2 = new JSlider();
		slider2.setMaximum(200);
		slider2.setMinimum(0);
		slider2.setValue(10);
		slider2.setMajorTickSpacing(50);
		slider2.setMinorTickSpacing(10);
		slider2.setPaintTicks(true);
		slider2.setPaintLabels(true);
		slider2.addChangeListener(new ChangeListener(){
			public void stateChanged(ChangeEvent ce) {
				value2=slider2.getValue();
			}
		});
		add(slider2);
		}
//redshift
		{
//		slider3 = new JSlider();
//		slider3.setMaximum(250);
//		slider3.setMinimum(0);
//		slider3.setValue(250);
//		slider3.setMajorTickSpacing(50);
//		slider3.setMinorTickSpacing(10);
//		slider3.setPaintTicks(true);
//		slider3.setPaintLabels(true);
//		slider3.addChangeListener(new ChangeListener(){
//			public void stateChanged(ChangeEvent ce) {
//				value3=slider3.getValue();
//			}
//		});
//		add(slider3);
		}

//green shift
		{
//		slider4 = new JSlider();
//		slider4.setMaximum(250);
//		slider4.setMinimum(0);
//		slider4.setValue(250);
//		slider4.setMajorTickSpacing(50);
//		slider4.setMinorTickSpacing(10);
//		slider4.setPaintTicks(true);
//		slider4.setPaintLabels(true);
//		slider4.addChangeListener(new ChangeListener(){
//			public void stateChanged(ChangeEvent ce) {
//				value4=slider4.getValue();
//			}
//		});
//		add(slider4);
//blue shift
		{
//		slider5 = new JSlider();
//		slider5.setMaximum(250);
//		slider5.setMinimum(0);
//		slider5.setValue(250);
//		slider5.setMajorTickSpacing(50);
//		slider5.setMinorTickSpacing(10);
//		slider5.setPaintTicks(true);
//		slider5.setPaintLabels(true);
//		slider5.addChangeListener(new ChangeListener(){
//			public void stateChanged(ChangeEvent ce) {
//				value5=slider5.getValue();
//			}
//		});
//		add(slider5);
		}
	}
		MouseListener m= new MouseListener() {
			public void mouseReleased(MouseEvent arg0) {
			}
			public void mousePressed(MouseEvent arg0) {
			}
			public void mouseExited(MouseEvent arg0) {
			}
			public void mouseEntered(MouseEvent arg0) {
			}
			public void mouseClicked(MouseEvent me) {
				for (int i=0; i<value; i++)
				{
					addball(me.getX(), me.getY());
				}
			}
		};
		button = new JButton("Inverse");
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae) {
				if(ae.getID() == ActionEvent.ACTION_FIRST)
				{
					for(Ball b: ballz)
					{
						b.invert();
						b.changeColor();
						inverted= !inverted;
					}
				}
			}
		});
		add(button);
		
									//Reset button
//		button2 = new JButton("Reset");
//		button2.addActionListener(new ActionListener(){
//			public void actionPerformed(ActionEvent ae) {
//				if(ae.getID() == ActionEvent.ACTION_FIRST);
//				{
//					for(Ball b: ballz)
//					{
//						b.reset();
//						b.changeColor();
//						reset= !reset;
//					}
//				}
//				
//			}
//		});
//		add(button2);
				
				addMouseListener(m);
				Random r= new Random();
				for (int i=0; i<r.nextInt(50); i+=5)
				{
					ballz.add(new Ball(this));
				}
	}
	public void addball(int x, int y)
	{
		ballz.add(new Ball(x, y, this, inverted, value2));
	}
	public void paintComponent(final Graphics g)
	{
		{
			//Paints Background of the Frame
			super.paintComponent(g);
			if (inverted)
			{
				g.setColor(Color.CYAN);
			}
			else
			{
				g.setColor(Color.black);
			}
			
			g.fillRect( 0,  0, getWidth(), getHeight());
			

			//Moves the Balls
			for(Ball b: ballz)
			{
				b.draw(g);
				b.move();
			}
			
			//Sets the Font Color
			if (inverted)
			{
				g.setColor(Color.black);
			}
			else
			{
				g.setColor(Color.green);
			}
			Font font = new Font("Comic Sans MS", Font.BOLD, 16);
			setFont(font);
				g.drawString("Balls on Click: "+value, 432,65);
				g.drawString("Diameter of Balls: "+value2, 605,65);
				g.drawString(" "+ballz.size(), 20,50);	
//				g.drawString("Red Shft: "+value3, 10, 130);
//				g.drawString("Green Shift: "+value4, 10, 170);
//				g.drawString("Blue Shift: "+value5, 10, 150);
//			g.drawString("Questions: ", 10,420);
//			g.drawString("How do I move the balls to the left on click; they only move to the right -_- ", 10,440);
//			g.drawString("How can I make each new ball a random diamter? (Like if I were to select 20 balls to appear on each click, each one would be random!) ", 10,460);
//			g.drawString("Things I would like to add: Division of balls, a 'clear screen' button (maybe a pause button), ", 10,500);
//			g.drawString("a 'show info' button, balls bouncing off of other balls, and a velocity slider. ", 10,520);
//			g.drawString("Comments: ", 10,580);
//			g.drawString("The colors can only inverse when the amount of balls on the screen is odd (No idea why) ", 10,600);
//			g.drawString("Also, if you know how to make the balls not get caught in the side of the panel, let me know! ", 10,620);
//			g.drawString("Also! If you would like the code for the font, here it is: 'Font font = new Font('SansSerif', Font.ITALIC, 15); setFont(font);    :D ", 10, 640);
		}
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		repaint();
		}
}
