package com.github.ismailopatola.learningjava.fundamentals;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame10 extends JFrame implements KeyListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JLabel label;
	ImageIcon rocketIcon;

	public MyFrame10() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(null); // set to no layout manager, we're gonna be manually moving the component within the frame by using some key-strokes
		
		rocketIcon = new ImageIcon("surprised.png");
		
		label = new JLabel();
		label.setBounds(0, 0, 30, 30);
		label.setIcon(rocketIcon);
		// label.setBackground(Color.red);
		// label.setOpaque(true);
		
		this.getContentPane().setBackground(Color.black);
		
//		this.pack();
		this.add(label);
		this.addKeyListener(this); // add key event listener
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// KeyTyped = Invoked when a key is typed. Uses KeyChar, char output
		
		switch (e.getKeyChar()) {
			case 'a': label.setLocation(label.getX() - 10, label.getY()); // move left 10px
			break;
			case 'w': label.setLocation(label.getX(), label.getY() - 10); // move up
			break;
			case 's': label.setLocation(label.getX(), label.getY() +10); // move down
			break;
			case 'd': label.setLocation(label.getX() + 10, label.getY()); // move right
			break;
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// KeyPressed = Invoked when a pysical key is preseed down. Uses KeyCode, int output
		switch (e.getKeyCode()) {
		case 37: label.setLocation(label.getX() - 10, label.getY()); // move left 10px
		break;
		case 38: label.setLocation(label.getX(), label.getY() - 10); // move up
		break;
		case 40: label.setLocation(label.getX(), label.getY() +10); // move down
		break;
		case 39: label.setLocation(label.getX() + 10, label.getY()); // move right
		break;
	}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// KeyReleased = called whenever a button is released
		System.out.println("You released key char: " + e.getKeyChar());
		System.out.println("You released key code: " + e.getKeyCode());
		
	}
}
