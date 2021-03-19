package com.github.ismailopatola.learningjava.fundamentals;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class GUILabel {

	public static void main(String[] args) {
		/**
		 * JLabel = a GUI display area for a string of text, an image, or both
		 * -------
		 * 
		 */
		
		ImageIcon image = new ImageIcon("illusion.gif"); // create image icon
		Border border = BorderFactory.createLineBorder(Color.yellow);

		JLabel label = new JLabel(); // create a label
		// JLabel label = new JLabel("Bro, do you even code?"); // works too
		label.setText("Bro, do you even code?"); // set text of label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of imageicon
		label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTER, BOTTOM of imageicon
		label.setForeground(Color.yellow); // set text color
		label.setFont(new Font("MV boli", Font.PLAIN, 20));
		label.setIconTextGap(2); // gap btw text and imageicon
		
		label.setBackground(Color.black); // background color
		label.setOpaque(true);
		
		label.setBorder(border); // border
		
		label.setVerticalAlignment(JLabel.CENTER); // Set vertical position of icon + text within the label
		label.setHorizontalAlignment(JLabel.CENTER); // Set horizontal position of icon + text within the label
		//label.setBounds(100, 0, 250, 250); // set x,y position within frame as well as dimension
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(500, 600);
		
		//frame.setLayout(null);
		
		frame.setVisible(true);
		
		frame.isResizable();
		
		frame.add(label);
		
		frame.pack(); // auto fluid and resizable, no need to call setSize, setLayout, label.setBounds
		
		
	}

}
