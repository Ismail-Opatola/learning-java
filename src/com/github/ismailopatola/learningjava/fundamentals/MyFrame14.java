package com.github.ismailopatola.learningjava.fundamentals;

import javax.swing.JFrame;

public class MyFrame14 extends JFrame {

 private static final long serialVersionUID = 1L;
 MyPanel2 panel;
	
 public MyFrame14() {
	 
	 panel = new MyPanel2();
	 
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 this.add(panel);
	 this.pack();
	 this.setLocationRelativeTo(null); // allow the frame to appear in the middle of your computer screen
	 this.setVisible(true);
 }
}
