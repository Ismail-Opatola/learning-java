package com.github.ismailopatola.learningjava.fundamentals;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel extends JPanel{

	private static final long serialVersionUID = 1L;

	Image image;
	public MyPanel() {
		image = new ImageIcon("illusion.gif").getImage();
		this.setPreferredSize(new Dimension(500,500));
	}
	
	public void paint(Graphics g) {
		
		Graphics2D g2D = (Graphics2D) g;
		
		/**
		 * draw aN Image
		 */
		g2D.drawImage(image, 0, 0, null);
		
		//g2D.setStroke(new BasicStroke(5));

		//g2D.setPaint(Color.blue);
		//g2D.drawLine(0, 0, 500, 500); // draw a line
		
		//g2D.setPaint(Color.green);
		//g2D.drawRect(300, 0, 100, 200); // draw a rectangle

		//g2D.setPaint(Color.green);
		//g2D.fillRect(0, 0, 100, 200); // draw fill rectangle
		
		//g2D.setPaint(Color.orange);
		//g2D.drawOval(100, 0, 100, 100);

		//g2D.setPaint(Color.orange);
		//g2D.fillOval(200, 0, 100, 100);
		
		//g2D.setPaint(Color.yellow); 
		//g2D.drawArc(0, 200, 100, 100, 0, 180); // draw arc/half circle
		
		
		/**
		 * draw a pokemon
		 */
		
		g2D.setPaint(Color.red); 
		g2D.fillArc(0, 0, 100, 100, 0, 180); // draw arc/half circle
		g2D.setPaint(Color.white); 
		g2D.fillArc(0, 0, 100, 100, 180, 180); // draw arc/half circle
		
		/**
		 * draw a triangle
		 */
		g2D.setStroke(new BasicStroke(10));
		g2D.setPaint(Color.green); 
		int[] xPoints = {150, 250, 350};
		int[] yPoints = {300, 150, 300};
		g2D.drawPolygon(xPoints, yPoints, 3);
		g2D.setPaint(Color.yellow); 
		g2D.fillPolygon(xPoints, yPoints, 3);
		
		/**
		 * draw a strings of text
		 */
		g2D.setPaint(Color.magenta); 
		g2D.setFont(new Font("Ink Free", Font.BOLD, 50));
		g2D.drawString("You're a WINNER! :D", 50, 50);
		

		
	}
}
