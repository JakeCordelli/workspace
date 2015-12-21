package fractals;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class RainbowCircles extends JPanel{
	public void paintComponent(Graphics g){
		Random rn = new Random();
		int R=rn.nextInt(255);
	 	int G=rn.nextInt(255);
	 	int B=rn.nextInt(255);
	 	Color Random= new Color(R, G, B, R);
	 	Color Random2=new Color(B, G, R, B);
	 	Color Random3=new Color (G, B, R, G);
	 	int v=200;
		int kaa=155;
		int le=150;
		int za=125;
		int zi=100;
		int zo=75;
		int j=50;
		int gr=25;
		super.paintComponent(g); 	
		this.setBackground(Random);
	for (int i=0; i<1280; i+=v){
//	g.setColor(Color.BLACK);
//	g.fillOval(i-62, 42, v, v);
//	 g.setColor(Color.BLACK);
//	 g.fillOval(i-62, 342+(v/2), v, v);
	 g.setColor(Color.BLACK);
	 g.fillOval(i-62, 342-(v/2), v, v);
	}
	for (int i=0; i<1280; i+=kaa+45){
	 g.setColor(Color.WHITE);
	 g.fillOval(i-38, 342-(kaa/2), kaa, kaa);
	}
	for (int i=0; i<1280; i+=le+50){
	 g.setColor(Random);
	 g.fillOval(i-35, 342-(le/2), le, le);
	}
	for (int i=0; i<1280; i+=za+75){
	 g.setColor(Random2);
	 g.fillOval(i-22, 342-(za/2), za, za);
	}
	for (int i=0; i<1280; i+=zi+100){
	 g.setColor(Random3);
	 g.fillOval(i-9, 342-(zi/2), zi, zi);
	}
	for (int i=0; i<1280; i+=zo+125){
	 g.setColor(Random);
	 g.fillOval(i+3, 342-(zo/2), zo, zo);
	}
//	for (int i=0; i<1280; i+=j+148){
//	 g.setColor(Random2);
//	 g.fillOval(i+18, 342-(j/2), j, j);
//	}
//	for (int i=0; i<1280; i+=gr+173){
//	 g.setColor(Random3);
//	 g.fillOval(i+30, 342-(gr/2), gr, gr);
//	}
	for( int i = 0; i < 1280; i+=5 )
    {
  	  g.setColor(Random3);
  	  g.drawLine(1280-i, 0+i, 0+i, 685-i);
  	  g.setColor(Random3);
  	  g.drawLine(0+i, 0+i, 1280-i, 685-i);
    }
	try {
		Thread.sleep(100);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	repaint();
	}

}
