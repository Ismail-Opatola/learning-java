package com.github.ismailopatola.learningjava.fundamentals;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{

	/**
	 * use frame as a class
	 */
	private static final long serialVersionUID = 1L;

	public MyFrame() {
		
		this.setTitle("JFrame title goes here"); // sets title of frame
//		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false); // prevent frame from being resized
		this.setSize(620, 420); // x dimension, y dimension of frame
		this.setVisible(true); // make frame visible
		
		ImageIcon image = new ImageIcon("vape_master_illustration.png"); // create image icon
		this.setIconImage(image.getImage()); // change frame icon
		
		this.getContentPane().setBackground(Color.green); // change background color
		this.getContentPane().setBackground(new Color(0xFFFFFF)); // change background color - custom color - using hexadecimal val
		this.getContentPane().setBackground(new Color(255, 55, 255)); // change background color - custom color - using RGB
		
	}
}
