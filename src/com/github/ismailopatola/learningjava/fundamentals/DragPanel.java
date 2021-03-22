package com.github.ismailopatola.learningjava.fundamentals;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class DragPanel extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ImageIcon imageIcon = new ImageIcon("funny.png");
	final int WIDTH = imageIcon.getIconWidth();
	final int HEIGHT = imageIcon.getIconHeight();
	Point imageCorner;
	Point prevPoint;
	
	public DragPanel() {
		
		imageCorner = new Point(0,0);
		ClickListener clickListener = new ClickListener();
		DragListener  dragListener = new DragListener();
		this.addMouseListener(clickListener);
		this.addMouseMotionListener(dragListener);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		imageIcon.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
	}
	
	private class ClickListener extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			prevPoint = e.getPoint(); // update previous point to wherever we click
		}
	}
	
	private class DragListener extends MouseMotionAdapter {
		public void mouseDragged(MouseEvent e) {
			Point currentPoint = e.getPoint();
			imageCorner.translate(
				(int)(currentPoint.getX() - prevPoint.getX()), 
				(int)(currentPoint.getY() - prevPoint.getY())
			);
			prevPoint = currentPoint;
			repaint();
		}
	}
}
