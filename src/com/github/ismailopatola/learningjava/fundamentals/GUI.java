package com.github.ismailopatola.learningjava.fundamentals;

//import java.awt.Color;
//
//import javax.swing.ImageIcon;
//import javax.swing.JFrame;

public class GUI {

	public static void main(String[] args) {
		/**
		 * JFrame = a GUI window to add components to
		 * ------
		 * 
		 * 2 Ways of creating a frame
		 * 
		 */
		
		/**		
		 * Ex. 1
		 */

		/*
		JFrame frame = new JFrame(); // create frame
		
		frame.setTitle("JFrame title goes here"); // sets title of frame
//		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false); // prevent frame from being resized
		frame.setSize(620, 420); // x dimension, y dimension of frame
		frame.setVisible(true); // make frame visible
		
		ImageIcon image = new ImageIcon("vape_master_illustration.png"); // create image icon
		frame.setIconImage(image.getImage()); // change frame icon
		
		frame.getContentPane().setBackground(Color.green); // change background color
		frame.getContentPane().setBackground(new Color(255, 55, 255)); // change background color - custom color - using RGB
		frame.getContentPane().setBackground(new Color(0xFFFFFF)); // change background color - custom color - using hexadecimal val
	*/
		
		/**
		 * E.x 2
		 */
		
//		MyFrame frame = new MyFrame();
		new MyFrame(); // call it like this, if you don't plan on using it as a var
	}

}
