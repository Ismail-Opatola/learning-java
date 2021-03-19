package com.github.ismailopatola.learningjava.fundamentals;

//import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUIPanels {

	public static void main(String[] args) {
		/**
		 * JPanels in java
		 * ------
		 * a GUI component that functions as a container to hold other components
		 * 
		 */
		
		ImageIcon icon = new ImageIcon("thumbs_up.png");
		
		JLabel label = new JLabel();
		label.setText("Hi");
		label.setIcon(icon);
		//label.setVerticalAlignment(JLabel.TOP); // if using border layout
		//label.setHorizontalAlignment(JLabel.CENTER);  // if using border layout
		label.setBounds(0, 0, 75, 75); // not using border layout
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0,0,250,250);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250,0,250,250);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0,250,500,250);
//		greenPanel.setLayout(new BorderLayout());  // using border layout
		greenPanel.setLayout(null); // label.setBounds(0, 0, 75, 75)
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750, 750);
		frame.setVisible(true);
		
		greenPanel.add(label);
		
		
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
		
//		frame.pack();
	}

}
