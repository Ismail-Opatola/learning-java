package com.github.ismailopatola.learningjava.fundamentals;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class MyFrame12 extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	DragPanel dragPanel = new DragPanel();

	public MyFrame12() {
		
		this.add(dragPanel);
		this.setTitle("Drag n Drop demo");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 600);
//		this.setLayout(new FlowLayout());
//		this.getContentPane().setBackground(Color.black);
		
		this.setVisible(true);


	}
}
