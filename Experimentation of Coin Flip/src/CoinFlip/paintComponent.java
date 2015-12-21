package CoinFlip;
import java.awt.Polygon;
import java.awt.Color;
import java.util.Random;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Panel;
import java.util.Random;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.SliderUI;
public class paintComponent extends JPanel{
		public void paintComponent(Graphics g)
		{
			Random rn = new Random();
			int x=rn.nextInt(1280);
			int y=rn.nextInt(800);
//			int a1= rn.nextInt(500);
//			int b1=rn.nextInt(500);
//			int c1=rn.nextInt(500);
//			int d1=rn.nextInt(500);
//			int e1=rn.nextInt(500);
//			int a2= rn.nextInt(500);
//			int b2=rn.nextInt(500);
//			int c2=rn.nextInt(500);
//			int d2=rn.nextInt(500);
//			int e2=rn.nextInt(500);
//			int a3=rn.nextInt(500);
//			int b3=rn.nextInt(500);
//			int c3=rn.nextInt(500);
//			int d3=rn.nextInt(500);
//			int e3=rn.nextInt(500);
			int R=rn.nextInt(255);
		 	int G=rn.nextInt(255);
		 	int B=rn.nextInt(255);
		 	int Y=rn.nextInt(255);
		 	int Z=rn.nextInt(255);
		 	int z=rn.nextInt(1280);
		 	int w=rn.nextInt(1280);
		 	Color Random= new Color(R, G, B, R);
		 	Color Random2=new Color(B, G, R, B);
		 	Color Random3=new Color (G, B, R, G);
		 	
		 	
		 											//Random Polygons
//			for (int i = 0; i < 1000; i+=5){
//				PolygonObject Poly1 = new PolygonObject(new int[] {i+x,i+y,0,i+y,i+y}, new int[] {i+x,i+y,1600,i+y,i+y}, Color.black);
//				g.setColor(Color.CYAN);
//				Poly1.drawPolygon(g);
//			}
//				for (int i = 0; i < 1000; i+=5){
//					PolygonObject Poly1 = new PolygonObject(new int[] {1280,x,x,x,x}, new int[] {800,x,x,x,x}, Color.black);
//					g.setColor(Color.BLACK);
//					Poly1.drawPolygon(g);
//				}
//			for (int i = 0; i < 300; i+=50){
//				PolygonObject Poly1 = new PolygonObject(new int[] {1280, i+d1, i+c1, i+b1, i+a1}, new int[] {i+d1, i+c1, i+b1, i+a1, 800}, Color.black);
//				g.setColor(Random);
//				Poly1.drawPolygon(g);
//			}
			
			super.paintComponent(g); 	
			this.setBackground(Random);
			
			
			
												//Crazy Curve Lines
			for (int i = 0; i < 1280; i+=10){
				g.setColor(Random2);
				g.drawLine(w,i,i,y);
				g.setColor(Random3);
				g.drawLine(w,i,i,y);
			}
			for (int i = 0; i<1280; i+=10){
				g.setColor(Random2);
				g.drawLine(i,x,z,i);
				g.setColor(Random3);
				g.drawLine(i,z,x,i);
			}
			
			
													//Circles and Apple Pie
//			g.setColor(Random);
//			g.fillOval(x, y, 100, 100);
//				g.setColor(Random);
//				g.fillOval(x-300, y, B, R);
//				g.setColor(Random);
//				g.fillOval(x, y-100, G, Z);
//				g.setColor(Random);
//				g.fillOval(y, x, Y, G);
//				g.setColor(Random);
//				g.fillRect(y+120, x+120, R, G);
				
														//Flashing Fonts
//				Font newFont = new Font("Serif", Font.BOLD, Y);
//			g.setColor(Random);
//			g.setFont(newFont);
//			g.drawString("Apple Pie", x-50, y-100);
//			Font newFont2 = new Font("Comic Sans MS", Font.BOLD, Z);
//			Font newFont3 = new Font("Helvetica", Font.BOLD, Z);
//		g.setColor(Random3);
//		g.setFont(newFont2);
//		g.drawString("Apple Pie", x-100, y-400);
//		g.setColor(Random2);
//		g.setFont(newFont3);
//		g.drawString("Apple Pie", x+100, y+400);
			
			
			
													//Makes a pyramid
//	    int linesToDraw = 200;
//	    int width = getWidth(); 
//	    int height = getHeight(); 
//	    int number, y1, x1, dy, dx;
//	      x1 = 0;
//	      y1 = height;
//	      number = 400;
//	      dx = width / number;
//	      dy = height / number;
//	      for( int i = 1; i < number; i++ ){
//		        x1 += dx;
//		        y1 -= dy;
//		        g.setColor(Color.WHITE);
//		        g.drawLine( 1280, 685, y1, x1 );
//		        g.setColor(Color.BLACK);
//		        g.drawLine( 0, 685, y1, x1 );
//		      }
			
											//Origin Point/Rainbow
//			int v=200;
//			int kaa=155;
//			int le=150;
//			int za=125;
//			int zi=100;
//			int zo=75;
//			int j=50;
//			int gr=25;
//			for (int i=0; i<1280; i++)
//			{
//			 g.setColor(Color.BLACK);
//			 g.fillOval(640-(v/2), 342-(v/2), v, v);
//			 
//			 g.setColor(Color.WHITE);
//			 g.fillOval(640-(kaa/2), 342-(kaa/2), kaa, kaa);
//			 
//			 g.setColor(Color.RED);
//			 g.fillOval(640-(le/2), 342-(le/2), le, le);
//			 
//			 g.setColor(Color.ORANGE);
//			 g.fillOval(640-(za/2), 342-(za/2), za, za);
//			 
//			 g.setColor(Color.YELLOW);
//			 g.fillOval(640-(zi/2), 342-(zi/2), zi, zi);
//			 
//			 g.setColor(Color.GREEN);
//			 g.fillOval(640-(zo/2), 342-(zo/2), zo, zo);
//			 
//			 g.setColor(Color.BLUE);
//			 g.fillOval(640-(j/2), 342-(j/2), j, j);
//			 
//			 g.setColor(Color.magenta);
//			 g.fillOval(640-(gr/2), 342-(gr/2), gr, gr);
//			}
			 
	      
	      
                           					//Very Strange Concentric Design
			
		

//		for( int i = 0; i < 1280; i+=10 )
//	      {
//	    	  g.setColor(Random3);
//	    	  g.drawLine(1280-i, 0+i, 0+i, 685-i);
//	    	  g.setColor(Random3);
//	    	  g.drawLine(0+i, 0+i, 1280-i, 685-i);
//	      }
	      
	} 
		
	}