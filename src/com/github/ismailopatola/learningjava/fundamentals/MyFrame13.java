package com.github.ismailopatola.learningjava.fundamentals;

import javax.swing.JFrame;

public class MyFrame13 extends JFrame {
	
	MyPanel panel;

	private static final long serialVersionUID = 1L;

	public MyFrame13() {
		
		panel = new MyPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	

}
