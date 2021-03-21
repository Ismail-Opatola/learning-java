package com.github.ismailopatola.learningjava.fundamentals;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame11 extends JFrame implements MouseListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel label;
	ImageIcon loveIcon;
	ImageIcon angryIcon;
	ImageIcon sadIcon;
	ImageIcon suprisedIcon;
	ImageIcon funnyIcon;
	
	public MyFrame11() {
		// TODO Auto-generated constructor stub
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 600);
		this.setLayout(null);
//		this.setLayout(new FlowLayout());
		this.getContentPane().setBackground(Color.black);

		suprisedIcon = new ImageIcon("surprised.png");
		loveIcon = new ImageIcon("love.png");
		angryIcon = new ImageIcon("angry.png");
		sadIcon = new ImageIcon("sad.png");
		funnyIcon = new ImageIcon("funny.png");
		
		label = new JLabel();
		label.setBounds(0, 0, 100, 100);
		label.setIcon(loveIcon);
		label.setBackground(Color.red);
		label.setOpaque(true);
		label.addMouseListener(this); // add Mouse event listener to label
		
		this.add(label);
//		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// Invoked when the mouse button has been clicked (pressed and released) on a component
		// System.out.println("You clicked the mouse");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// Invoked when a mouse button has been pressed on a component
		System.out.println("You pressed the mouse");
		label.setBackground(Color.yellow);
		label.setIcon(angryIcon);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// Invoked when a mouse button has been released on a component
		System.out.println("You released the mouse");
		label.setBackground(Color.green);
		label.setIcon(funnyIcon);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Invoked when a mouse enters the area of a component
		System.out.println("You entered the component");
		label.setBackground(Color.blue);
		label.setIcon(suprisedIcon);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Invoked when a mouse exit the area of a component
		System.out.println("You exited the component");
		label.setBackground(Color.red);
		label.setIcon(loveIcon);
	}

}
