package fractals;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class FractalCode extends JPanel{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Random rn = new Random();
		int x=rn.nextInt(1280);
		int y=rn.nextInt(1280);
		int w=rn.nextInt(1280);
		int z=rn.nextInt(1280);
//		g.drawLine(x,y,y,x);
//		g.drawLine(y+100,x+100,x,y);
		
	
		
		int R=rn.nextInt(255);
	 	int G=rn.nextInt(255);
	 	int B=rn.nextInt(255);
	 	int Y=rn.nextInt(255);
	 	int Z=rn.nextInt(255);
		Color Random= new Color(R, G, B, R);
	 	Color Random2=new Color(B, G, R, B);
	 	Color Random3=new Color (G, B, R, G);

//		for (int i = 0; i < 1280; i+=30){
////			g.setColor(Random2);
////			g.drawLine(w,i,i,y);
////			g.setColor(Random2);
////			g.drawLine(w,i,i,y);
//		}
//		for (int i = 0; i <1280; i+=40){
//			g.setColor(Random2);
//			g.drawLine(i,x,z,i);
//			g.setColor(Random2);
//			g.drawLine(i,z,x,i);
//		}
		{
//Makes a pyramid
//		    super.paintComponent(g);

		    int linesToDraw = 200;
		    int width = getWidth(); 
		    int height = getHeight(); 
		    int number, y1, x1, dy, dx;
		      x1 = 0;
		      y1 = height;
		      number = 400;
		      dx = width / number;
		      dy = height / number;
		      for( int i = 1; i < number; i++ )
		      {
		        x1 += dx;
		        y1 -= dy;
		        g.drawLine( 1280, 700, y1, x1 );
		        g.drawLine( 0, 700, y1, x1 );
		} 
			
			
			
//			g.setColor(Random2);
//			g.drawLine(x+1280,i,i,z);
//			g.setColor(Random2);
//			g.drawLine(z+1280,i,i,x);
			
			
			
//			g.drawLine(y,x,i,z);
//			g.setColor(Random2);
		
		
		this.setBackground(Random);
		}
	}

}
