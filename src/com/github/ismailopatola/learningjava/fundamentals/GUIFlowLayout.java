package com.github.ismailopatola.learningjava.fundamentals;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUIFlowLayout {

	public static void main(String[] args) {
		/**
		 * FlowLayout manager
		 * ----------
		 * 
		 * Layout Manager = Defines the natural layout for components 
		 * within a container
		 * 
		 * FlowLayout
		 * ----------
		 * places components in a row, sized at their preferred size.
		 * If the horizontal space in the container is too small,
		 * the FlowLayout class uses the next available row.
		 * 
		 */

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		// frame.setLayout(new FlowLayout(FlowLayout.LEADING)); // FlowLayout(align) - start
		// frame.setLayout(new FlowLayout(FlowLayout.CENTER)); // FlowLayout(align) - default center
		// frame.setLayout(new FlowLayout(FlowLayout.TRAILING)); // FlowLayout(align) - end
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10)); // FlowLayout(align,horizontalGap,verticalGap)
		
//		--------------
//		let's add the buttons to the frame to test flowlayout
		
//		// JButton button1 = new JButton(); 
//		frame.add(new JButton("1")); // same as creating button1 above
//		frame.add(new JButton("2"));
//		frame.add(new JButton("3"));
//		frame.add(new JButton("4")); 
//		frame.add(new JButton("5")); 
//		frame.add(new JButton("6"));
//		frame.add(new JButton("7")); 
//		frame.add(new JButton("8"));
//		frame.add(new JButton("9")); 
		
//		--------------
//		let add the buttons to a panel
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(250,250));
		panel.setBackground(Color.lightGray);
		panel.setLayout(new FlowLayout()); // panel actually uses FlowLayout by default, we just include it for tuts sake
		
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4")); 
		panel.add(new JButton("5")); 
		panel.add(new JButton("6"));
		panel.add(new JButton("7")); 
		panel.add(new JButton("8"));
		panel.add(new JButton("9")); 
		
		frame.add(panel);
		
//		--------------
		frame.setVisible(true);
	}

}
