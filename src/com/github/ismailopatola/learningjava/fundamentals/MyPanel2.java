package com.github.ismailopatola.learningjava.fundamentals;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.Timer;
import javax.swing.JPanel;

public class MyPanel2 extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	final int PANEL_WIDTH = 500;
	final int PANEL_HEIGHT = 500;
	
	Image enemy;	
	Image backgroundImage;
	Timer timer;
	int xVelocity = 10, yVelocity = 5, x = 0, y = 0;
	
	public MyPanel2() {
		this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
		this.setBackground(Color.black);
		enemy = new ImageIcon("angry.png").getImage();
		backgroundImage = new ImageIcon("space.jpg").getImage();
		timer = new Timer(100, this);
		timer.start();
	}
	
	public void paint(Graphics g) {
		super.paint(g); // paint the bg
		
		Graphics2D g2d = (Graphics2D)g; // cast graphics as Graphics2D to take advantage of more options available to us
		
		g2d.drawImage(backgroundImage, 0, 0, null);
		g2d.drawImage(enemy, x, y, null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(x >= PANEL_WIDTH - enemy.getWidth(null) || x < 0) {
			/**
			 * x axis
			 * if enemy is at edge of the panel,
			 * translate opposite direction
			 */
			xVelocity = xVelocity * -1;
		}
		x = x  + xVelocity; // translate right
		
		if(y >= PANEL_HEIGHT - enemy.getHeight(null) || y < 0) {
			/**
			 * y axis
			 * if enemy is at edge of the panel,
			 * translate opposite direction
			 */
			yVelocity = yVelocity * -1;
		}
		y = y  + yVelocity; // translate right
		
		repaint();
	}
}
